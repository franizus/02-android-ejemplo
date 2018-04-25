package com.example.francisco.androidejemplo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_actividad_dos.*

class actividadDos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_dos)

        boton_dos.setOnClickListener { v: View ->
            irAActividadTres()
        }
    }

    fun irAActividadTres() {
        val intent = Intent(this, ActividadTres::class.java)
        startActivity(intent)
    }
}
