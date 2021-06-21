package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var frases: Array<String> = arrayOf(//
        "Meu doce, se for demorar pra responder me avisa, que conversamos por carta",//
        "Encontrei o seu Nariz. Estava novamente onde não era chamado",//
        "To igual o Google, a pessoa só me procura quando ta precisando",//
        "Eu não me estresso mais por pouca coisa, e essa pouca coisa inclui você",//
        "Eu nunca cometo o mesmo erro duas vezes...cometo umas 5 vezes só pra ter ctz que é errado mesmo" );

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sortearFrase();
    }

    fun sortearFrase(view : View) {
        sortearFrase();
    }

    fun sortearFrase() {
        var idx = Random.nextInt(0, frases.size - 1);
        var fraseDia = findViewById<TextView>(R.id.textFrase);
        fraseDia.text = frases[idx];
    }
}