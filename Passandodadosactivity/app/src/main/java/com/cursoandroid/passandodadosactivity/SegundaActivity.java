package com.cursoandroid.passandodadosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome, textIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);

        // recuperar os dados
        Bundle dados = getIntent().getExtras();
        Usuario usuario = (Usuario) dados.getSerializable("objeto");
        String email = dados.getString("nome");

        textNome.setText(usuario.getEmail());
        textIdade.setText(Integer.toString(dados.getInt("idade")));

    }
}