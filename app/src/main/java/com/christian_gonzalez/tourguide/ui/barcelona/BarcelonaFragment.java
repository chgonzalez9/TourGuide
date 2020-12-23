package com.christian_gonzalez.tourguide.ui.barcelona;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.christian_gonzalez.tourguide.R;
import com.christian_gonzalez.tourguide.adapter.BarcelonaCategoryAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class BarcelonaFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.category_main, container, false);

        ViewPager viewPager = root.findViewById(R.id.viewpager);
        BarcelonaCategoryAdapter adapter = new BarcelonaCategoryAdapter(root.getContext(), getChildFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = root.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setupWithViewPager(viewPager);
        Objects.requireNonNull(tabLayout.getTabAt(0)).setIcon(R.drawable.hotel);
        Objects.requireNonNull(tabLayout.getTabAt(1)).setIcon(R.drawable.restaurant);
        Objects.requireNonNull(tabLayout.getTabAt(2)).setIcon(R.drawable.museo);
        Objects.requireNonNull(tabLayout.getTabAt(3)).setIcon(R.drawable.monuments);

        return root;
    }
}