package com.example.tp11

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editNome = findViewById<EditText>(R.id.editNome)
        val editNumero = findViewById<EditText>(R.id.editNumero)
        val Enviar = findViewById<Button>(R.id.btnEnviar)
        val Boas = findViewById<TextView>(R.id.textBoas)

        Enviar.setOnClickListener {
            val nome = editNome.text.toString()
            val Numero = editNumero.text.toString().toInt()

            Boas.text = "Bem-vindo(a), $nome de  $Numero anos."
        }


    }

}