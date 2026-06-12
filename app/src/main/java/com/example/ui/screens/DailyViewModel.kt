// Tanggal Pengerjaan: 2026-06-12
// NIM: 10121913
// Nama: Arya Adriansyah
// Kelas: IF-9/K

package com.example.ui.screens

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.ActivityRepository
import com.example.data.AppDatabase
import com.example.data.DailyActivity
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class DailyViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: ActivityRepository

    init {
        val database = AppDatabase.getDatabase(application)
        repository = ActivityRepository(database.activityDao())
        
        viewModelScope.launch {
            repository.populateDataJikaKosong()
        }
    }

    val activities: StateFlow<List<DailyActivity>> = repository.allActivities
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )
}
