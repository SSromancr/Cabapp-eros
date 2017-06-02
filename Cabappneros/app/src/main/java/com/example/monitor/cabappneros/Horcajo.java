package com.example.monitor.cabappneros;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
import com.google.android.gms.maps.model.PolylineOptions;

public class Horcajo extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horcajo);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapa);

        mapFragment.getMapAsync(this);

        //////////TEXTO NEGRITA//////
        Typeface miPropiaTypeFace11 = Typeface.createFromAsset(getAssets(), "fonts/ClementePDam-Bold.ttf");
        TextView tituloT1 = (TextView) findViewById(R.id.textoL1);
        tituloT1.setTypeface(miPropiaTypeFace11);

        /////LOGO/////

        ImageView ButtonLogo = (ImageView) findViewById(R.id.logoB1);
        ButtonLogo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Horcajo.this, MainActivity.class));
            }

        });


        ///////BOTONES/////////

        Button volverParque = (Button) findViewById(R.id.botonL3);
        volverParque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Horcajo.this, Parque.class));
            }
        });

        Button VolverRutas = (Button) findViewById(R.id.botonL1);
        VolverRutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Horcajo.this, Rutas.class));
            }
        });
        Button VolverPuntosdeInteres = (Button) findViewById(R.id.botonL2);
        VolverPuntosdeInteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Horcajo.this, Interes.class));

            }
        });


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapa = googleMap;
        mapa.setMapType(googleMap.MAP_TYPE_TERRAIN); // Con esta sentencia definimos el tipo de mapa que queremos usar
        googleMap.getUiSettings().setZoomControlsEnabled(true); // Poner botones para controlar el zoom
        LatLng Visita_4x4_desde_el_Centro_de_Visitantes_de_Horcajo_de_Los_Montes = new LatLng(39.31863183956818, -4.622288745312517);
        LatLng Parque_Cabañeros = new LatLng(39.387655366773174, -4.508305591015642);

        mapa.moveCamera(CameraUpdateFactory.newLatLngZoom(Parque_Cabañeros , 10)); // Zoom a la parte del mapa indicada

        MarkerOptions Visita_4x4_desde_Horcajo = new MarkerOptions().title("Horcajo de los Montes").position( Visita_4x4_desde_el_Centro_de_Visitantes_de_Horcajo_de_Los_Montes ).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointinteres)); // Poner un marcador
        mapa.addMarker(Visita_4x4_desde_Horcajo);
        MarkerOptions Parque_Cabañeros_1  = new MarkerOptions().title("Parque de Cabañeros").position(Parque_Cabañeros).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointinteres)); // Poner un marcador
        mapa.addMarker(Parque_Cabañeros_1);


        mapa.addPolyline((new PolylineOptions()).add(  Visita_4x4_desde_el_Centro_de_Visitantes_de_Horcajo_de_Los_Montes, Parque_Cabañeros ).color(Color.BLACK).width(25)); // Añadir linea de ruta entre 2 puntos

        mapa.setInfoWindowAdapter(new UserInfoWindowAdapter1(getLayoutInflater())); // Layout 2, puntos de interes

    }
}







