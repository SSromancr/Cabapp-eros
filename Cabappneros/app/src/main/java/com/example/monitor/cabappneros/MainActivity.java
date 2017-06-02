package com.example.monitor.cabappneros;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ////////BOTONES////////

        ImageView ButtonHistoria = (ImageView) findViewById(R.id.imagenA1);
        ButtonHistoria.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Parque.class));
            }
        });
        ImageView imagenA2 = (ImageView) findViewById(R.id.imagenA2);
        imagenA2.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Rutas.class));
            }
        });
        ImageView imagenA3 = (ImageView) findViewById(R.id.imagenA3);
        imagenA3.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Interes.class));
            }
        });

       //////////NEGRITA//////////////

        ///////PRINCIPAL////

        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/ClementePDam-Bold.ttf");
        TextView titulo = (TextView) findViewById(R.id.a1);
        titulo.setTypeface(miPropiaTypeFace);






      /*   TextView titulo2 = (TextView) findViewById(R.id.button2);
        titulo2.setTypeface(miPropiaTypeFace);

        TextView titulo3 = (TextView) findViewById(R.id.button);
        titulo3.setTypeface(miPropiaTypeFace);*/



    }



}
