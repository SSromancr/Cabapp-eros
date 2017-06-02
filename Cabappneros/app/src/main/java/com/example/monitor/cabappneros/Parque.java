package com.example.monitor.cabappneros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Parque extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque);

        ImageView ButtonLogo = (ImageView) findViewById(R.id.logoB1);
        ButtonLogo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Parque.this, MainActivity.class));
            }

        });

        ImageView ButtonHistoria = (ImageView) findViewById(R.id.imagenB1);
        ButtonHistoria.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Parque.this, Historia.class));
            }

        });
        ImageView ButtonFauna = (ImageView) findViewById(R.id.imagenB2);
        ButtonFauna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Parque.this,Fauna.class));
            }
        });

        ImageView ButtonFlora = (ImageView) findViewById(R.id.imagenB3);
        ButtonFlora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Parque.this,Flora.class));

            }
        });


        ImageView ButtonComoLlegar = (ImageView) findViewById(R.id.imagenB4);
        ButtonComoLlegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Parque.this,ComoLlegar.class));

            }
        });


        Button VolverPuntosDeInteres3 = (Button) findViewById(R.id.botonRutaB2);
        VolverPuntosDeInteres3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Parque.this,Interes.class));
            }
        });
        Button VolverRutas3 = (Button) findViewById(R.id.botonRutaB1);
        VolverRutas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Parque.this,Rutas.class));

            }
        });


    }

}
