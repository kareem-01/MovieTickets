package com.example.movieticket.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SelectionItem(string: String, modifier: Modifier) {

    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier
                .size(15.dp)
                .clip(CircleShape)
        ) {
        }
        SpacerHorizontal4()
        Text(text = string, color = Color.LightGray)
    }
}