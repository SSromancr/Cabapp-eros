package com.example.monitor.cabappneros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Rutas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutas);
        /////LOGO////////
        ImageView ButtonLogo = (ImageView) findViewById(R.id.logoB1);
        ButtonLogo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rutas.this, MainActivity.class));
            }

        });

        ///////BOTONES/////////

        Button volverParque = (Button) findViewById(R.id.botonG1);
        volverParque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rutas.this, Parque.class));
            }
        });


        Button VolverPuntosdeInteres = (Button) findViewById(R.id.botonG2);
        VolverPuntosdeInteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rutas.this, Interes.class));

            }
        });

        ImageView imagenG1 = (ImageView) findViewById(R.id.imagenG1);
        imagenG1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rutas.this, Pie.class));
            }

        });
        ImageView imagenG2 = (ImageView) findViewById(R.id.imagenG2);
        imagenG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rutas.this, Bici.class));
            }
        });

        ImageView imagenG3 = (ImageView) findViewById(R.id.imagenG3);
        imagenG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rutas.this, Toterreno.class));

            }
        });
    }
}

