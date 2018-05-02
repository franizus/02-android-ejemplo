package com.example.francisco.androidejemplo

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        /*texto_central.text = "Adios"
        var valorTextoCentral: CharSequence = texto_central.text
        Log.i("clase", "El texto que se muestra es ${texto_central.text} $valorTextoCentra*/

        val permisosDeCamara = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
        val tienePermisosDeCamara = permisosDeCamara != PackageManager.PERMISSION_GRANTED
        Log.i("tag", "Crear permiso ${permisosDeCamara}")
        if (tienePermisosDeCamara) {
            Log.i("tag", "Entrando a pedir permiso")
            ActivityCompat.requestPermissions(this,
                    arrayOf(Manifest.permission.CAMERA,
                            Manifest.permission.SEND_SMS),
                    RESULTADO_PERMISO_CAMARA)
        } else {
            Log.i("tag", "Ya tiene este permiso")
        }

        Log.e("clase", "Esto es un error")
        Log.w("clase", "Esto es un warning")
        Log.d("clase", "Esto es un debug")
        Log.i("clase", "Esto es un info")
        Log.v("clase", "Esto es un verbose")

        boton_navegar_actividad_dos.setOnClickListener { v: View ->
            irAActividadDos()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun irAActividadDos() {
        val intent = Intent(this, actividadDos::class.java)
        intent.putExtra("nombre", "Francisco Izurieta")
        startActivity(intent)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when (requestCode) {
            RESULTADO_PERMISO_CAMARA -> {
                Log.i("etiqueta", "Tiene permisos de camara")
            }
        }
    }

    companion object {
        val RESULTADO_PERMISO_CAMARA = 1
    }
}
