// Tanggal Pengerjaan: 2026-06-12
// NIM: 10121913
// Nama: Arya Adriansyah
// Kelas: IF-9/K

package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ui.screens.MainScreen
import com.example.ui.screens.SplashScreen
import com.example.ui.screens.WalkthroughScreen
import com.example.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      MyApplicationTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
          val navController = rememberNavController()
          NavHost(navController = navController, startDestination = Screen.Splash.route) {
            composable(Screen.Splash.route) {
              SplashScreen(onNavigateToWalkthrough = {
                navController.navigate(Screen.Walkthrough.route) {
                  popUpTo(Screen.Splash.route) { inclusive = true }
                }
              })
            }
            composable(Screen.Walkthrough.route) {
              WalkthroughScreen(onFinish = {
                navController.navigate(Screen.Main.route) {
                  popUpTo(Screen.Walkthrough.route) { inclusive = true }
                }
              })
            }
            composable(Screen.Main.route) {
              MainScreen()
            }
          }
        }
      }
    }
  }
}
