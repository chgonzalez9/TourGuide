package com.christian_gonzalez.tourguide.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.christian_gonzalez.tourguide.R;
import com.christian_gonzalez.tourguide.ui.london.category.LondonHotelFragment;
import com.christian_gonzalez.tourguide.ui.london.category.LondonMonumentFragment;
import com.christian_gonzalez.tourguide.ui.london.category.LondonMuseumFragment;
import com.christian_gonzalez.tourguide.ui.london.category.LondonRestaurantFragment;
import com.google.android.material.tabs.TabLayout;

public class LondonCategoryAdapter extends FragmentPagerAdapter {

    private final Context mContext;
    private TabLayout tabLayout;

    public LondonCategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LondonHotelFragment();
        } else if (position == 1) {
            return new LondonRestaurantFragment();
        } else if (position == 2) {
            return new LondonMuseumFragment();
        } else {
            return new LondonMonumentFragment();
        }
    }



    @Override
    public int getCount() {
        return 4;
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(R.drawable.hotel);
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
