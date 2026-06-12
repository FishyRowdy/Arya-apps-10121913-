// Tanggal Pengerjaan: 2026-06-12
// NIM: 10121913
// Nama: Arya Adriansyah
// Kelas: IF-9/K

package com.example.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "daily_activities")
data class DailyActivity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String,
    val imageUrl: String = "" // Dummy placeholder
)
