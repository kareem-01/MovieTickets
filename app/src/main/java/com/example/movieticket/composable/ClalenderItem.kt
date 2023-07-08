package com.example.movieticket.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movieticket.ui.theme.Text63

@Composable
fun CalenderItem(dayNumber: String, day: String) {
    Box(
        Modifier
            .border(.5.dp, Color.LightGray, RoundedCornerShape(16.dp))
            .background(Color.White),
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = dayNumber,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                fontSize = 18.sp
            )
            Text(
                text = day, style = MaterialTheme.typography.titleMedium,
                color = Text63,
                fontSize = 10.sp,
            )
        }
    }

}


@Preview
@Composable
private fun Preview() {
    CalenderItem(dayNumber = "14", day = "Thu")
}