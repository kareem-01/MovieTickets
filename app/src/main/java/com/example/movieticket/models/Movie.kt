package com.example.movieticket.models


data class Movie(
    val id: Int = 0,
    val name: String = "null",
    val imageDrawable: Int = 0,
    val time: String = "null",
    val description: String = "null",
    val tags: List<String> = listOf(),
)

