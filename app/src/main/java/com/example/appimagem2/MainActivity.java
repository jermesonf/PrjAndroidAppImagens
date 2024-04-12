package com.example.appimagem2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imagem;
    EditText txtNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagem = findViewById(R.id.imgQuadro);
        txtNumero = findViewById(R.id.txtNumero);

    }

    public void teste (View V)
    {
        double num1;
        String vazio;
        try
        {
            num1 = Double.parseDouble(txtNumero.getText().toString());
            vazio = txtNumero.getText().toString();
        }
        catch (Exception erro)
        {
            num1=0;
            vazio = "";
        }
            if (vazio == "")
            {
                imagem.setImageResource(R.drawable.naruto);
                Toast.makeText(this, "Digite um valor", Toast.LENGTH_SHORT).show();
            }
            else if (num1 > 0) {
                imagem.setImageResource(R.drawable.positivo);
                Toast.makeText(this, "Positivo",Toast.LENGTH_SHORT).show();
            } else if (num1 == 0) {
                imagem.setImageResource(R.drawable.neutro);
                Toast.makeText(this, "Neutro",Toast.LENGTH_SHORT).show();
            }
            else {
                imagem.setImageResource(R.drawable.negativo);
                Toast.makeText(this, "Negativo",Toast.LENGTH_SHORT).show();
            }
    }
}