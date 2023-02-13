package com.example.guiappstreaming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView

class PaginaPrincipalSeriesPeliculas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_principal_series_peliculas)

        var usuario = intent.getStringExtra("Usuario")

        if (usuario == "usuario1"){
            findViewById<ImageView>(R.id.imagenUsuario).setImageResource(R.drawable.icono1)
        } else if (usuario == "usuario2"){
            findViewById<ImageView>(R.id.imagenUsuario).setImageResource(R.drawable.icono2)
        } else if (usuario == "usuario3"){
            findViewById<ImageView>(R.id.imagenUsuario).setImageResource(R.drawable.icono3)
        } else if (usuario == "usuario4"){
            findViewById<ImageView>(R.id.imagenUsuario).setImageResource(R.drawable.icono4)
        }
    }
}