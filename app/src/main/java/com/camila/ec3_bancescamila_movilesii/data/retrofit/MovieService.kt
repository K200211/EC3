package com.camila.ec3_bancescamila_movilesii.data.retrofit

import com.camila.ec3_bancescamila_movilesii.data.response.MovieListResponse
import retrofit2.http.GET

interface MovieService {
    @GET("?api_key=5a5df8c32e73d5475e0e1bfa416cb6d1")
    suspend fun getMovies() :MovieListResponse
}