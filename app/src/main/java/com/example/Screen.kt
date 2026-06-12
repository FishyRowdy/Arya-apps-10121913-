// Tanggal Pengerjaan: 2026-06-12
// NIM: 10121913
// Nama: Arya Adriansyah
// Kelas: IF-9/K

package com.example

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Walkthrough : Screen("walkthrough")
    object Main : Screen("main")
    object Home : Screen("home")
    object Daily : Screen("daily")
    object Gallery : Screen("gallery")
    object Media : Screen("media")
    object Profile : Screen("profile")
}
