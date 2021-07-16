package com.cursoandroid.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextView textGorjeta, textTotal, textPorcentagem;
    private SeekBar seekBarPercentual;
    private TextInputEditText inputTextValor;

    private double porcentagem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textGorjeta = findViewById(R.id.textGorjeta);
        textTotal = findViewById(R.id.textTotal);
        textPorcentagem = findViewById(R.id.textPorcentagem);
        seekBarPercentual = findViewById(R.id.seekBarPercentual);
        inputTextValor = findViewById(R.id.inputTextValor);

        seekBarPercentual.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                porcentagem = progress;
                textPorcentagem.setText(progress + "%");
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void calcular() {
        String valorRecuperado = inputTextValor.getText().toString();

        if (valorRecuperado == null || valorRecuperado.isEmpty()) {
            Toast.makeText(
                    getApplicationContext(),
                    "Digite um valor primeiro!",
                    Toast.LENGTH_LONG
            ).show();
        } else {
            double valorDigitado = Double.parseDouble(valorRecuperado);
            double gorgeta = valorDigitado * (porcentagem / 100);

            textGorjeta.setText("R$ " + Math.round(gorgeta));

            double total = valorDigitado + gorgeta;
            textTotal.setText("R$ " + Math.round(total));
        }
    }
}