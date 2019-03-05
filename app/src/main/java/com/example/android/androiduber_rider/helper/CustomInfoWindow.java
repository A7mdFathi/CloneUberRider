package com.example.android.androiduber_rider.helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.android.androiduber_rider.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomInfoWindow implements GoogleMap.InfoWindowAdapter {

    View myView;

    public CustomInfoWindow(Context context) {
        myView = LayoutInflater.from(context)
                .inflate(R.layout.custom_rider_info_window, null);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        TextView txtPickup = (TextView) myView.findViewById(R.id.txtpickuphere);
        txtPickup.setText(marker.getTitle());

        TextView txtSnippet = (TextView) myView.findViewById(R.id.txtpickupsnippet);
        txtSnippet.setText(marker.getSnippet());

        return myView;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
