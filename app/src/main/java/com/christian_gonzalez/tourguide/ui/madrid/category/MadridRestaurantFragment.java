package com.christian_gonzalez.tourguide.ui.madrid.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.christian_gonzalez.tourguide.R;
import com.christian_gonzalez.tourguide.adapter.WordAdapter;
import com.christian_gonzalez.tourguide.utils.Words;

import java.util.ArrayList;


public class MadridRestaurantFragment extends Fragment {

    public MadridRestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        ArrayList<Words> restaurant = new ArrayList<>();
        restaurant.add(new Words(R.string.madrid_restaurant_1_name, R.string.madrid_restaurant_1_description, R.drawable.astor_gastro_place));
        restaurant.add(new Words(R.string.madrid_restaurant_2_name, R.string.madrid_restaurant_2_description, R.drawable.ramon_freixa));
        restaurant.add(new Words(R.string.madrid_restaurant_3_name, R.string.madrid_restaurant_3_description, R.drawable.dstage));
        restaurant.add(new Words(R.string.madrid_restaurant_4_name, R.string.madrid_restaurant_4_description, R.drawable.cebo));
        restaurant.add(new Words(R.string.madrid_restaurant_5_name, R.string.madrid_restaurant_5_description, R.drawable.restaurante_atico));

        WordAdapter listAdapter = new WordAdapter(getActivity(), restaurant);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        return rootView;
    }
}