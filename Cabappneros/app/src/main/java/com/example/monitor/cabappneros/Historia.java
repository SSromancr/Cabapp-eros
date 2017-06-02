package com.example.monitor.cabappneros;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.TextView;

import tools.ComunityTools;

public class Historia extends AppCompatActivity implements View.OnClickListener {
    ImageView imagenC1, imagenC2, imagenC3, imagenC4, imagenC5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);

        ////////HISTORIA//////////

        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/ClementePDai-Regular.ttf");


        TextView textView = (TextView) findViewById(R.id.textoC1);
        textView.setTypeface(miPropiaTypeFace);


        SpannableString s1 = new SpannableString("Descripción del parque\n" + "\n" + "El Parque Nacional de Cabañeros, declarado en 1995, se encuentra situado en el centro de España, en la Comunidad Autónoma de Castilla La Mancha, encuadrado en el entorno de los Montes de Toledo, entre las provincias de Ciudad Real y Toledo. Recibe su nombre de los tradicionales chozas o cabañas cónicas, techadas con vegetación del entorno y utilizadas por pastores, carboneros, etc. como refugio temporal.\n" + "\n" + "Es uno de los parques más grandes de la Red de Parques Nacionales, con 40.856 hectáreas y es el ejemplo más representativo del bosque mediterráneo ibérico, tanto en la superficie que ocupa como a nivel de conservación, de representatividad de hábitats y de biodiversidad, acogiendo junto al vecino P.N. de Monfragüe la colonia más grande del mundo de buitre negro, especie amenazada con una de las mayores envergaduras de Europa.\n" + "\n" + "Es también el hogar de especies de aves protegidas como el águila imperial ibérica, águila culebrera o la cigüeña común. Entre los mamíferos más representativos, el ciervo es la especie más característica del Parque, protagonizando el espectáculo de la berrea cada otoño. El lince ibérico, que antaño fue abundante, desapareció en la segunda mitad del siglo pasado pero gracias a su reintroducción se está poco a poco asentando en los Montes de Toledo y es probable que en pocos años vuelva a colonizar el Parque.\n" + "\n" + "El paisaje característico de Cabañeros lo forma la combinación de la raña cubierta por dehesas generalmente de encina y quejigos, y ls sierras que la circundan, hábitat de una amplia variedad de especies vegetales que dependiendo de la altitud, orientación y tipo de suelo, puede dar lugar a paisajes vegetales de lo más variados, desde los encinares-alcornocales mesomediterráneos que albergan las laderas de orientación sur, a los robledales supramediterráneos que se asientan en las zonas altas de los montes y sierras del Parque, pasando por formaciones vegetales de carácter atlántico, relictas y muy sensibles a la mano del hombre, como los bosques riparios asentados en torno a humedales, cursos de agua y fondos de valle, con presencia abedules o loros entre sus especies más llamativas, y los bosquetes de tejo y enclaves con presencia de acebo.\n" + "\n" + "\n" + "Historia\n" + "\n" + "La historia del Parque Nacional de Cabañeros está marcada por la reivindación y la lucha de los habitantes del entorno.\n" + "\n" + "En 1982 el Ministerio de Defensa manifestó su pretensión de crear un campo de tiro en los territorios del Parque, que por aquel entonces no gozaban de protección. Esto generó malestar en la población del entorno, en colectivos ecologistas y algunos grupos políticos, que se movilizaron para impedir que la zona se convirtiera en un campo de tiro militar, exigiendo su protección. La Junta de Castilla La Mancha reaccionó y en 1988 declaró el Parque Natural de Cabañeros para garantizar su conservación aunque pocos días de después se declaró el municipio de Anchuras como Zona de Interés para la Defensa, lo que volvió a generar malestar entre los vecinos del municipio y de otros cercanos. Finalmente en 1995 se declaró como Parque Nacional, la máxima categoría de protección, asegurando su conservación total, tanto de los límites interiores al Parque como de las zonas colindantes.");


        int flag = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE;
        s1.setSpan(new StyleSpan(Typeface.BOLD), 0, 22, flag);
        s1.setSpan(new StyleSpan(Typeface.BOLD), 2233, 2244, flag);

        SpannableStringBuilder builder = new SpannableStringBuilder();
        builder.append(s1);

        textView.setText(builder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());


        /////LOGO/////

        ImageView ButtonLogo = (ImageView) findViewById(R.id.logoB1);
        ButtonLogo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Historia.this, MainActivity.class));
            }

        });


        ///////BOTONES/////////

        Button volverParque = (Button) findViewById(R.id.botonC3);
        volverParque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Historia.this, Parque.class));
            }
        });

        Button VolverRutas = (Button) findViewById(R.id.botonC1);
        VolverRutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Historia.this, Rutas.class));
            }
        });
        Button VolverPuntosdeInteres = (Button) findViewById(R.id.botonC2);
        VolverPuntosdeInteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Historia.this, Interes.class));

            }
        });


        imagenC1 = (ImageView) findViewById(R.id.imagenC1);
        imagenC2 = (ImageView) findViewById(R.id.imagenC2);
        imagenC3 = (ImageView) findViewById(R.id.imagenC3);
        imagenC4 = (ImageView) findViewById(R.id.imagenC4);
        imagenC5 = (ImageView) findViewById(R.id.imagenC5);


        imagenC1.setOnClickListener(this);
        imagenC2.setOnClickListener(this);
        imagenC3.setOnClickListener(this);
        imagenC4.setOnClickListener(this);
        imagenC5.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        ImageView x = ComunityTools.abrirPopup(v,this);

        switch (v.getId()) {
            case R.id.imagenC1:

                x.setImageResource(R.mipmap.rutaplazamoros2);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);

                break;
            case R.id.imagenC2:

                x.setImageResource(R.mipmap.rutanavalrincon1);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;
            case R.id.imagenC3:

                x.setImageResource(R.mipmap.aguilaimperial);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;
            case R.id.imagenC4:

                x.setImageResource(R.mipmap.cabana);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;
            case R.id.imagenC5:

                x.setImageResource(R.mipmap.rutaboqueronestena2);
                ComunityTools.popupWindow.showAsDropDown(v, 140, -2000);
                break;


        }



    }


        }



