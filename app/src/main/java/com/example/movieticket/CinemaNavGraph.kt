package com.example.movieticket

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.movieticket.screens.contentsScreen.DetailsScreen
import com.example.movieticket.screens.home.HomeScreen
import com.example.movieticket.screens.Buy.BuyScreen

@Composable
fun CinemaNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route) { HomeScreen(navController) }
        composable(Screen.BuyScreen.route) { BuyScreen(navController) }
        composable(Screen.ContentScreen.route) { DetailsScreen(navController) }
    }
}