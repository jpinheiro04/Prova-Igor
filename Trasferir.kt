package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Trasferir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trasferir)

        val campoValor = findViewById<EditText>(R.id.valorTransferencia)
        val botaoTransferir = findViewById<ImageButton>(R.id.btntranferencia)

        botaoTransferir.setOnClickListener {
            val textoValor = campoValor.text.toString()
            val valor = textoValor.toDoubleOrNull() ?: 0.0

            val intent = Intent(this, Quemtranferir::class.java)
            intent.putExtra("valor_transferido", valor)
            startActivity(intent)
        }
    }
}
