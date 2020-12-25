package com.christian_gonzalez.tourguide.ui.barcelona.category;

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


public class BarcelonaRestaurantFragment extends Fragment {

    public BarcelonaRestaurantFragment() {
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
        restaurant.add(new Words(R.string.barcelona_restaurant_1_name, R.string.barcelona_restaurant_1_description, R.drawable.enigma_barcelona));
        restaurant.add(new Words(R.string.barcelona_restaurant_2_name, R.string.barcelona_restaurant_2_description, R.drawable.martinez_bcn));
        restaurant.add(new Words(R.string.barcelona_restaurant_3_name, R.string.barcelona_restaurant_3_description, R.drawable.moments_bcn));
        restaurant.add(new Words(R.string.barcelona_restaurant_4_name, R.string.barcelona_restaurant_4_description, R.drawable.tickets_bcn));
        restaurant.add(new Words(R.string.barcelona_restaurant_5_name, R.string.barcelona_restaurant_5_description, R.drawable.disfrutar_bcn));

        WordAdapter listAdapter = new WordAdapter(getActivity(), restaurant);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        return rootView;
    }
}