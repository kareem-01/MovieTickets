package com.example.movieticket.screens.Buy

import com.example.studycompose.UiStates.SeatUiState
import com.example.studycompose.UiStates.BuyScreenGridItemUiState

data class SeatsUiModel(
    val seats: List<BuyScreenGridItemUiState> = seatsFakeData,
)

private val seatsFakeData = listOf(
    BuyScreenGridItemUiState(
        SeatUiState(id = 1), SeatUiState(id = 2)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 3), SeatUiState(id = 4)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 5), SeatUiState(id = 6)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 7), SeatUiState(id = 8)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 9), SeatUiState(id = 10)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 11), SeatUiState(id = 12)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 13), SeatUiState(id = 14)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 15), SeatUiState(id = 16)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 17), SeatUiState(id = 18)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 19), SeatUiState(id = 20)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 21), SeatUiState(id = 21)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 22), SeatUiState(id = 23)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 24), SeatUiState(id = 25)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 26), SeatUiState(id = 27)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 28), SeatUiState(id = 29)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 30), SeatUiState(id = 31)
    ),
)