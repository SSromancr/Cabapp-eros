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
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ComoLlegar extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_llegar);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapa);

        mapFragment.getMapAsync(this);

        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/ClementePDai-Regular.ttf");
        TextView textView = (TextView) findViewById(R.id.textoF2);
        textView.setTypeface(miPropiaTypeFace);

        SpannableString s = new SpannableString("El Parque Nacional de Cabañeros, se encuentra enclavado entre las provincias de Ciudad Real y Toledo, en la Comunidad Autónoma de Castilla La Mancha.\n" +
                "\n" +
                "Vehículo propio:\n" +
                "Se puede llegar perfectamente en vehículo\n" +
                "\n" +
                "Autobus:\n" +
                "Desde Ciudad Real\n" +
                "Desde Toledo\n" +
                "\n" +
                "Tren de Alta Velocidad (AVE):\n" + "Desde las estaciones de Ciudad Real o Toledo");

        int flag = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE;
        s.setSpan(new StyleSpan(Typeface.BOLD), 150, 168, flag);
        s.setSpan(new StyleSpan(Typeface.BOLD), 211, 220, flag);
        s.setSpan(new StyleSpan(Typeface.BOLD), 250, 280, flag);

        SpannableStringBuilder builder = new SpannableStringBuilder();
        builder.append(s);

        textView.setText(builder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());


        /////LOGO/////

        ImageView ButtonLogo = (ImageView) findViewById(R.id.logoB1);
        ButtonLogo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(ComoLlegar.this, MainActivity.class));
            }

        });


        ///////BOTONES/////////

        Button volverLLegar = (Button) findViewById(R.id.botonF3);
        volverLLegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ComoLlegar.this, Parque.class));
            }
        });

        Button VolverRutas = (Button) findViewById(R.id.botonF1);
        VolverRutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ComoLlegar.this, Rutas.class));
            }
        });
        Button VolverPuntosdeInteres = (Button) findViewById(R.id.botonF2);
        VolverPuntosdeInteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ComoLlegar.this, Interes.class));

            }
        });

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapa = googleMap;
        mapa.setMapType(googleMap.MAP_TYPE_TERRAIN); // Con esta sentencia definimos el tipo de mapa que queremos usar
        googleMap.getUiSettings().setZoomControlsEnabled(true); // Poner botones para controlar el zoom

        LatLng Casa_Palillos  = new LatLng(39.289940486407026, -4.338017505078142);
        mapa.moveCamera(CameraUpdateFactory.newLatLngZoom(Casa_Palillos, 10)); // Zoom a la parte del mapa indicada

        MarkerOptions Casa_Palillos1 = new MarkerOptions().title("Casa de los Palillos").position(Casa_Palillos).icon(BitmapDescriptorFactory.fromResource(R.mipmap.home)); // Poner un marcador
        mapa.addMarker(Casa_Palillos1);

        mapa.setInfoWindowAdapter(new UserInfoWindowAdapter1(getLayoutInflater())); // Layout Rutas

    }

}
