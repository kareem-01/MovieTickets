package com.example.movieticket.screens.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import androidx.navigation.NavController
import com.example.movieticket.Screen
import com.example.movieticket.composable.DurationBox
import com.example.movieticket.screens.home.composables.HomeScreenBackground
import com.example.movieticket.composable.MovieTitle
import com.example.movieticket.composable.SpacerHorizontal
import com.example.movieticket.composable.TagsRow
import com.example.movieticket.models.Movie
import com.example.movieticket.movies
import com.example.movieticket.screens.home.composables.HomeChip
import com.example.movieticket.ui.theme.Orange
import com.example.movieticket.ui.theme.lightWight
import kotlin.math.absoluteValue

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navController: NavController,
) {

    val pagerState = rememberPagerState()
    HomeContent(movies = movies, pagerState, onClick = {
        navController.navigate(Screen.ContentScreen.route)
    })


}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun HomeContent(
    movies: List<Movie>,
    pagerState: PagerState,
    onClick: (id: Int) -> Unit,
) {


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        HomeScreenBackground(movies, pagerState = pagerState)

        Column(Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                HomeChip(color = Orange, text = "New Showing")
                SpacerHorizontal(8.dp)
                HomeChip(color = Color.Transparent, text = "Coming Soon", border = lightWight)
            }
            LazyColumn(
                contentPadding = PaddingValues(vertical = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    Column {
                        HorizontalPager(
                            state = pagerState,
                            pageCount = movies.size, modifier = Modifier,
                            contentPadding = PaddingValues(horizontal = 32.dp),
                        ) { page ->
                            Box(
                                Modifier
                                    .clip(RoundedCornerShape(32.dp))
                                    .graphicsLayer {
                                        val pageOffset =
                                            ((pagerState.currentPage - page) + pagerState.currentPageOffsetFraction).absoluteValue
                                        lerp(
                                            start = 1f,
                                            stop = .85f,
                                            fraction = 0.5f * pageOffset.coerceIn(0f, 1f)
                                        ).also { scale ->
                                            scaleX = scale
                                            scaleY = scale
                                        }
                                    },
                            ) {
                                Image(
                                    painter = painterResource(movies[page].imageDrawable),
                                    contentDescription = null, contentScale = ContentScale.FillWidth,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(24.dp))
                                        .clickable { onClick(movies[page].id) }
                                )


                            }

                        }
                    }
                }
                item {
                    DurationBox(
                        time = movies[pagerState.currentPage].time,
                        background = Color.Transparent,
                        textColor = Color.Black
                    )
                }
                item {
                    MovieTitle(name = movies[pagerState.currentPage].name)

                }
                item {
                    TagsRow(genres = movies[pagerState.currentPage].tags)
                }
            }
        }

    }

}


@Preview(showSystemUi = true)
@Composable
fun previewProfileScreen() {
//    HomeScreen()

}