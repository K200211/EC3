package com.camila.ec3_bancescamila_movilesii.data.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    //https://api.themoviedb.org/3/movie/550?api_key=5a5df8c32e73d5475e0e1bfa416cb6d1
    //https://api.themoviedb.org/3/movie/
    //https://api.themoviedb.org/3/movie/343611?&append_to_response=videos&api_key=5a5df8c32e73d5475e0e1bfa416cb6d1
    private val retrofit= Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org/3/movie/popular/")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getMovieService(): MovieService = retrofit.create(MovieService::class.java)
}