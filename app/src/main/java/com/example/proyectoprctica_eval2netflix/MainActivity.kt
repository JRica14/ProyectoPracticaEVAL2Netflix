package com.example.proyectoprctica_eval2netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectoprctica_eval2netflix.databinding.ActivityMainBinding
import com.example.proyectoprctica_eval2netflix.databinding.ActivityRegistroBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            usuarios.forEach {
                if (it.nombre==binding.editTextTextPersonName.text.toString()&& it.contraseña==binding.editTextTextPassword.text.toString()) {
                    intent = Intent(this, EligeUsuario::class.java)
                    intent.putExtra("Usuario Nuevo","No Usuario Nuevo")
                    startActivity(intent)
                }
            }
        }

        binding.textView.setOnClickListener {
            intent = Intent(this, Registro::class.java)
            startActivity(intent)
        }
    }
}