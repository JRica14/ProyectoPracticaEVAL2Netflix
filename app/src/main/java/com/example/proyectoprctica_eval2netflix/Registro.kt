package com.example.proyectoprctica_eval2netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectoprctica_eval2netflix.databinding.ActivityRegistroBinding

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding= ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button4.setOnClickListener {
          usuarios.add(Persona (binding.editTextTextEmailAddress.text.toString(),binding.editTextTextPassword2.text.toString()))
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }


}