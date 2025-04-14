package com.example.prova1

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Quemtranferir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quemtranferir)

        val valor = intent.getDoubleExtra("valor_transferido", 0.0)

        val textoTransferencia = findViewById<TextView>(R.id.textoTransferencia)
        textoTransferencia.text = "Para quem você quer transferir R$ %.2f?".format(valor)
    }
}