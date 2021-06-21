package com.example.pedrapepeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jogar(View view) {
        switch (view.getId()) {
            case (R.id.btnOpcaoPedra):
                computarJogada(OpcaoJogo.PEDRA);
                break;
            case (R.id.btnOpcaoPapel):
                computarJogada(OpcaoJogo.PAPEL);
                break;
            case (R.id.btnOpcaoTesoura):
                computarJogada(OpcaoJogo.TESOURA);
                break;
        }
    }

    private OpcaoJogo getOpcaoApp() {
        int idx = new Random().nextInt(3);
        return OpcaoJogo.values()[idx];
    }

    private void computarJogada(OpcaoJogo opcaoUsuario) {
        OpcaoJogo opcaoApp = getOpcaoApp();

        String resultado = "";

        if (opcaoApp == opcaoUsuario) {
            resultado = "Empatou!";
        } else {
            resultado = "Você perdeu :(";
        }

        if ((opcaoUsuario == OpcaoJogo.PEDRA && opcaoApp == OpcaoJogo.TESOURA) || //
                (opcaoUsuario == OpcaoJogo.PAPEL && opcaoApp == OpcaoJogo.PEDRA) || //
                (opcaoUsuario == OpcaoJogo.TESOURA && opcaoApp == OpcaoJogo.PAPEL) ) {
            resultado = "Você ganhou :)";
        }

        TextView textResultado = findViewById(R.id.textResultado);
        textResultado.setText(resultado);

        ImageView img = findViewById(R.id.imageOpcaoApp);
        switch (opcaoApp) {
            case PEDRA: img.setImageResource(R.drawable.pedra); break;
            case PAPEL: img.setImageResource(R.drawable.papel); break;
            case TESOURA: img.setImageResource(R.drawable.tesoura); break;
        }
    }

}