package com.example.monitor.cabappneros;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import tools.ComunityTools;


public class Fauna extends AppCompatActivity implements View.OnClickListener {
    ImageView imagenD1, imagenD2, imagenD3, imagenD4, imagenD5,imagenD6,imagenD7,imagenD8;
    PopupWindow popupWindow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fauna);

        /////////////////TEXTO REGULAR///////
        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/ClementePDai-Regular.ttf");
        TextView tituloT = (TextView) findViewById(R.id.textoD1);
        tituloT.setTypeface(miPropiaTypeFace);

        //////////TEXTO NEGRITA//////
        Typeface miPropiaTypeFace11 = Typeface.createFromAsset(getAssets(), "fonts/ClementePDam-Bold.ttf");
        TextView tituloT1 = (TextView) findViewById(R.id.textoD2);
        tituloT1.setTypeface(miPropiaTypeFace);

        /////LOGO////
        ImageView ButtonLogo = (ImageView) findViewById(R.id.logoB1);
        ButtonLogo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fauna.this, MainActivity.class));
            }

        });

        ///////BOTONES/////////

        Button volverParque = (Button) findViewById(R.id.botonD3);
        volverParque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fauna.this, Parque.class));
            }
        });

        Button VolverRutas = (Button) findViewById(R.id.botonD1);
        VolverRutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fauna.this, Rutas.class));
            }
        });
        Button VolverPuntosdeInteres = (Button) findViewById(R.id.botonD2);
        VolverPuntosdeInteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fauna.this, Interes.class));

            }
        });


        imagenD1 = (ImageView) findViewById(R.id.imagenD1);
        imagenD2 = (ImageView) findViewById(R.id.imagenD2);
        imagenD3 = (ImageView) findViewById(R.id.imagenD3);
        imagenD4 = (ImageView) findViewById(R.id.imagenD4);
        imagenD5 = (ImageView) findViewById(R.id.imagenD5);
        imagenD6 = (ImageView) findViewById(R.id.imagenD6);
        imagenD7 = (ImageView) findViewById(R.id.imagenD7);
        imagenD8 = (ImageView) findViewById(R.id.imagenD8);


        imagenD1.setOnClickListener(this);
        imagenD2.setOnClickListener(this);
        imagenD3.setOnClickListener(this);
        imagenD4.setOnClickListener(this);
        imagenD5.setOnClickListener(this);
        imagenD6.setOnClickListener(this);
        imagenD7.setOnClickListener(this);
        imagenD8.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        ImageView x = ComunityTools.abrirPopup(v,this);

        switch (v.getId()) {
            case R.id.imagenD1:

                x.setImageResource(R.mipmap.aguilareal);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);

                break;
            case R.id.imagenD2:

                x.setImageResource(R.mipmap.alimoche);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;
            case R.id.imagenD3:

                x.setImageResource(R.mipmap.buitreleonado);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;
            case R.id.imagenD4:

                x.setImageResource(R.mipmap.calandino);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;
            case R.id.imagenD5:

                x.setImageResource(R.mipmap.ciervos);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;
            case R.id.imagenD6:

                x.setImageResource(R.mipmap.gamo);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;
            case R.id.imagenD7:

                x.setImageResource(R.mipmap.lince);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;
            case R.id.imagenD8:

                x.setImageResource(R.mipmap.grulla);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;


        }

    }

    }









