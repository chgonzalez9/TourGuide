package com.christian_gonzalez.tourguide.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.christian_gonzalez.tourguide.ui.barcelona.category.BarcelonaHotelFragment;
import com.christian_gonzalez.tourguide.ui.barcelona.category.BarcelonaMonumentFragment;
import com.christian_gonzalez.tourguide.ui.barcelona.category.BarcelonaMuseumFragment;
import com.christian_gonzalez.tourguide.ui.barcelona.category.BarcelonaRestaurantFragment;

public class BarcelonaCategoryAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public BarcelonaCategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BarcelonaHotelFragment();
        } else if (position == 1) {
            return new BarcelonaRestaurantFragment();
        } else if (position == 2) {
            return new BarcelonaMuseumFragment();
        } else {
            return new BarcelonaMonumentFragment();
        }
    }



    @Override
    public int getCount() {
        return 4;
    }



    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }

}
