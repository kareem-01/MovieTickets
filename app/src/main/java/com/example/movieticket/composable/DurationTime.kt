package com.example.movieticket.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.studycompose.R
import com.example.studycompose.ui.theme.lightGray
import com.example.studycompose.ui.theme.whiteColor

@Composable
fun DurationBox(time: String, background: Color, textColor: Color) {
    Box(
        modifier = Modifier
            .background(
                color = background,
                RoundedCornerShape(32.dp),
            )
            .blur(30.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            Modifier
                .padding(vertical = 8.dp, horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.clock),
                contentDescription = null,
                modifier = Modifier
                    .size(16.dp)
                    .alpha(0.6f)
            )
            Text(
                modifier = Modifier,
                text = "2h 33m",
                color = textColor,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )

        }
    }
}

@Preview
@Composable
private fun Preview() {

    DurationBox(
        time = "2h 33m",
        textColor = whiteColor,
        background = Color.DarkGray
    )
}