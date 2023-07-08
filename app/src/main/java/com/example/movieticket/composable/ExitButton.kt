package com.example.movieticket.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.studycompose.R
import com.example.studycompose.ui.theme.lightGray

@Composable
fun ExitButton(onClick: () -> Unit) {

    Box(
        modifier = Modifier
            .size(32.dp)
            .background(color = White.copy(alpha = .40f), CircleShape),
        contentAlignment = Alignment.Center,

    ) {
        Icon(
            modifier = Modifier
                .clip(CircleShape)
                .padding(6.dp)
                .clickable { onClick() },
            painter = painterResource(id = R.drawable.exit_icon),
            contentDescription = null,
            tint = Color.White
        )


    }
}