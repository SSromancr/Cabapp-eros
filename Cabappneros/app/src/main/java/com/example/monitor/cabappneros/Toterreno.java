package com.example.monitor.cabappneros;

import android.content.Intent;
import android.graphics.Color;
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
import com.google.android.gms.maps.model.PolylineOptions;

public class Toterreno extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener{

    GoogleMap mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toterreno);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapa);

        mapFragment.getMapAsync(this);
        /////LOGO/////

        ImageView ButtonLogo = (ImageView) findViewById(R.id.logoB1);
        ButtonLogo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Toterreno.this, MainActivity.class));
            }

        });


        ///////BOTONES/////////

        Button volverParque = (Button) findViewById(R.id.botonJ3);
        volverParque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Toterreno.this, Parque.class));
            }
        });

        Button VolverRutas = (Button) findViewById(R.id.botonJ1);
        VolverRutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Toterreno.this, Rutas.class));
            }
        });
        Button VolverPuntosdeInteres = (Button) findViewById(R.id.botonJ2);
        VolverPuntosdeInteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Toterreno.this, Interes.class));

            }
        });


    }

    @Override
    public void onInfoWindowClick(Marker marker) {
        switch (marker.getTitle()){

            case "Ruta Retuerta del Bullaque-Parque Cabañeros":
                startActivity(new Intent(Toterreno.this, Retuerta.class));
                break;
            case "Ruta Casa de los Palillos-Parque Cabañeros":
                startActivity(new Intent(Toterreno.this, Palillos.class));
                break;
            case "Ruta Horcajo de los Montes-Parque Cabañeros":
                startActivity(new Intent(Toterreno.this, Horcajo.class));
                break;
            case "Ruta Alcoba de los Montes-Parque Cabañeros":
                startActivity(new Intent(Toterreno.this, Alcoba.class));
                break;
        }

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapa = googleMap;
        mapa.setMapType(googleMap.MAP_TYPE_TERRAIN); // Con esta sentencia definimos el tipo de mapa que queremos usar
        googleMap.getUiSettings().setZoomControlsEnabled(true); // Poner botones para controlar el zoom
        LatLng Visita_4x4_desde_Retuerta_del_Bullaque  = new LatLng(39.4637642, -4.411778899999945);
        LatLng Visita_4x4_desde_el_Centro_de_Visitantes_de_Horcajo_de_Los_Montes = new LatLng(39.31863183956818, -4.622288745312517);
        LatLng Parque_Cabañeros = new LatLng(39.387655366773174, -4.508305591015642);
        LatLng Visita_4x4_desde_Alcoba_de_Los_Montes = new LatLng(39.26017406893486, -4.482213061718767);
        LatLng Visita_4x4_desde_el_Centro_de_Visitantes_de_Casa_Palillos  = new LatLng(39.289940486407026, -4.338017505078142);
        LatLng Ruta_Retuerta  = new LatLng(39.42161112824696, -4.453373950390642);
        LatLng Ruta_Palillos  = new LatLng(39.331379776577414, -4.392262500195329);
        LatLng Ruta_Horcajo  = new LatLng(39.35049732512078, -4.539204638867204);
        LatLng Ruta_Alcoba  = new LatLng(39.334566397762345, -4.470540088085954);

        mapa.moveCamera(CameraUpdateFactory.newLatLngZoom(Parque_Cabañeros , 10)); // Zoom a la parte del mapa indicada

        //MARCADORES PUEBLOS
        MarkerOptions Visita_4x4_desde_Retuerta_del_Bullaque_1 = new MarkerOptions().title("Retuerta del Bullaque").position(Visita_4x4_desde_Retuerta_del_Bullaque).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointinteres)); // Poner un marcador
        mapa.addMarker(Visita_4x4_desde_Retuerta_del_Bullaque_1);
        MarkerOptions Parque_Cabañeros_1 = new MarkerOptions().title("Parque de Cabañeros").position( Parque_Cabañeros).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointinteres));
        mapa.addMarker( Parque_Cabañeros_1);
        MarkerOptions Visita_4x4_desde_el_Centro_de_Visitantes_de_Horcajo_de_Los_Montes_1 = new MarkerOptions().title("Horcajo de los Montes").position(Visita_4x4_desde_el_Centro_de_Visitantes_de_Horcajo_de_Los_Montes).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointinteres));
        mapa.addMarker(Visita_4x4_desde_el_Centro_de_Visitantes_de_Horcajo_de_Los_Montes_1);
        MarkerOptions Visita_4x4_desde_Alcoba_de_Los_Montes_1 = new MarkerOptions().title("Alcoba de los Montes").position(Visita_4x4_desde_Alcoba_de_Los_Montes).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointinteres));
        mapa.addMarker(Visita_4x4_desde_Alcoba_de_Los_Montes_1);
        MarkerOptions  Visita_4x4_desde_el_Centro_de_Visitantes_de_Casa_Palillos_1 = new MarkerOptions().title("Casa de los Palillos").position(Visita_4x4_desde_el_Centro_de_Visitantes_de_Casa_Palillos).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointinteres));
        mapa.addMarker( Visita_4x4_desde_el_Centro_de_Visitantes_de_Casa_Palillos_1);

        //MARCADORES RUTAS
        MarkerOptions Ruta_Retuerta1 = new MarkerOptions().title("Ruta Retuerta del Bullaque-Parque Cabañeros").snippet("Pinche para ver la ruta").position(Ruta_Retuerta).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointcoche));
        mapa.addMarker(Ruta_Retuerta1);
        MarkerOptions Ruta_Palillos1 = new MarkerOptions().title("Ruta Casa de los Palillos-Parque Cabañeros").snippet("Pinche para ver la ruta").position(Ruta_Palillos).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointcoche));
        mapa.addMarker(Ruta_Palillos1);
        MarkerOptions Ruta_Horcajo1 = new MarkerOptions().title("Ruta Horcajo de los Montes-Parque Cabañeros").snippet("Pinche para ver la ruta").position(Ruta_Horcajo).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointcoche));
        mapa.addMarker(Ruta_Horcajo1);
        MarkerOptions Ruta_Alcoba1 = new MarkerOptions().title("Ruta Alcoba de los Montes-Parque Cabañeros").snippet("Pinche para ver la ruta").position(Ruta_Alcoba).icon(BitmapDescriptorFactory.fromResource(R.mipmap.pointcoche));
        mapa.addMarker(Ruta_Alcoba1);

        //POLYLINES DE LAS RUTAS
        mapa.addPolyline((new PolylineOptions()).add( Visita_4x4_desde_Retuerta_del_Bullaque, Ruta_Retuerta, Parque_Cabañeros ).color(Color.RED).width(10)).setClickable(true); // Añadir linea de ruta entre 2 puntos
        mapa.addPolyline((new PolylineOptions()).add( Visita_4x4_desde_el_Centro_de_Visitantes_de_Horcajo_de_Los_Montes, Ruta_Horcajo, Parque_Cabañeros ).color(Color.MAGENTA).width(10));
        mapa.addPolyline((new PolylineOptions()).add( Visita_4x4_desde_Alcoba_de_Los_Montes, Ruta_Alcoba,Parque_Cabañeros ).color(Color.BLUE).width(10));
        mapa.addPolyline((new PolylineOptions()).add( Visita_4x4_desde_el_Centro_de_Visitantes_de_Casa_Palillos, Ruta_Palillos, Parque_Cabañeros ).color(Color.DKGRAY).width(10));


        mapa.setInfoWindowAdapter(new UserInfoWindowAdapter1(getLayoutInflater())); // Layout 2, puntos de interes

        mapa.setOnInfoWindowClickListener(this);

    }
}




