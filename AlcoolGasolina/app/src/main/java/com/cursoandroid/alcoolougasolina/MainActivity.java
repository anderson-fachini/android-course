package com.cursoandroid.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoAlcool, editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularPreco(View view) {
        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = editPrecoGasolina.getText().toString();

        boolean camposValidados = validarCampos(precoAlcool,precoGasolina);
        if (camposValidados) {
            Double valorAlcool = Double.valueOf(precoAlcool);
            Double valorGasolina = Double.valueOf(precoGasolina);

            if (valorAlcool / valorGasolina >= 0.7) {
                textResultado.setText("Melhor utilizar gasolina!");
            } else {
                textResultado.setText("Melhor utilizar álcool!");
            }
        } else {
            textResultado.setText("Preencha os preços primeiro!");
        }
    }

    public boolean validarCampos(String pAlcool, String pGasolina) {
        return pAlcool != null && !pAlcool.isEmpty() && pGasolina != null && !pGasolina.isEmpty();
    }
}