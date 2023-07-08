package com.example.movieticket.screens.Buy


import android.util.Log
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.movieticket.UiStates.SeatUiState
import com.example.movieticket.composable.Seats
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
        newState.copy().seats[index].let {
            if (it.RightItemUiState.id == id) it.RightItemUiState = seatChange(it.RightItemUiState)
            else it.leftItemUiState = seatChange(it.leftItemUiState)
        }
        _seatsFakeState.update {
            newState
        }
        Log.i("ITEM","${_seatsFakeState.value.seats[index].leftItemUiState}")
    }

fun setColor(index:Int,seat:Seats):Color{
    _seatsFakeState.value.seats[index].let {item ->


    return when(seat) {
        Seats.LeftSeat -> return getColor(item.leftItemUiState)
    Seats.RightSeat ->return getColor(item.RightItemUiState)
    }
    }
}
    private fun getColor(item:SeatUiState):Color{
        return if (item.Available)
            White
        else if (item.isSelected)
            Orange
        else
            DarkGray
    }
    private fun seatChange(seat: SeatUiState): SeatUiState {
        return  if (!seat.isTaken) {
            seat.copy(isSelected =!seat.isSelected , Available = !seat.Available)
        }
       else{
           seat
            }
    }

    fun onBackClick(navController: NavController) {
        navController.popBackStack()
    }

}