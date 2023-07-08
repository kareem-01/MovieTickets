package com.example.movieticket.screens.contentsScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movieticket.R
import com.example.movieticket.composable.DurationBox
import com.example.movieticket.composable.ExitButton
import com.example.movieticket.ui.theme.Orange
import com.example.movieticket.ui.theme.primaryTextColor

@Composable
fun setTopImage(onClick:()->Unit,time:String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f),


        ) {

        Image(
            painter = painterResource(id = R.drawable.fantastic_beasts_cover),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 32.dp)

        ) {

            ExitButton(onClick = onClick)

            Spacer(modifier = Modifier.weight(1f))
            DurationBox(
                time = time,
                background = White.copy(alpha = .40f),
                textColor = primaryTextColor
            )

        }
        Button(
            onClick = { /*TODO*/ },
            shape = CircleShape,
            modifier = Modifier
                .align(Alignment.Center)
                .size(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Orange
            ),
            elevation = ButtonDefaults.buttonElevation(0.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            Icon(Icons.Rounded.PlayArrow, contentDescription = null)

        }

    }


// {
//    val (image,button,text) = createRefs()
//        Image(
//            painter = painterResource(id = R.drawable.fantastic_beasts_cover),
//            contentDescription = null,
//            modifier = Modifier.fillMaxWidth().constrainAs(image){
//                height =
//            }
//        )
//
// }
}

@Preview(showSystemUi = true)
@Composable
private fun tryImage() {
//    setTopImage()
}