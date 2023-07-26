package com.camila.ec3_bancescamila_movilesii.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.camila.ec3_bancescamila_movilesii.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            val edtUser = binding.edtUser.text.toString()
            val edtPassword= binding.edtPassword.text.toString()

            if(validarLogin(edtUser,edtPassword)){
                if (edtUser.equals("ejemplo@idat.edu.pe") && edtPassword.equals("123456")){
                    val intent= Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }else{
                    Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }

    private fun validarLogin(user:String, password:String): Boolean {
        val isUserok= user.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(user).matches()
        val isPasswordOk= password.isNotEmpty() && password.length == 6
        return isUserok && isPasswordOk
    }
}