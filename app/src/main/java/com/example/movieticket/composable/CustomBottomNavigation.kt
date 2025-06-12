package com.example.movieticket.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.movieTicket.composable.ImageButton
import com.example.movieticket.R
import com.example.movieticket.Screen
import com.example.movieticket.ui.theme.Orange


@Composable
fun CustomBottomNavigation(navController: NavHostController) {
    val current = navController.currentBackStackEntryAsState()
    val selectedScreen = current.value?.destination?.route ?: Screen.HomeScreen.route
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(Color.White)
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ImageButton(
            painter = R.drawable.video_play,
            modifier = Modifier.size(48.dp),
            iconTint = if (selectedScreen == Screen.HomeScreen.route) Color.White else Color.Gray,
            backgroundColor = if (selectedScreen == Screen.HomeScreen.route) Orange else Color.Transparent
        ) {
            navController.navigate(Screen.HomeScreen.route)
        }
        ImageButton(
            painter = R.drawable.search_normal,
            modifier = Modifier.size(48.dp),
            iconTint = Color.Gray,
            backgroundColor = Color.Transparent
        ) {}
        ImageButton(
            painter = R.drawable.ticket,
            modifier = Modifier.size(48.dp),
            iconTint = if (selectedScreen == Screen.BuyScreen.route) Color.White else Color.Gray,
            backgroundColor = if (selectedScreen == Screen.BuyScreen.route) Orange else Color.Transparent
        ) {
            navController.navigate(Screen.BuyScreen.route)
        }
        ImageButton(
            painter = R.drawable.profile,
            modifier = Modifier.size(48.dp),
            iconTint = Color.Gray,
            backgroundColor = Color.Transparent
        ) {}
    }
}