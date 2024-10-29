package com.example.app_paises

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class TerceraActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.tercera_activity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tercera)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var titulo = findViewById<TextView>(R.id.nombrePais)


        var tituloPais = intent.getStringExtra("")
        //var descripcionPais = intent.getStringExtra("")

        titulo.text = "$tituloPais"


    }
}
