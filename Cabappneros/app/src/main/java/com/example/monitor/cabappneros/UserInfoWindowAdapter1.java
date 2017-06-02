package com.example.monitor.cabappneros;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by monitor on 26/05/2017.
 */

public class UserInfoWindowAdapter1 extends AppCompatActivity implements GoogleMap.InfoWindowAdapter{
    LayoutInflater inflater = null;

    UserInfoWindowAdapter1(LayoutInflater inflater){
        this.inflater = inflater;
    }

    @Override
    public View getInfoWindow(Marker arg0) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {

        final View infoWindows = inflater.inflate(R.layout.user_info_windows1, null);

        TextView title = (TextView)infoWindows.findViewById(R.id.titulo1);
        TextView description = (TextView)infoWindows.findViewById(R.id.snippet1);


        switch (marker.getTitle()){
            case "Retuerta del Bullaque":
                ImageView imagen = (ImageView)infoWindows.findViewById(R.id.iconif1);
                imagen.setImageResource(R.mipmap.retuerta);
                break;
            case "Pueblonuevo del Bullaque":
                ImageView imagen1 = (ImageView)infoWindows.findViewById(R.id.iconif1);
                imagen1.setImageResource(R.mipmap.pueblonuevo);
                break;
            case "Parque de Cabañeros":
                ImageView imagen2 = (ImageView)infoWindows.findViewById(R.id.iconif1);
                imagen2.setImageResource(R.mipmap.rutacastellarbueyes1);
                break;
            case "Horcajo de los Montes":
                ImageView imagen3 = (ImageView)infoWindows.findViewById(R.id.iconif1);
                imagen3.setImageResource(R.mipmap.horcajo);
                break;
            case "Alcoba de los Montes":
                ImageView imagen4 = (ImageView)infoWindows.findViewById(R.id.iconif1);
                imagen4.setImageResource(R.mipmap.alcoba);
                break;
            case "Casa de los Palillos":
                ImageView imagen5 = (ImageView)infoWindows.findViewById(R.id.iconif1);
                imagen5.setImageResource(R.mipmap.casapalillos1);
                break;
            case "Ruta Retuerta del Bullaque-Parque Cabañeros":
                ImageView imagen6 = (ImageView)infoWindows.findViewById(R.id.iconif1);
                imagen6.setImageResource(R.mipmap.retuerta4x4);
                break;
            case "Ruta Pueblonuevo del Bullaque-Parque Cabañeros":
                ImageView imagen7 = (ImageView)infoWindows.findViewById(R.id.iconif1);
                imagen7.setImageResource(R.mipmap.pueblonuevo4x4);
                break;
            case "Ruta Casa de los Palillos-Parque Cabañeros":
                ImageView imagen8 = (ImageView)infoWindows.findViewById(R.id.iconif1);
                imagen8.setImageResource(R.mipmap.casapalillos4x4);
                break;
            case "Ruta Horcajo de los Montes-Parque Cabañeros":
                ImageView imagen9 = (ImageView)infoWindows.findViewById(R.id.iconif1);
                imagen9.setImageResource(R.mipmap.horcajo4x4);
                break;
            case "Ruta Alcoba de los Montes-Parque Cabañeros":
                ImageView imagen10 = (ImageView)infoWindows.findViewById(R.id.iconif1);
                imagen10.setImageResource(R.mipmap.alcoba4x4);
                break;

        }
        title.setText(marker.getTitle());
        description.setText(marker.getSnippet());


        return(infoWindows);
    }


}

