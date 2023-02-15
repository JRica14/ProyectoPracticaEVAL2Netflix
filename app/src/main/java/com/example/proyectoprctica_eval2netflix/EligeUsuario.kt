package com.example.proyectoprctica_eval2netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyectoprctica_eval2netflix.databinding.ActivityEligeUsuarioBinding
import com.example.proyectoprctica_eval2netflix.databinding.ActivityRegistroBinding

class EligeUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding= ActivityEligeUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var usuarioNuevo= intent.getStringExtra("Usuario Nuevo")


        if (usuarioNuevo!="No Usuario Nuevo"){
            binding.imageButton4.setImageResource(R.drawable._1_netflix__5_)
            binding.textView7.text=usuarioNuevo
        }
        binding.imageButton4.setOnClickListener{
            if (usuarioNuevo!="No Usuario Nuevo"){
                intent = Intent(this, PaginaPrincipal::class.java)
                intent.putExtra("imagen",5)
                startActivity(intent)
            }else {
                intent = Intent(this, AnadirUsuarios::class.java)
                startActivity(intent)
            }
        }
        binding.imageButton.setOnClickListener {
            intent = Intent(this, PaginaPrincipal::class.java)
            intent.putExtra("imagen",7)
            startActivity(intent)
        }
        binding.imageButton2.setOnClickListener {
            intent = Intent(this, PaginaPrincipal::class.java)
            intent.putExtra("imagen",4)
            startActivity(intent)
        }
        binding.imageButton3.setOnClickListener {
            intent = Intent(this, PaginaPrincipal::class.java)
            intent.putExtra("imagen",3)
            startActivity(intent)
        }
    }
}