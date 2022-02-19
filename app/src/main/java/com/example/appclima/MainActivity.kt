package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var tvCiudad:TextView? = null
    var tvGrados:TextView? = null
    var tvEstatus:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.tvCiudad)
        tvGrados = findViewById(R.id.tvGrados)
        tvEstatus = findViewById(R.id.tvEstatus)


        val ciudad = intent.getStringExtra("com.example.appclima.ciudades.CIUDAD")


        val ciudadfcp = Ciudad("Ciudad de Felipe Carrillo Puerto", 32, "Soleado")
        val ciudadMerida = Ciudad("Ciudad de Merida, Yucatan", 31, "Parcialmente Nublado")

        if(ciudad == "ciudad-felipe"){
            // mostrar informacion ciudadfcp
            tvCiudad?.text = ciudadfcp.nombre
            tvGrados?.text = ciudadfcp.grados.toString() + "°"
            tvEstatus?.text = ciudadfcp.estatus

        }else if(ciudad == "ciudad-merida"){
            //mostrar informacion ciudadmerida
            tvCiudad?.text = ciudadMerida.nombre
            tvGrados?.text = ciudadMerida.grados.toString() + "°"
            tvEstatus?.text = ciudadMerida.estatus

        }else{
            Toast.makeText(this, "No se encuentra la informacion", Toast.LENGTH_SHORT).show()
        }
    }


}