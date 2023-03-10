package com.example.guiappstreaming

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.constraintlayout.helper.widget.Carousel
import androidx.viewpager.widget.ViewPager
import com.google.android.material.card.MaterialCardView

class PaginaPrincipalSeriesPeliculas : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_principal_series_peliculas)

        //Reciben el String para poner la imagen del usuario

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