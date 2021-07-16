package com.cursoandroid.componentesbsicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private EditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;

    private RadioButton sexoMasculino, sexoFemino;

    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);

        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);

        sexoMasculino = findViewById(R.id.radioMasculino);
        sexoFemino = findViewById(R.id.radioFeminino);

        opcaoSexo = findViewById(R.id.radioGroupSexo);

        radioButton();
    }

    public void checkbox() {
        String texto = "";
        List<CheckBox> checkBoxes = List.of(checkVerde, checkBranco, checkVermelho);

        for (CheckBox checkBox : checkBoxes) {
            if (checkBox.isChecked()) {
                texto += checkBox.getText() + " selecionado - ";
            }
        }

        textoResultado.setText(texto);
    }

    public void radioButton() {
        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String texto = "";
                if (checkedId == R.id.radioMasculino) {
                    texto += "Sexo masculino";
                } else {
                    texto += "Sexo feminino";
                }
                textoResultado.setText(texto);
            }
        });

//        String texto = "";
//
//        if (sexoMasculino.isChecked()) {
//            texto += "Sexo masculino";
//        }
//        if (sexoFemino.isChecked()) {
//            texto += "Sexo feminino";
//        }
//
//        textoResultado.setText(texto);
    }

    public void enviar(View view) {
        checkbox();
        //radioButton();

//        String nome = campoNome.getText().toString();
//        String email = campoEmail.getText().toString();
//        String texto = "Nome: " + nome + "\nEmail: " + email;
//
//        textoResultado.setText(texto);
    }

    public void limpar(View view) {
        campoNome.setText("");
        campoEmail.setText("");
        textoResultado.setText("");
    }
}