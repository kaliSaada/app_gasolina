package com.fiap.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnCalcular = findViewById<Button>(R.id.btnCalcular)
        // Função que implementa o evento de clique em um botão
        btnCalcular.setOnClickListener { view : View? ->
            var txtAlcool = findViewById<EditText>(R.id.txtPrecoAlcool)
            // declaração implícita do tipo da variável
            var precoAlcool = txtAlcool.text.toString().toDouble()
            var txtGasolina = findViewById<EditText>(R.id.txtPrecoGasolina)
            var precoGasolina = txtGasolina.text.toString().toDouble()
            // declaração explícita do tipo da variável
            var resultado : Double = precoAlcool / precoGasolina
            Log.d("TESTE","$resultado")
            var mensagem = ""
            if (resultado > 0.7) {
                mensagem = "Gasolina"
            } else if (resultado < 0.7) {
                mensagem = "Álcool"
            } else {
                mensagem = "Tanto faz"
            }
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
        }
    }
}
