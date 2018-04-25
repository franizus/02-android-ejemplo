package com.example.francisco.androidejemplo

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View

import kotlinx.android.synthetic.main.activity_actividad_tres.*
import kotlinx.android.synthetic.main.content_actividad_tres.*

class ActividadTres : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_tres)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        boton_tres.setOnClickListener { v: View ->
            irAActividadMain()
        }
    }

    fun irAActividadMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
