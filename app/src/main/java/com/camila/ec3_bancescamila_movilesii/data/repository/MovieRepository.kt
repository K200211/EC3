package com.camila.ec3_bancescamila_movilesii.data.repository

import com.camila.ec3_bancescamila_movilesii.data.response.MovieListResponse
import com.camila.ec3_bancescamila_movilesii.data.retrofit.RetrofitInstance
import com.camila.ec3_bancescamila_movilesii.model.ApiMovieResponse

class MovieRepository {
    suspend fun getMovies(): ApiMovieResponse<MovieListResponse>{
        return try {
            val response= RetrofitInstance.getMovieService().getMovies()
            ApiMovieResponse.Success(response)
        }catch (e: Exception){
            ApiMovieResponse.Error(e)
        }
    }
}