package com.example.guiappstreaming

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class paginaAjustes : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_ajustes)

        var usuario = ""

        findViewById<Button>(R.id.usuario1).setOnClickListener {
            var intento = Intent(this, ActividadEditarPerfil::class.java)
            usuario = "usuario1"
            intento.putExtra("Usuario", usuario)
            startActivity(intento)
        }

        findViewById<Button>(R.id.usuario2).setOnClickListener {
            var intento = Intent(this, ActividadEditarPerfil::class.java)
            usuario = "usuario2"
            intento.putExtra("Usuario", usuario)
            startActivity(intento)
        }

        findViewById<Button>(R.id.usuario3).setOnClickListener {
            var intento = Intent(this, ActividadEditarPerfil::class.java)
            usuario = "usuario3"
            intento.putExtra("Usuario", usuario)
            startActivity(intento)
        }

        findViewById<Button>(R.id.usuario4).setOnClickListener {
            var intento = Intent(this, ActividadEditarPerfil::class.java)
            usuario = "usuario4"
            intento.putExtra("Usuario", usuario)
            startActivity(intento)
        }

        findViewById<Button>(R.id.usuarioniño).setOnClickListener {
            var intento = Intent(this, ActividadEditarPerfil::class.java)
            usuario = "niño"
            intento.putExtra("Usuario", usuario)
            startActivity(intento)
        }

        findViewById<ImageView>(R.id.imageButton).setOnClickListener{
            var intento = Intent(this,MainActivity::class.java)
            startActivity(intento)
        }

    }
}