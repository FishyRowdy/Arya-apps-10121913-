// Tanggal Pengerjaan: 2026-06-12
// NIM: 10121913
// Nama: Arya Adriansyah
// Kelas: IF-9/K

package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onNavigateToWalkthrough: () -> Unit) {
    LaunchedEffect(key1 = true) {
        delay(2000L)
        onNavigateToWalkthrough()
    }
    
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(com.example.ui.theme.SleekBackground),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .background(com.example.ui.theme.SleekAccent),
                contentAlignment = Alignment.Center
            ) {
                Text("AA", fontWeight = FontWeight.Bold, fontSize = 32.sp, color = com.example.ui.theme.SleekBackground)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Arya Apps",
                color = com.example.ui.theme.SleekTextPrimary,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 2.sp
            )
        }
    }
}
