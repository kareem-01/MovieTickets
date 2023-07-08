package com.example.movieticket.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.studycompose.ui.theme.Text63

@Composable
fun LittleColumn(firsString: String, secondString: String,thirdString: String) {
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Black)){
                    append(firsString)
                }
                withStyle(style = SpanStyle(color = Text63)){
                    append(secondString)
                }
            }
        )
//        Spacer(modifier = Modifier)
        Text(text = thirdString, color = Text63)
    }

}

@Preview
@Composable
fun preview() {
    LittleColumn(firsString = "6.8/10", secondString = "IMDb", thirdString = "")

}