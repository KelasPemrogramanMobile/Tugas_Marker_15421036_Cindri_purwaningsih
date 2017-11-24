package com.project.tgs_marker_15421036_cindri;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView map = (MapView) findViewById(R.id.map);

        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);
        GeoPoint startPoint = new GeoPoint(-5.379534, 105.251704);
        IMapController mapController = map.getController();
        mapController.setZoom(15);
        mapController.setCenter(startPoint);

        Marker startMarker = new Marker(map);
        startMarker.setPosition(startPoint);
        startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker);
        map.invalidate();
        startMarker.setIcon(getResources().getDrawable(R.drawable.ubl));
        startMarker.setTitle("Universitas Bandar Lampung");


        GeoPoint startPoint2 = new GeoPoint(-5.375348,105.246246);
        IMapController mapController2 = map.getController();
        mapController2.setCenter(startPoint2);

        Marker startMarker2 = new Marker(map);
        startMarker2.setPosition(startPoint2);
        startMarker2.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker2);
        map.invalidate();
        startMarker2.setIcon(getResources().getDrawable(R.drawable.publ));
        startMarker2.setTitle("Pascasarjana Universitas Bandar Lampung");


        GeoPoint startPoint3 = new GeoPoint(-5.372223,105.240894);
        IMapController mapController3 = map.getController();
        mapController3.setCenter(startPoint3);

        Marker startMarker3 = new Marker(map);
        startMarker3.setPosition(startPoint3);
        startMarker3.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker3);
        map.invalidate();
        startMarker3.setIcon(getResources().getDrawable(R.drawable.musium));
        startMarker3.setTitle("Museum Lampung");


        GeoPoint startPoint4 = new GeoPoint(-5.381786,105.259613);
        IMapController mapController4 = map.getController();
        mapController4.setCenter(startPoint4);

        Marker startMarker4 = new Marker(map);
        startMarker4.setPosition(startPoint4);
        startMarker4.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker4);
        map.invalidate();
        startMarker4.setIcon(getResources().getDrawable(R.drawable.mbk));
        startMarker4.setTitle("Mall Boemi Kedaton");


        GeoPoint startPoint5 = new GeoPoint(-5.389500,105.018376);
        IMapController mapController5 = map.getController();
        mapController5.setCenter(startPoint5);

        Marker startMarker5 = new Marker(map);
        startMarker5.setPosition(startPoint5);
        startMarker5.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker5);
        map.invalidate();
        startMarker5.setIcon(getResources().getDrawable(R.drawable.rumah));
        startMarker5.setTitle("Rumahku");

    }
}