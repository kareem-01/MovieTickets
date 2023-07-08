package com.example.movieticket.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.studycompose.ui.theme.lightGray

@Composable
fun MovieTags(tag: String) {

    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = lightGray,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(vertical = 8.dp, horizontal = 16.dp)
    ) {
        Text(text = tag, color = Color.Black)
    }
}