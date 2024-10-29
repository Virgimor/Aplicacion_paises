package com.example.app_paises

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class SegundaActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.segunda_activity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.segunda)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tituloAle = findViewById<TextView>(R.id.tituloAlemania)
        val boton1 = findViewById<Button>(R.id.botonAlemania)
        val tituloEs = findViewById<TextView>(R.id.tituloEspania)
        val boton2 = findViewById<Button>(R.id.botonEspania)
        val tituloEu = findViewById<TextView>(R.id.tituloEu)
        val boton3 = findViewById<Button>(R.id.botonEu)
        val tituloGre = findViewById<TextView>(R.id.tituloGrecia)
        val boton4 = findViewById<Button>(R.id.botonGrecia)
        val tituloIta = findViewById<TextView>(R.id.tituloItalia)
        val boton5 = findViewById<Button>(R.id.botonItalia)
        val tituloUk = findViewById<TextView>(R.id.tituloUk)
        val boton6 = findViewById<Button>(R.id.botonUk)

        boton1.setOnClickListener{
            val titulo = tituloAle.text.toString()

            if(titulo.isNotEmpty()){
                val intent = Intent(this, TerceraActivity::class.java)

                intent.putExtra("EXTRA_TITULO_ALEMANIA", titulo)
                startActivity(intent)
            }
        }

        boton2.setOnClickListener{
            val titulo = tituloEs.text.toString()

            if(titulo.isNotEmpty()){
                val intent = Intent(this, TerceraActivity::class.java)

                intent.putExtra("EXTRA_TITULO_ESPAÑA", titulo)
                startActivity(intent)
            }
        }

        boton3.setOnClickListener{
            val titulo = tituloEu.text.toString()

            if(titulo.isNotEmpty()){
                val intent = Intent(this, TerceraActivity::class.java)

                intent.putExtra("EXTRA_TITULO_EU", titulo)
                startActivity(intent)
            }
        }

        boton4.setOnClickListener{
            val titulo = tituloGre.text.toString()

            if(titulo.isNotEmpty()){
                val intent = Intent(this, TerceraActivity::class.java)

                intent.putExtra("EXTRA_TITULO_GRECIA", titulo)
                startActivity(intent)
            }
        }

        boton5.setOnClickListener{
            val titulo = tituloIta.text.toString()

            if(titulo.isNotEmpty()){
                val intent = Intent(this, TerceraActivity::class.java)

                intent.putExtra("EXTRA_TITULO_ITALIA", titulo)
                startActivity(intent)
            }
        }

        boton6.setOnClickListener{
            val titulo = tituloUk.text.toString()

            if(titulo.isNotEmpty()){
                val intent = Intent(this, TerceraActivity::class.java)

                intent.putExtra("EXTRA_TITULO_UK", titulo)
                startActivity(intent)
            }
        }

    }
}
