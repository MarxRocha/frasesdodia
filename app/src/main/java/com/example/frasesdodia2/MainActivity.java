package com.example.frasesdodia2;

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
    public void gerarNovaFrase(View view){

        String[] frase = {
                    "Frase1",
                    "Frase2",
                    "Frase3",
                    "Frase4"


        };
        int valor = new Random().nextInt(4);
        TextView texto = findViewById(R.id.textFrase);
        texto.setText(frase[valor]);
    }
}