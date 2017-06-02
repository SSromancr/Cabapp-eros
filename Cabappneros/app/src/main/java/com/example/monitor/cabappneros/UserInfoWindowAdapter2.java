package com.example.monitor.cabappneros;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by monitor on 26/05/2017.
 */

public class UserInfoWindowAdapter2 extends AppCompatActivity implements GoogleMap.InfoWindowAdapter{
    LayoutInflater inflater = null;

    UserInfoWindowAdapter2(LayoutInflater inflater){
        this.inflater = inflater;
    }

    @Override
    public View getInfoWindow(Marker arg0) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        View infoWindows = inflater.inflate(R.layout.user_info_windows_ruta, null);

        TextView title = (TextView)infoWindows.findViewById(R.id.titulo2);
        TextView description = (TextView)infoWindows.findViewById(R.id.snippet2);



        title.setText(marker.getTitle());
        description.setText(marker.getSnippet());
        return(infoWindows);
    }
}
