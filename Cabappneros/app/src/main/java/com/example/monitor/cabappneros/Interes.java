package com.example.monitor.cabappneros;

import android.content.Intent;
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

public class Interes extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap mapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interes);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapa);

        mapFragment.getMapAsync(this);

        /////LOGO/////

        ImageView ButtonLogo = (ImageView) findViewById(R.id.logoB1);
        ButtonLogo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Interes.this, MainActivity.class));
            }

        });


        ///////BOTONES/////////

        Button volverParque = (Button) findViewById(R.id.botonS2);
        volverParque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Interes.this, Parque.class));
            }
        });

        Button VolverRutas = (Button) findViewById(R.id.botonS1);
        VolverRutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Interes.this, Rutas.class));
            }
        });

        //////////TEXTO NEGRITA//////
        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/ClementePDam-Bold.ttf");
        TextView tituloT1 = (TextView) findViewById(R.id.textoS1);
        tituloT1.setTypeface(miPropiaTypeFace);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapa = googleMap;
        mapa.setMapType(googleMap.MAP_TYPE_TERRAIN); // Con esta sentencia definimos el tipo de mapa que queremos usar
        googleMap.getUiSettings().setZoomControlsEnabled(true); // Poner botones para controlar el zoom
        LatLng Retuerta_del_Bullaque  = new LatLng(39.4637642, -4.411778899999945);
        LatLng Pueblonuevo_del_Bullaque  = new LatLng(39.30056828484957, -4.258366626171892); // Latitud y Longitud de un punto
        LatLng Horcajo_de_Los_Montes = new LatLng(39.31863183956818, -4.622288745312517);
        LatLng Parque_Cabañeros = new LatLng(39.387655366773174, -4.508305591015642);
        LatLng Alcoba_de_Los_Montes = new LatLng(39.26017406893486, -4.482213061718767);
        LatLng Casa_Palillos  = new LatLng(39.289940486407026, -4.338017505078142);

        mapa.moveCamera(CameraUpdateFactory.newLatLngZoom(Parque_Cabañeros , 10)); // Zoom a la parte del mapa indicada

        //MARCADORES PUEBLOS
        MarkerOptions Retuerta_del_Bullaque_1 = new MarkerOptions().title("Retuerta del Bullaque").position(Retuerta_del_Bullaque).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointinteres)); // Poner un marcador
        mapa.addMarker(Retuerta_del_Bullaque_1);
        MarkerOptions Pueblonuevo_del_Bullaque1= new MarkerOptions().title("Pueblonuevo del Bullaque").position(Pueblonuevo_del_Bullaque).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointinteres));
        mapa.addMarker(Pueblonuevo_del_Bullaque1);
        MarkerOptions Horcajo_de_Los_Montes_1 = new MarkerOptions().title("Horcajo de los Montes").position(Horcajo_de_Los_Montes).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointinteres));
        mapa.addMarker(Horcajo_de_Los_Montes_1);
        MarkerOptions Alcoba_de_Los_Montes_1 = new MarkerOptions().title("Alcoba de los Montes").position(Alcoba_de_Los_Montes).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointinteres));
        mapa.addMarker(Alcoba_de_Los_Montes_1);
        MarkerOptions Casa_Palillos_1 = new MarkerOptions().title("Casa de los Palillos").position(Casa_Palillos).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointinteres));
        mapa.addMarker(Casa_Palillos_1);

        mapa.setInfoWindowAdapter(new UserInfoWindowAdapter1(getLayoutInflater())); // Layout 2, puntos de interes

    }

}
