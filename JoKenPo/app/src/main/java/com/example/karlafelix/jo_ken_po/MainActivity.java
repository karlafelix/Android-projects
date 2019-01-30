package com.example.karlafelix.jo_ken_po;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int escolhaUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // 1 - PEDRA  |||  2 - PAPEL ||| 3 - TESOURA |||

    public void selecionarPedra(View view){
        escolhaUsuario = 1;

    }

    public void selecionarPapel(View view){
        escolhaUsuario = 2;

    }

    public void selecionarTesoura(View view){
        escolhaUsuario = 3;

    }

    public void Jogar(View view){

        ImageView imagemResultado = (ImageView) findViewById(R.id.cpu_choose);

        TextView text = findViewById(R.id.frase);

        int numero = new Random().nextInt(3);;


        switch(numero) {

            case 1:
                imagemResultado.setImageResource(R.drawable.pedra);
                if(escolhaUsuario == 1){
                    text.setText("Empate!");
                    break;
                }
                else if(escolhaUsuario == 2){
                    text.setText("Você ganhou!!");
                    break;
                }
                else if(escolhaUsuario == 3){
                    text.setText("Você perdeu!");
                    break;
                }
            case 2:
                imagemResultado.setImageResource(R.drawable.papel);
                if(escolhaUsuario == 1){
                    text.setText("Você perdeu!");
                    break;
                }
                else if(escolhaUsuario == 2){
                    text.setText("Empate!");
                    break;
                }
                else if(escolhaUsuario == 3){
                    text.setText("Você ganhou!!");
                    break;
                }
            case 3:
                imagemResultado.setImageResource(R.drawable.tesoura);
                if(escolhaUsuario == 1){
                    text.setText("Você ganhou!!");
                    break;
                }
                else if(escolhaUsuario == 2){
                    text.setText("Você perdeu!");
                    break;
                }
                else if(escolhaUsuario == 3){
                    text.setText("Empate!");
                    break;
                }
        }
    }
}
