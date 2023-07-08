package com.example.movieticket.UiStates

data class BuyScreenGridItemUiState(
    var leftItemUiState: SeatUiState = SeatUiState(),
    var RightItemUiState: SeatUiState = SeatUiState(),
)
