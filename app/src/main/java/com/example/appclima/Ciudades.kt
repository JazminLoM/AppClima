package com.example.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {

    val TAG = "com.example.appclima.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bFelipe = findViewById<Button>(R.id.bFelipe)
        val bMerida = findViewById<Button>(R.id.bMerida)
        val bMexico = findViewById<Button>(R.id.bMexico)
        val bCancun = findViewById<Button>(R.id.bCancun)

        bFelipe.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-felipe")
            startActivity(intent)
        })
        bMerida.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-merida")
            startActivity(intent)
        })
        bMexico.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-mexico")
            startActivity(intent)
        })
        bCancun.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-cancun")
            startActivity(intent)
        })

    }
}