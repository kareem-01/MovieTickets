package com.example.movieticket.screens.Buy

import com.example.movieticket.UiStates.SeatUiState
import com.example.movieticket.UiStates.BuyScreenGridItemUiState

data class SeatsUiModel(
    val seats: List<BuyScreenGridItemUiState> = seatsFakeData,
)

private val seatsFakeData = listOf(
    BuyScreenGridItemUiState(
        SeatUiState(isTaken = true,id = 1), SeatUiState(id = 2)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(isTaken = true,id = 3), SeatUiState(id = 4)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(isTaken = true,id = 5), SeatUiState(isTaken = true,id = 6)
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
        SeatUiState(id = 13), SeatUiState(isTaken = true,id = 14)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 15), SeatUiState(id = 16)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 17), SeatUiState(id = 18)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(isTaken = true,id = 19), SeatUiState(isTaken = true,id = 20)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(isTaken = true,id = 21), SeatUiState(id = 21)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(isTaken = true,id = 22), SeatUiState(id = 23)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 24), SeatUiState(id = 25)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(isTaken = true,id = 26), SeatUiState(isTaken = true,id = 27)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 28), SeatUiState(id = 29)
    ),
    BuyScreenGridItemUiState(
        SeatUiState(id = 30), SeatUiState(id = 31)
    ),
)