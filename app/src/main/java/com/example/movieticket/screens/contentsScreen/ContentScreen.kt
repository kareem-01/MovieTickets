package com.example.movieticket.screens.contentsScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.movieticket.R
import com.example.movieticket.Screen
import com.example.movieticket.composable.BuyButton
import com.example.movieticket.composable.FirstScreenLazyItem
import com.example.movieticket.composable.LittleColumn
import com.example.movieticket.composable.MovieTags
import com.example.movieticket.composable.SpacerHorizontal


@Composable
fun DetailsScreen(navController: NavController) {
    DetailsContent(onclickBack = {
        navController.popBackStack()
    },
        onButtonClick = { navController.navigate(Screen.BuyScreen.route) })
}

@Composable
private fun DetailsContent(
    onclickBack: () -> Unit,
    onButtonClick: () -> Unit,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        setTopImage(onClick = onclickBack, "2h 33m")
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.55f)
                .align(Alignment.BottomCenter),
            shape = RoundedCornerShape(topEnd = 25.dp, topStart = 25.dp),
            colors = CardDefaults.cardColors(contentColor = Color.White),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 16.dp),
                verticalArrangement = Arrangement.SpaceBetween,

                ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp, vertical = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    LittleColumn(firsString = "6.8", secondString = "/10", thirdString = "IMDb")
                    LittleColumn(
                        firsString = "63",
                        secondString = "%",
                        thirdString = "Rotten Tomatoes"
                    )
                    LittleColumn(firsString = "4", secondString = "/10", thirdString = "IGN")

                }

                Text(
                    text = "Fantastic Beasts: The \u00A0 Secrets Of Dumbledore",
                    modifier = Modifier.padding(horizontal = 30.dp),
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.Black,
                    fontSize = 24.sp,
                    maxLines = 2,
                    softWrap = true,
                    fontWeight = MaterialTheme.typography.bodyMedium.fontWeight,
                    textAlign = TextAlign.Center,
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    MovieTags(tag = "Fantasy")
                    SpacerHorizontal(8.dp)
                    MovieTags(tag = "Adventure")
                }
                LazyRow(
                    modifier = Modifier.fillMaxWidth(),
                    contentPadding = PaddingValues(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    item {
                        FirstScreenLazyItem(painter = painterResource(id = R.drawable.robert_downey_jr))
                    }
                    item {
                        FirstScreenLazyItem(painter = painterResource(id = R.drawable.robert_downey_jr))
                    }
                    item {
                        FirstScreenLazyItem(painter = painterResource(id = R.drawable.robert_downey_jr))
                    }
                    item {
                        FirstScreenLazyItem(painter = painterResource(id = R.drawable.robert_downey_jr))
                    }
                    item {
                        FirstScreenLazyItem(painter = painterResource(id = R.drawable.robert_downey_jr))
                    }
                    item {
                        FirstScreenLazyItem(painter = painterResource(id = R.drawable.robert_downey_jr))
                    }
                }
                Text(
                    text = names.content,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = Color.Black,
                        fontSize = 14.sp
                    ),
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp),
                    textAlign = TextAlign.Center

                )
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                    BuyButton(title = "Booking", onButtonClick)

                }


            }
        }


    }


}


@Preview(showSystemUi = true)
@Composable
private fun Preview() {
    val navController = rememberNavController()
    DetailsScreen(navController = navController)
}

object names {
    const val content =
        "professor Albus  Dumbledore knows the powerful, dark wizard Gellert Grindelwald is moving to seize control of the Wizarding world. Unable to stop him\u00AD mm"
}