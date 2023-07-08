package com.example.movieticket

import com.example.movieticket.models.Movie

val movies = listOf(
    Movie(
        id = 1,
        name = "Morbius",
        imageDrawable = R.drawable.movie_morbius,
        time = "1h 44m",
        description = "Determined to cure the disease that has plagued him his entire life, Morbius conducts a drastic experiment, which bears unforeseen consequences.",
        tags = listOf(
            "Horror",
            "Action",
            "superHero",
            "Drama",
            "Science Fiction",
        )
        ),
    Movie(
        id = 2,
        name = "Fantastic Beats: The Secrets of Dumbledore",
        imageDrawable = R.drawable.movie_fantastic_beasts,
        time = "2h 23m",
        description = "Dumbledore assembles a team of wizards, witches and a Muggle baker to oppose the rise of Gellert Grindelwald. They hatch a plan to confuse Grindelwald and stop him from attaining political power.",
        tags = listOf(
            "Fantasy",
            "Adventure",
            "Family film",
            "High Fantasy",
        )
    ),
    Movie(
        id = 3,
        name = "Doctor Strange In The Multiverse Of Madness",
        imageDrawable = R.drawable.movie_dr_strange,
        time = "2h 6m",
        description = "Doctor Strange teams up with a mysterious teenage girl from his dreams who can travel across multiverses, to battle multiple threats, including other-universe versions of himself, which threaten to wipe out millions across the multiverse.",
        tags = listOf(
            "Fantasy",
            "Action",
            "superHero",
            "Animation",
            "Science Fiction",
        )
    ),

    )
