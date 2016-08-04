package com.gordonseto.fakeradio.Services;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.gordonseto.fakeradio.Model.Station;

import java.util.ArrayList;

/**
 * Created by gordonseto on 16-08-04.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Station> getFeaturedStations() {
        //Pretend we just downloaded featured stations from the internet

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes For Travel)", "flightplanmusic"));
        list.add(new Station("Two Wheelin (Biking Playlist)", "bicyclemusic"));
        list.add(new Station("Kids Jams (Music or Children)", "kidsmusic"));
        list.add(new Station("Test", "keymusic"));
        list.add(new Station("Another Test", "socialmusic"));
        list.add(new Station("A Third Test", "vinylmusic"));
        return list;
    }

    public ArrayList<Station> getRecentStations() {
        //Pretend we just downloaded featured stations from the internet

        ArrayList<Station> list = new ArrayList<>();
        return list;
    }

    public ArrayList<Station> getPartyStations() {
        //Pretend we just downloaded featured stations from the internet

        ArrayList<Station> list = new ArrayList<>();
        return list;
    }

}

