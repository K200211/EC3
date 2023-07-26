package com.camila.ec3_bancescamila_movilesii.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.camila.ec3_bancescamila_movilesii.databinding.FragmentFavoriteBinding


class FavoriteFragment : Fragment() {
    private  lateinit var binding: FragmentFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFavoriteBinding.inflate(inflater,container,false)
        return binding.root
    }

}