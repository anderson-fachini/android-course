package com.cursoandroid.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBarHorizontal, progressBarCircular;

    private int progresso = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBarCircular = findViewById(R.id.progressBarCircular);
        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);

        progressBarCircular.setVisibility(View.GONE);
    }

    public void carregarProgressBar(View view) {
        this.progresso ++;

        progressBarHorizontal.setProgress(progresso);

        progressBarCircular.setVisibility(View.VISIBLE);

        if (progresso == 10) {
            progressBarCircular.setVisibility(View.GONE);
        }
    }
}