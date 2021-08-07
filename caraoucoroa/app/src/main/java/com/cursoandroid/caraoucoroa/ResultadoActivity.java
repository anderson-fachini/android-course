package com.cursoandroid.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageViewMoeda;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageViewMoeda = findViewById(R.id.imageViewMoeda);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        int random = new Random().nextInt(2);

        if (random == 1) {
            imageViewMoeda.setImageResource(R.drawable.moeda_cara);
        } else {
            imageViewMoeda.setImageResource(R.drawable.moeda_coroa);
        }

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}