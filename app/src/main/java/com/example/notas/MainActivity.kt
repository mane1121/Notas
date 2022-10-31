package com.example.notas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val button: Button = findViewById(R.id.FbtnAgregarNota)
        //button.setOnClickListener {
          //  val intento1 = Intent(this, notaDescripcion::class.java)
           // startActivity(intento1)
        //}
    }
    fun abrirNotas(view: View){
        val intent = Intent(this,notaDescripcion::class.java).apply {  }
        startActivity(intent)
    }
}