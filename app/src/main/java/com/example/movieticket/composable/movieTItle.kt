package com.example.movieticket.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MovieTitle(name:String){
    Text(
        text = name,
        modifier = Modifier.padding(horizontal = 30.dp).fillMaxWidth().padding(horizontal = 16.dp),
        style = MaterialTheme.typography.titleMedium,
        color = Color.Black,
        fontSize = 24.sp,
        maxLines = 2,
        softWrap = true,
        fontWeight = MaterialTheme.typography.bodyMedium.fontWeight,
        textAlign = TextAlign.Center,
    )
}