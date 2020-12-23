package com.christian_gonzalez.tourguide.utils;

import android.graphics.drawable.Drawable;

public class Words {

    private int mTittle;
    private int mDescription;
    private int mItemIcon;

    public Words(int Tittle, int Description, int ItemIcon) {
        mTittle = Tittle;
        mDescription = Description;
        mItemIcon = ItemIcon;
    }

    public int getDefaultTittle() {
        return mTittle;
    }

    public int getDefaultDescription() {
        return mDescription;
    }

    public int getDefaultItemIcon() {
        return mItemIcon;
    }

}
