package com.christian_gonzalez.tourguide.utils;

import android.graphics.drawable.Drawable;

public class Words {

    private String mTittle;
    private String mDescription;
    private Drawable mItemIcon;
    private int mItemLocation;

    public Words(String Tittle, String Description, Drawable ItemIcon, int ItemLocation) {
        mTittle = Tittle;
        mDescription = Description;
        mItemIcon = ItemIcon;
        mItemLocation = ItemLocation;
    }

    public String getDefaultTittle() {
        return mTittle;
    }

    public String getDefaultDescription() {
        return mDescription;
    }

    public Drawable getDefaultItemIcon() {
        return mItemIcon;
    }

    public int getDefaultItemLocation() {
        return mItemLocation;
    }
}
