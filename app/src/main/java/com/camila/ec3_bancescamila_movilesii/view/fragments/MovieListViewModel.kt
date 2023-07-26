package com.camila.ec3_bancescamila_movilesii.view.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.camila.ec3_bancescamila_movilesii.data.repository.MovieRepository
import com.camila.ec3_bancescamila_movilesii.model.ApiMovieResponse
import com.camila.ec3_bancescamila_movilesii.model.Movie
import com.camila.ec3_bancescamila_movilesii.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieListViewModel: ViewModel(){
    val repository= MovieRepository()
    val movieList: MutableLiveData<List<Movie>> =  MutableLiveData<List<Movie>>()

    fun getMovieList(){
        val data =   getData()
        movieList.value= data
    }

    fun getCuponsFromService(){
        viewModelScope.launch(Dispatchers.IO) {
            val response= repository.getMovies()
            when(response){
                is ApiMovieResponse.Error -> {

                }
                is ApiMovieResponse.Success ->{
                    movieList.postValue(response.data.movies)
                }
            }
        }
    }
}