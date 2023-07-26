package com.camila.ec3_bancescamila_movilesii.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.camila.ec3_bancescamila_movilesii.RVListAdapter
import com.camila.ec3_bancescamila_movilesii.databinding.FragmentListBinding
import com.camila.ec3_bancescamila_movilesii.model.Movie
import com.camila.ec3_bancescamila_movilesii.model.getData

class ListFragment : Fragment() {

    private  lateinit var binding: FragmentListBinding
    private lateinit var viewModel: MovieListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MovieListViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.movieList.observe(requireActivity()){
            verLista(it)
        }
        viewModel.getCuponsFromService()
    }

    private fun verLista(movies:List<Movie>){
        binding.rvMovieLis.adapter= RVListAdapter(movies)
        binding.rvMovieLis.layoutManager= GridLayoutManager(requireContext(),2, RecyclerView.VERTICAL,false)

    }

}