package com.example.movieticket

sealed class Screen(val route: String) {
    object HomeScreen : Screen("HomeScreen")
    object ContentScreen : Screen("ContentScreen")
    object BuyScreen : Screen("BuyScreen")
}