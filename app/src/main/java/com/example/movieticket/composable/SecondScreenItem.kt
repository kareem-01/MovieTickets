import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movieticket.R
import com.example.movieticket.UiStates.SeatUiState
import com.example.movieticket.composable.Seats
import com.example.movieticket.ui.theme.Orange


@Composable
fun SeatItem(
    leftState: SeatUiState,
    rightState: SeatUiState,
    onItemClick: (seat: Int,index:Int) -> Unit,
    angle: Float = 0f,
    modifier: Modifier = Modifier,
    index:Int,
    setColor:(index:Int,seat:Seats)->Color,
) {
    LaunchedEffect(
        leftState.isSelected,
        leftState.isSelected,
        rightState.Available,
        rightState.isSelected,

    ) {


    }
val leftColor by remember {
    mutableStateOf(Color)
}
val rightColor by remember {
    mutableStateOf(Color)
}


    Box(
        modifier = modifier
            .graphicsLayer { rotationZ = angle }
            .clip(RoundedCornerShape(16.dp))
            .width(90.dp)
            .height(40.dp),
        contentAlignment = Alignment.Center,


        ) {
        Icon(
            painter = painterResource(id = R.drawable.chair_place_holder),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            tint = White
        )
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 0.dp, bottom = 8.dp, start = 8.dp, end = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Icon(
                painter = painterResource(id = R.drawable.seat_icon),
                contentDescription = null,
                tint = setColor(index,Seats.LeftSeat),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .clickable { onItemClick(leftState.id, index) }

            )
            Icon(
                painter = painterResource(id = R.drawable.seat_icon),
                contentDescription = null,
                tint =  setColor(index,Seats.RightSeat) ,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .clickable { Log.i("leftClicked", "$leftState") }
            )
        }
    }
}


fun createGridItem(): ImageVector {
    return ImageVector.Builder(
        defaultHeight = 24.dp,
        defaultWidth = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).run {
        addPath(
            pathData = addPathNodes(
                "M11.963,1.25H12.037C13.127,1.25 13.997,1.25 14.697,1.315C15.416,1.382 16.03,1.522 16.582,1.849C17.244,2.241 17.792,2.804 18.171,3.478C18.487,4.038 18.622,4.66 18.687,5.393C18.75,6.108 18.75,6.998 18.75,8.118V8.498C19.097,8.339 19.484,8.25 19.895,8.25C21.517,8.25 22.75,9.638 22.75,11.246V15.857C22.75,15.892 22.75,15.927 22.75,15.962C22.75,16.924 22.75,17.529 22.639,18.047C22.3,19.633 21.212,20.934 19.75,21.479V22C19.75,22.414 19.414,22.75 19,22.75C18.586,22.75 18.25,22.414 18.25,22V21.742C17.972,21.75 17.657,21.75 17.29,21.75C17.253,21.75 17.216,21.75 17.179,21.75H6.821C6.784,21.75 6.747,21.75 6.71,21.75C5.828,21.75 5.248,21.75 4.75,21.631V22C4.75,22.414 4.414,22.75 4,22.75C3.586,22.75 3.25,22.414 3.25,22V21C3.25,20.984 3.251,20.968 3.252,20.951C2.302,20.282 1.617,19.246 1.361,18.047C1.25,17.529 1.25,16.924 1.25,15.962C1.25,15.927 1.25,15.892 1.25,15.857V11.246C1.25,9.638 2.484,8.25 4.105,8.25C4.516,8.25 4.903,8.339 5.25,8.498V8.118C5.25,6.998 5.25,6.108 5.313,5.393C5.378,4.66 5.513,4.038 5.829,3.478C6.208,2.804 6.756,2.241 7.418,1.849C7.97,1.522 8.584,1.382 9.303,1.315C10.003,1.25 10.873,1.25 11.963,1.25ZM6.701,10C6.868,10.383 6.961,10.806 6.961,11.246V15.583H17.039V11.246C17.039,10.806 17.132,10.383 17.299,10H17.25V8.154C17.25,6.99 17.249,6.166 17.193,5.525C17.137,4.893 17.031,4.511 16.864,4.214C16.612,3.766 16.25,3.396 15.818,3.14C15.535,2.972 15.17,2.865 14.559,2.809C13.936,2.751 13.136,2.75 12,2.75C10.864,2.75 10.064,2.751 9.442,2.809C8.83,2.865 8.465,2.972 8.182,3.14C7.75,3.396 7.388,3.766 7.136,4.214C6.969,4.511 6.863,4.893 6.807,5.525C6.751,6.166 6.75,6.99 6.75,8.154V10H6.701ZM4.105,9.75C3.402,9.75 2.75,10.373 2.75,11.246V15.857C2.75,16.958 2.754,17.391 2.827,17.733C3.092,18.971 3.989,19.902 5.093,20.171C5.395,20.245 5.782,20.25 6.821,20.25H17.179C18.218,20.25 18.605,20.245 18.907,20.171C20.011,19.902 20.908,18.971 21.173,17.733C21.246,17.391 21.25,16.958 21.25,15.857V11.246C21.25,10.373 20.598,9.75 19.895,9.75C19.191,9.75 18.539,10.373 18.539,11.246V16.333C18.539,16.747 18.204,17.083 17.789,17.083H6.211C5.796,17.083 5.461,16.747 5.461,16.333V11.246C5.461,10.373 4.809,9.75 4.105,9.75Z"
            ), name = "",
            fill = SolidColor(Color.White),
            stroke = SolidColor(Color.Black)
        )

        build()
    }


}


@Preview(showSystemUi = true)
@Composable
private fun Preview() {
}