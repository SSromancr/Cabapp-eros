package com.example.monitor.cabappneros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Pie extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener{

    GoogleMap mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapa);

        mapFragment.getMapAsync(this);
        /////LOGO/////

        ImageView ButtonLogo = (ImageView) findViewById(R.id.logoB1);
        ButtonLogo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pie.this, MainActivity.class));
            }

        });


        ///////BOTONES/////////

        Button volverParque = (Button) findViewById(R.id.botonH3);
        volverParque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pie.this, Parque.class));
            }
        });

        Button VolverRutas = (Button) findViewById(R.id.botonH1);
        VolverRutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pie.this, Rutas.class));
            }
        });
        Button VolverPuntosdeInteres = (Button) findViewById(R.id.botonH2);
        VolverPuntosdeInteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pie.this, Interes.class));

            }
        });


    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
            mapa = googleMap;
            mapa.setMapType(googleMap.MAP_TYPE_TERRAIN); // Con esta sentencia definimos el tipo de mapa que queremos usar
            googleMap.getUiSettings().setZoomControlsEnabled(true); // Poner botones para controlar el zoom
            LatLng Viñuela = new LatLng (39.4099407, -4.506932300000017); // Latitud y Longitud de un punto
            LatLng Sendero_de_Los_Navalucillos = new LatLng (39.573148846343194, -4.647007983593767);
            LatLng Senda_Botanica_y_Etnografica = new LatLng (39.289940486407026, -4.338017505078142);
            mapa.moveCamera(CameraUpdateFactory.newLatLngZoom(Viñuela, 10)); // Zoom a la parte del mapa indicada

            MarkerOptions viñuela1 = new MarkerOptions().title("Ruta Sendero de la Viñuela").snippet("Distancia: 13 km.(semicircular)\nDifcultad: Moderada \n\nPinche para Audioguía").position(Viñuela).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointpie)); // Poner un marcador
            mapa.addMarker(viñuela1);
            MarkerOptions Senda_Botanica_y_Etnografica1 = new MarkerOptions().title("Ruta Senda Botánica y Etnográfica").snippet("Distancia: 19 km.\nDifcultad: Alta \n\nPinche para Audioguía").position(Senda_Botanica_y_Etnografica).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointpie));
            mapa.addMarker(Senda_Botanica_y_Etnografica1);
            MarkerOptions Sendero_de_Los_Navalucillos1 = new MarkerOptions().title("Ruta Sendero de Los Navalucillos").snippet("Distancia: 4 km.(ida)\nDuración: 3h.45min (ida)\nDifcultad: Media \n\nPinche para Audioguía").position(Sendero_de_Los_Navalucillos).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointpie));
            mapa.addMarker(Sendero_de_Los_Navalucillos1);

            mapa.setInfoWindowAdapter(new UserInfoWindowAdapter2(getLayoutInflater())); // Layout Rutas

            mapa.setOnInfoWindowClickListener(this);
    }


    @Override

        public void onInfoWindowClick(Marker marker) {
            switch (marker.getTitle()){
                case "Ruta Sendero de la Viñuela":
                    startActivity(new Intent(Pie.this, Vinuela.class));
                    break;
                case "Ruta Senda Botánica y Etnográfica":
                    startActivity(new Intent(Pie.this, Botanica.class));
                    break;
                case "Ruta Sendero de Los Navalucillos":
                    startActivity(new Intent(Pie.this, Navalucillos.class));
                    break;

            }
        }
    }
