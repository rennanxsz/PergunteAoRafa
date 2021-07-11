package com.example.pergunteaorafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){

        String[] frases = {
                "Depois a gente vê isso.",
                "Precisa ver com o Marcos.",
                "Já passou para o Guto?.",
                "Não vai fazer depois do horario!"
        };

        int numero = new Random().nextInt(4);
        TextView respostas = findViewById(R.id.textResultado);
        respostas.setText(frases[numero]);

    }
}