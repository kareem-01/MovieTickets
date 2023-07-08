package com.example.movieticket.screens.Buy.composables


import SeatItem
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movieticket.R
import com.example.movieticket.UiStates.SeatUiState
import com.example.movieticket.UiStates.BuyScreenGridItemUiState
import com.example.movieticket.composable.ExitButton
import com.example.movieticket.composable.SelectionItem
import com.example.movieticket.composable.SpacerVertical8
import com.example.movieticket.ui.theme.Orange

@Composable
fun SecondScreenTop(
    items: MutableState<List<BuyScreenGridItemUiState>>,
    onBack: () -> Unit,
    onSeatClick: (seat: Int,index:Int) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.7f)
            .background(color = Color.Black)
            .padding(16.dp),

        ) {

        ExitButton(onClick = onBack)
        SpacerVertical8()
        Image(
            painter = painterResource(id = R.drawable.cinema),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            contentScale = ContentScale.FillWidth
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier
                .padding(top = 32.dp, bottom = 16.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            contentPadding = PaddingValues(vertical = 8.dp)

        ) {

            items(15) { index ->
                Box(Modifier.padding(bottom = 8.dp)) {
                    when (index) {
                        0, 3, 6, 9, 12 -> SeatItem(
                            leftState = items.value[index].leftItemUiState,
                            rightState = items.value[index].RightItemUiState,
                            onItemClick = onSeatClick,
                            angle = 10f,
                            modifier = Modifier.offset(x = 17.dp),
                            index = index
                        )

                        2, 5, 8, 11, 14 -> SeatItem(
                            leftState = items.value[index].leftItemUiState,
                            rightState = items.value[index].RightItemUiState,
                            onItemClick = onSeatClick,
                            angle = -10f,
                            modifier = Modifier.offset(x = 17.dp),
                            index
                        )

                        else -> SeatItem(
                            leftState = items.value[index].leftItemUiState,
                            rightState = items.value[index].RightItemUiState,
                            onItemClick = onSeatClick,
                            modifier = Modifier.offset(y = 10.dp, x = 17.dp),
                            index = index
                        )
                    }
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 50.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            SelectionItem(
                string = "Available",
                modifier = Modifier.background(color = Color.White, shape = CircleShape)
            )
            SelectionItem(
                string = "Taken",
                modifier = Modifier.background(color = Color.DarkGray, shape = CircleShape)
            )
            SelectionItem(
                string = "Available",
                modifier = Modifier.background(color = Orange, shape = CircleShape)
            )

        }
    }
}


@Preview
@Composable
private fun Preview() {

}