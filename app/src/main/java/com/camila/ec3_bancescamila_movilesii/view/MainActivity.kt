package com.camila.ec3_bancescamila_movilesii.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.camila.ec3_bancescamila_movilesii.R
import com.camila.ec3_bancescamila_movilesii.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment= supportFragmentManager.findFragmentById(R.id.fcv_cupon)as NavHostFragment
        val  navController= navHostFragment.navController
        binding.bnvMenu.setupWithNavController(navController= navController)
    }


}