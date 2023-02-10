package com.example.guiappstreaming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

open class ActividadEditarPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_editar_perfil)

        var usuario = intent.getStringExtra("Usuario")

        if (usuario == "usuario1"){
            findViewById<ImageView>(R.id.imagen).setImageResource(R.drawable.icono1)
            findViewById<EditText>(R.id.textoNombre).setText("Usuario 1")
        } else if (usuario == "usuario2"){
            findViewById<ImageView>(R.id.imagen).setImageResource(R.drawable.icono2)
            findViewById<EditText>(R.id.textoNombre).setText("Usuario 2")
        } else if (usuario == "usuario3"){
            findViewById<ImageView>(R.id.imagen).setImageResource(R.drawable.icono3)
            findViewById<EditText>(R.id.textoNombre).setText("Usuario 3")
        } else if (usuario == "usuario4"){
            findViewById<ImageView>(R.id.imagen).setImageResource(R.drawable.icono4)
            findViewById<EditText>(R.id.textoNombre).setText("Usuario 4")
        } else if (usuario == "niño"){
            findViewById<ImageView>(R.id.imagen).setImageResource(R.drawable.ninnos)
            findViewById<EditText>(R.id.textoNombre).setText("Niños")
        }

        findViewById<ImageButton>(R.id.imageButton).setOnClickListener {
            var intento = Intent(this,paginaAjustes::class.java)
            startActivity(intento)
        }

    }
}