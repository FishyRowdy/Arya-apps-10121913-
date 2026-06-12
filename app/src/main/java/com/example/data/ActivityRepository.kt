// Tanggal Pengerjaan: 2026-06-12
// NIM: 10121913
// Nama: Arya Adriansyah
// Kelas: IF-9/K

package com.example.data

import kotlinx.coroutines.flow.Flow

class ActivityRepository(private val activityDao: DailyActivityDao) {
    val allActivities: Flow<List<DailyActivity>> = activityDao.getAllActivities()

    suspend fun populateDataJikaKosong() {
        if (activityDao.getCount() == 0) {
            val dummyData = listOf(
                DailyActivity(title = "Wake Up & Coffee", description = "Starting the day with a hot cup of coffee."),
                DailyActivity(title = "Morning Commute", description = "Heading to the EPC site office."),
                DailyActivity(title = "EPC Project Meeting", description = "Discussing procurement and construction updates."),
                DailyActivity(title = "Lunch Break", description = "Eating lunch with colleagues."),
                DailyActivity(title = "Site Inspection", description = "Checking the construction progress outdoors."),
                DailyActivity(title = "Gaming Session", description = "Relaxing at home playing some strategy games."),
                DailyActivity(title = "Deep-sea Reading", description = "Reading articles about mysterious ocean creatures.")
            )
            activityDao.insertAll(dummyData)
        }
    }
}
