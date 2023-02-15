package com.example.proyectoprctica_eval2netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectoprctica_eval2netflix.databinding.ActivityAnadirUsuariosBinding
import com.example.proyectoprctica_eval2netflix.databinding.ActivityRegistroBinding

class AnadirUsuarios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding= ActivityAnadirUsuariosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            if (binding.editTextTextPersonName3.text.toString().isNotEmpty()) {
                intent = Intent(this, EligeUsuario::class.java)
                intent.putExtra("Usuario Nuevo", binding.editTextTextPersonName3.text.toString())
                startActivity(intent)
            }
        }

        binding.button3.setOnClickListener {
            intent = Intent(this, EligeUsuario::class.java)
            intent.putExtra("Usuario Nuevo","No Usuario Nuevo")
            startActivity(intent)
        }

    }
}