package com.example.movieticket.composable


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movieticket.R
import com.example.movieticket.ui.theme.Orange

@Composable
fun BuyButton(title: String,onClick:()->Unit) {
    Button(
        onClick = {onClick() },
        colors = ButtonDefaults.buttonColors(containerColor = Orange),
        contentPadding = PaddingValues(16.dp),
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ticket),
            contentDescription = null,
            tint = White
        )
        SpacerHorizontal(16.dp)
        Text(text = title, style = MaterialTheme.typography.titleMedium)
    }

}

@Preview
@Composable
private fun Preview() {

    BuyButton("Booking",{})}
