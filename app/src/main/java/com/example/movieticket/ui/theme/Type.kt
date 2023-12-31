package com.example.movieticket.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.movieticket.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)


private val sans = FontFamily(
    Font(R.font.productsans_regular, FontWeight.W400),
    Font(R.font.productsans_medium, FontWeight.W500)
)
val GoogleSansTypography = Typography(
    titleMedium = TextStyle(
        fontFamily = sans,
        fontWeight = FontWeight.W500,
        fontSize = 16.sp,
        letterSpacing = 0.5.sp

    ),
    bodySmall = TextStyle(
        fontFamily = sans,
        fontWeight = FontWeight.W400,
        fontSize = 12.sp,
        letterSpacing = 0.5.sp

    )
)