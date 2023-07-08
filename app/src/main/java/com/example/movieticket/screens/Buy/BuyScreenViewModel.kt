package com.example.movieticket.screens.Buy


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.movieticket.UiStates.SeatUiState
import com.example.movieticket.screens.Buy.SeatsUiModel
import com.example.movieticket.ui.theme.Orange
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SecondScreenViewModel : ViewModel() {
    private val _state = MutableStateFlow(0)
    val state = _state.asStateFlow()

    private val _seatsFakeState = MutableStateFlow(SeatsUiModel())
    val seatsFakeState = _seatsFakeState.asStateFlow()


    fun onSeatClick(id: Int, index: Int) {
        val newState = _seatsFakeState.value
        newState.seats[index].let {
            if (it.RightItemUiState.id == id) it.RightItemUiState = seatChange(it.RightItemUiState)
            else it.leftItemUiState = seatChange(it.leftItemUiState)
        }
        _seatsFakeState.update {
            newState
        }

    }


    private fun seatChange(seat: SeatUiState): SeatUiState {

        if (seat.isSelected) {
            seat.Available = true
            seat.isSelected = false
        } else if (seat.Available) {
            seat.isSelected = true
        }
        return seat
    }

    fun onBackClick(navController: NavController) {
        navController.popBackStack()
    }

}