package com.camila.ec3_bancescamila_movilesii.model

sealed class ApiMovieResponse<T>(data: T? = null, exception: Exception?= null){
    data class Success<T>(val data: T): ApiMovieResponse<T>(data)
    data class Error<T>(val exception: Exception): ApiMovieResponse<T>(null,exception)
}