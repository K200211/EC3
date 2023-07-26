package com.camila.ec3_bancescamila_movilesii.model

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("original_title")
    val original_title: String,
    @SerializedName("poster_path")
    val poster_path: String
)

fun getData(): List<Movie> {
    return listOf(
        Movie("Mision Imposible",""),
        Movie("Mision Imposible",""),
        Movie("Mision Imposible",""),
        Movie("Mision Imposible",""),
        Movie("Mision Imposible",""),
        Movie("Mision Imposible","")

    )
}

