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

public class Flora extends AppCompatActivity implements View.OnClickListener {
    ImageView imagenE1, imagenE2, imagenE3, imagenE4, imagenE5,imagenE6,imagenE7;
    PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flora);

        /////////////////TEXTO REGULAR///////
        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/ClementePDai-Regular.ttf");
        TextView tituloT = (TextView) findViewById(R.id.textoE2);
        tituloT.setTypeface(miPropiaTypeFace);

        //////////TEXTO NEGRITA//////
        Typeface miPropiaTypeFace11 = Typeface.createFromAsset(getAssets(), "fonts/ClementePDam-Bold.ttf");
        TextView tituloT1 = (TextView) findViewById(R.id.textoE1);
        tituloT1.setTypeface(miPropiaTypeFace11);

        ImageView ButtonLogo = (ImageView) findViewById(R.id.logoB1);
        ButtonLogo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Flora.this, MainActivity.class));
            }

        });

        ///////BOTONES/////////

        Button volverParque = (Button) findViewById(R.id.botonE3);
        volverParque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Flora.this, Parque.class));
            }
        });

        Button VolverRutas = (Button) findViewById(R.id.botonE1);
        VolverRutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Flora.this, Rutas.class));
            }
        });
        Button VolverPuntosdeInteres = (Button) findViewById(R.id.botonE2);
        VolverPuntosdeInteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Flora.this, Interes.class));

            }
        });

        imagenE1 = (ImageView) findViewById(R.id.imagenE1);
        imagenE2 = (ImageView) findViewById(R.id.imagenE2);
        imagenE3 = (ImageView) findViewById(R.id.imagenE3);
        imagenE4 = (ImageView) findViewById(R.id.imagenE4);
        imagenE5 = (ImageView) findViewById(R.id.imagenE5);
        imagenE6 = (ImageView) findViewById(R.id.imagenE6);
        imagenE7 = (ImageView) findViewById(R.id.imagenE7);



        imagenE1.setOnClickListener(this);
        imagenE2.setOnClickListener(this);
        imagenE3.setOnClickListener(this);
        imagenE4.setOnClickListener(this);
        imagenE5.setOnClickListener(this);
        imagenE6.setOnClickListener(this);
        imagenE7.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        ImageView x = ComunityTools.abrirPopup(v,this);

        switch (v.getId()) {
            case R.id.imagenE1:

                x.setImageResource(R.mipmap.abedul);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);

                break;
            case R.id.imagenE2:

                x.setImageResource(R.mipmap.acebo);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;
            case R.id.imagenE3:

                x.setImageResource(R.mipmap.alcornoque);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;
            case R.id.imagenE4:

                x.setImageResource(R.mipmap.bosque);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;
            case R.id.imagenE5:

                x.setImageResource(R.mipmap.chorreranavalucillo);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;
            case R.id.imagenE6:

                x.setImageResource(R.mipmap.rioestena);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;
            case R.id.imagenE7:

                x.setImageResource(R.mipmap.robles);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;


        }



    }

}





