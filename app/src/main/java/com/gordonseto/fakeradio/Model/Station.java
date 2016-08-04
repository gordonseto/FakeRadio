package com.gordonseto.fakeradio.Model;

/**
 * Created by gordonseto on 16-08-03.
 */
public class Station {

    final String DRAWABLE = "drawable/";
    private String stationTitle;
    private String imgUri;

    public String getStationTitle() {
        return stationTitle;
    }

    public String getImgUri() {
        return DRAWABLE + imgUri;
    }

    public Station(String stationTitle, String imgUri) {
        this.stationTitle = stationTitle;
        this.imgUri = imgUri;
    }
}
