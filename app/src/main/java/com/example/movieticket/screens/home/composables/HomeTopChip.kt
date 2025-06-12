package com.example.movieticket.screens.home.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.movieticket.ui.theme.whiteColor

@Composable
fun HomeChip(
    color: Color,
    text: String,
    border: Color = Color.Transparent,
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(32.dp))
            .border(1.dp, color = border,shape = RoundedCornerShape(32.dp))
            .background(
                shape = RoundedCornerShape(32.dp),
                color = color,
            ),
    )
    {
        Text(
            text = text,
            color = whiteColor,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}