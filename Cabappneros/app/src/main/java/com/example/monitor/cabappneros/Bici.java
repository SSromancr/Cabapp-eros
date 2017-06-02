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
import com.google.android.gms.maps.model.MarkerOptions;

public class Bici extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap mapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bici);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapa);

        mapFragment.getMapAsync(this);
        /////LOGO/////

        ImageView ButtonLogo = (ImageView) findViewById(R.id.logoB1);
        ButtonLogo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bici.this, MainActivity.class));
            }

        });


        ///////BOTONES/////////

           Button volverParque = (Button) findViewById(R.id.botonI3);
        volverParque.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        startActivity(new Intent(Bici.this, Parque.class));
        }
        });

        Button VolverRutas = (Button) findViewById(R.id.botonI1);
        VolverRutas.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        startActivity(new Intent(Bici.this, Rutas.class));
        }
        });
        Button VolverPuntosdeInteres = (Button) findViewById(R.id.botonI2);
        VolverPuntosdeInteres.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        startActivity(new Intent(Bici.this, Interes.class));

        }
        });


        }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapa = googleMap;
        mapa.setMapType(googleMap.MAP_TYPE_TERRAIN); // Con esta sentencia definimos el tipo de mapa que queremos usar
        googleMap.getUiSettings().setZoomControlsEnabled(true); // Poner botones para controlar el zoom
        LatLng Viñuela = new LatLng (39.4099407, -4.506932300000017); // Latitud y Longitud de un punto
        LatLng Gargantilla = new LatLng (39.484173714548554, -4.592076342968767);
        LatLng ColadaNavalrincon = new LatLng (39.36323945253431, -4.256993335156267);
        LatLng Boqueron = new LatLng (39.488413210725206, -4.523411792187517);
        LatLng LosMoros = new LatLng (39.31650695750095, -4.616795581250017);
        mapa.moveCamera(CameraUpdateFactory.newLatLngZoom(Viñuela, 10)); // Zoom a la parte del mapa indicada



        MarkerOptions ColadaNavalrincon1 = new MarkerOptions().title("Ruta Colada de Navalrincón/Senda Botánica y Fluvial").snippet("Distancia: 9,5km (ida)\nDifcultad: Baja").position(ColadaNavalrincon).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointbici));
        mapa.addMarker(ColadaNavalrincon1);
        MarkerOptions gargantilla1 = new MarkerOptions().title("Ruta Sendero de Gargantilla").snippet("Distancia: 5km (circular)\nDifcultad: Media").position(Gargantilla).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointbici));
        mapa.addMarker(gargantilla1);
        MarkerOptions boqueron1 = new MarkerOptions().title("Ruta Boquerón de Estena").snippet("Distancia: 8 km.(ida y vuelta)\nDifcultad: Baja").position(Boqueron).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointbici));
        mapa.addMarker(boqueron1);
        MarkerOptions LosMoros1 = new MarkerOptions().title("Ruta Los Moros/Castellar de los Bueyes").snippet("Distancia: 3,5 km.(circular)\nDifcultad: Media-Baja").position(LosMoros).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointbici));
        mapa.addMarker(LosMoros1);

        mapa.setInfoWindowAdapter(new UserInfoWindowAdapter2(getLayoutInflater())); // Layout Rutas
    }
}
