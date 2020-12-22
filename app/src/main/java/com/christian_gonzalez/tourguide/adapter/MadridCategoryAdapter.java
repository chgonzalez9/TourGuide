package com.christian_gonzalez.tourguide.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.christian_gonzalez.tourguide.R;
import com.christian_gonzalez.tourguide.ui.madrid.category.MadridHotelFragment;
import com.christian_gonzalez.tourguide.ui.madrid.category.MadridMonumentFragment;
import com.christian_gonzalez.tourguide.ui.madrid.category.MadridMuseumFragment;
import com.christian_gonzalez.tourguide.ui.madrid.category.MadridRestaurantFragment;

public class MadridCategoryAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public MadridCategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MadridHotelFragment();
        } else if (position == 1) {
            return new MadridRestaurantFragment();
        } else if (position == 2) {
            return new MadridMuseumFragment();
        } else {
            return new MadridMonumentFragment();
        }
    }



    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_hotel);
        } else if (position == 1) {
            return mContext.getString(R.string.category_restaurant);
        } else if (position == 2) {
            return mContext.getString(R.string.category_museum);
        } else {
            return mContext.getString(R.string.category_monument);
        }

    }

}
