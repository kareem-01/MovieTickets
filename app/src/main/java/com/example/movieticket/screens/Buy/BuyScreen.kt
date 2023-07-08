package com.example.movieticket.screens.Buy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.movieticket.UiStates.SeatUiState
import com.example.movieticket.UiStates.BuyScreenGridItemUiState
import com.example.movieticket.composable.BuyButton
import com.example.movieticket.composable.CalenderItem
import com.example.movieticket.composable.MovieTags
import com.example.movieticket.screens.Buy.composables.SecondScreenTop
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale


@Composable
fun BuyScreen(
    navController: NavController,
    viewModel: SecondScreenViewModel = hiltViewModel(),
) {
    val state by viewModel.seatsFakeState.collectAsState()

    val seats = remember {
        mutableStateOf(state.seats)
    }
    val days = getNextSevenDays()

    BuyContent(
        items = seats,
        days = days,
        onClickBack = {viewModel.onBackClick(navController)} ,
        onSeatClick =
        viewModel::onSeatClick
    )
}

@Composable
fun BuyContent(
    items: MutableState<List<BuyScreenGridItemUiState>>,
    onClickBack: () -> Unit,
    onSeatClick: (seat: Int, index: Int) -> Unit,
    days: List<String>,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Black)
    ) {
        SecondScreenTop(items, onBack = onClickBack, onSeatClick = onSeatClick)

        Column(
            modifier = Modifier
                .background(
                    Color.White,
                    RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
                )
                .fillMaxWidth()
                .fillMaxHeight(1f)
        )
        {
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                contentPadding = PaddingValues(16.dp)
            ) {

                days.forEach { day ->
                    item {
                        CalenderItem(dayNumber = day.drop(4), day = day.take(3))
                    }

                }
            }
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                contentPadding = PaddingValues(16.dp)
            ) {
                items(hours.size) { time ->
                    MovieTags(tag = hours[time])
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
            ) {
                Column(Modifier.padding(start = 8.dp)) {
                    Text(text = "$ 100.00")
                    Text(text = "4 tickets")
                }
                Spacer(modifier = Modifier.weight(1f))
                BuyButton(title = "Buy tickets", {})
            }
        }
    }

}

val hours = listOf(
    "10:00",
    "12:30",
    "15:30",
    "18:30",
    "21:30",
    "24:30",
    "3:30",
    "6:60",
)

private fun getNextSevenDays(): List<String> {
    val calendar = Calendar.getInstance()
    val dateFormat = SimpleDateFormat("EEE,dd", Locale.ENGLISH)
    val daysList = mutableListOf<String>()

    for (i in 1..30) {
        val formattedDate = dateFormat.format(calendar.time)
        daysList.add(formattedDate)
        calendar.add(Calendar.DAY_OF_MONTH, 1)
    }

    return daysList
}

@Preview
@Composable
private fun Preview() {


}