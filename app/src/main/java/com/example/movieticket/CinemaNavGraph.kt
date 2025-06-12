package com.example.movieticket

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.movieticket.screens.Buy.BuyScreen
import com.example.movieticket.screens.contentsScreen.DetailsScreen
import com.example.movieticket.screens.home.HomeScreen

@Composable
fun CinemaNavGraph(modifier: Modifier = Modifier, navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route, modifier =modifier) {
        composable(Screen.HomeScreen.route) { HomeScreen(navController) }
        composable(Screen.BuyScreen.route) { BuyScreen(navController) }
        composable(Screen.ContentScreen.route) { DetailsScreen(navController) }
    }
}