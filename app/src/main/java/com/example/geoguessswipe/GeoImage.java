package com.example.geoguessswipe;

import android.graphics.drawable.Drawable;

/**
 * Deze klasse is een Geo Image object met als variabelen een ID en een boolean of het
 * wel of niet in Europa is
 */
public class GeoImage {

    private Drawable id;
    private boolean europe;

    public GeoImage(Drawable id, boolean europe) {
        this.id = id;
        this.europe = europe;
    }

    public Drawable getId() {
        return id;
    }

    public void setId(Drawable id) {
        this.id = id;
    }

    public boolean isEurope() {
        return europe;
    }

    public void setEurope(boolean europe) {
        this.europe = europe;
    }

}
