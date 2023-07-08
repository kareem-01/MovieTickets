package com.example.movieticket.screens.home.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movieticket.R
import com.example.movieticket.models.Movie
import com.example.movieticket.ui.theme.whiteColor

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreenBackground(movies: List<Movie>, pagerState: PagerState) {
    Image(
        modifier = Modifier
            .fillMaxSize()
            .blur(40.dp),
        contentScale = ContentScale.Crop,
        painter = painterResource(id = movies[pagerState.currentPage].imageDrawable),
        contentDescription = null,

        )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent,
                        Color.Transparent,
                        whiteColor,
                        whiteColor
                    )
                )
            )
    )

}

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
private fun Preview() {
    val pagerState = rememberPagerState()
//    HomeScreenBackground(pagerState)
}