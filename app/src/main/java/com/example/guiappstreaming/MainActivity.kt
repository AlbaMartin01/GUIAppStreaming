package com.example.guiappstreaming

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var usuario = ""

        findViewById<ImageButton>(R.id.botonEditar).setOnClickListener{
            var intento = Intent(this, paginaAjustes::class.java)
            startActivity(intento)
        }

        findViewById<Button>(R.id.boton1).setOnClickListener {
            var intento = Intent(this, PaginaPrincipalSeriesPeliculas::class.java)
            usuario = "usuario1"
            intento.putExtra("Usuario", usuario)
            startActivity(intento)
        }

        findViewById<Button>(R.id.boton2).setOnClickListener {
            var intento = Intent(this, PaginaPrincipalSeriesPeliculas::class.java)
            usuario = "usuario2"
            intento.putExtra("Usuario", usuario)
            startActivity(intento)
        }

        findViewById<Button>(R.id.boton3).setOnClickListener {
            var intento = Intent(this, PaginaPrincipalSeriesPeliculas::class.java)
            usuario = "usuario3"
            intento.putExtra("Usuario", usuario)
            startActivity(intento)
        }

        findViewById<Button>(R.id.boton4).setOnClickListener {
            var intento = Intent(this, PaginaPrincipalSeriesPeliculas::class.java)
            usuario = "usuario4"
            intento.putExtra("Usuario", usuario)
            startActivity(intento)
        }

        findViewById<Button>(R.id.ninnos).setOnClickListener {
            var intento = Intent(this, PaginaPrincipalSeriesPeliculas::class.java)
            startActivity(intento)
        }
    }
}