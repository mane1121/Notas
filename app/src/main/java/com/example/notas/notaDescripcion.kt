package com.example.notas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class notaDescripcion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_nota_descripcion)

        //val button: Button = findViewById(R.id.btnRegresar)
        //button.setOnClickListener {
          //  val intento1 = Intent(this, MainActivity::class.java)
            //startActivity(intento1)
        //}
    }
    fun abrirMenuPrincipal(view: View){
        val intent = Intent(this,MainActivity::class.java).apply {  }
        startActivity(intent)
    }
}