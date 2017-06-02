package com.example.monitor.cabappneros;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Navalucillos extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer mediaPlayer = new MediaPlayer();
    ImageView Play, Stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navalucillos);

        Play = (ImageView) findViewById(R.id.imagenQ2);
        Stop = (ImageView) findViewById(R.id.imagenQ1);
        Play.setOnClickListener(this);
        Stop.setOnClickListener(this);
        mediaPlayer = MediaPlayer.create(this,R.raw.navalucillos);
        mediaPlayer.setLooping(false);

        /////LOGO/////

        ImageView ButtonLogo = (ImageView) findViewById(R.id.logoB1);
        ButtonLogo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Navalucillos.this, MainActivity.class));
            }

        });


        ///////BOTONES/////////

        Button volverParque = (Button) findViewById(R.id.botonQ3);
        volverParque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Navalucillos.this, Parque.class));
            }
        });

        Button VolverRutas = (Button) findViewById(R.id.botonQ1);
        VolverRutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Navalucillos.this, Rutas.class));
            }
        });
        Button VolverPuntosdeInteres = (Button) findViewById(R.id.botonQ2);
        VolverPuntosdeInteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Navalucillos.this, Interes.class));

            }
        });



        /////////////////TEXTO REGULAR///////
        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/ClementePDai-Regular.ttf");
        TextView tituloT = (TextView) findViewById(R.id.textoQ1);
        tituloT.setTypeface(miPropiaTypeFace);

        //////////TEXTO NEGRITA//////
        Typeface miPropiaTypeFace11 = Typeface.createFromAsset(getAssets(), "fonts/ClementePDam-Bold.ttf");
        TextView tituloT1 = (TextView) findViewById(R.id.textoQ2);
        tituloT1.setTypeface(miPropiaTypeFace);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imagenQ2:
                mediaPlayer.start();
                break;
            case R.id.imagenQ1:
                mediaPlayer.pause();
                break;
        }


    }
    @Override
    public void onDestroy(){
        if(mediaPlayer != null){
            if(mediaPlayer.isPlaying()){
                mediaPlayer.stop();
            }
            mediaPlayer.release();
        }
        super.onDestroy();

    }

}
