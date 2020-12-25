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

public class BarcelonaHotelFragment extends Fragment {

    public BarcelonaHotelFragment() {
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

        ArrayList<Words> hotel = new ArrayList<>();
        hotel.add(new Words(R.string.barcelona_hotel_1_name, R.string.barcelona_hotel_1_description, R.drawable.hotel_ohla_barcelona));
        hotel.add(new Words(R.string.barcelona_hotel_2_name, R.string.barcelona_hotel_2_description, R.drawable.hotel_mandarin_oriental_barcelona));
        hotel.add(new Words(R.string.barcelona_hotel_3_name, R.string.barcelona_hotel_3_description, R.drawable.hotel_arts_barcelona));
        hotel.add(new Words(R.string.barcelona_hotel_4_name, R.string.barcelona_hotel_4_description, R.drawable.hotel_miramar_barcelona));
        hotel.add(new Words(R.string.barcelona_hotel_5_name, R.string.barcelona_hotel_5_description, R.drawable.hotel_w_barcelona));

        WordAdapter listAdapter = new WordAdapter(getActivity(), hotel);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        return rootView;
    }
}