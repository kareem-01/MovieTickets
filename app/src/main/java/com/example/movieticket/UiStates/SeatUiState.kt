package com.example.movieticket.UiStates

data class SeatUiState(
    var isSelected: Boolean = false,
    var isTaken: Boolean = false,
    var Available: Boolean = true,
    var id:Int = 0
)
