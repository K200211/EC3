package com.camila.ec3_bancescamila_movilesii

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.camila.ec3_bancescamila_movilesii.databinding.ItemMovieBinding
import com.camila.ec3_bancescamila_movilesii.model.Movie

class RVListAdapter(val movies:List<Movie>): RecyclerView.Adapter<MovieVH> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieVH {
        val binding= ItemMovieBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MovieVH(binding)
    }

    override fun getItemCount(): Int= movies.size

    override fun onBindViewHolder(holder: MovieVH, position: Int) {
        holder.bind(movies[position])
    }

}

class MovieVH(private val binding: ItemMovieBinding): ViewHolder(binding.root){
    fun bind(movie: Movie) {
        binding.imageView.setImageResource(R.drawable.img)
        binding.txtNameMovie.text= movie.original_title
    }

}