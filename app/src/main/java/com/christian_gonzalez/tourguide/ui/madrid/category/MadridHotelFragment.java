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

public class MadridHotelFragment extends Fragment {

    public MadridHotelFragment() {
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
        hotel.add(new Words(R.string.madrid_hotel_1_name, R.string.madrid_hotel_1_description, R.drawable.mandarin_ritz));
        hotel.add(new Words(R.string.madrid_hotel_2_name, R.string.madrid_hotel_2_description, R.drawable.b_b_hotel));
        hotel.add(new Words(R.string.madrid_hotel_3_name, R.string.madrid_hotel_3_description, R.drawable.villa_magna));
        hotel.add(new Words(R.string.madrid_hotel_4_name, R.string.madrid_hotel_4_description, R.drawable.urban_madrid));
        hotel.add(new Words(R.string.madrid_hotel_5_name, R.string.madrid_hotel_5_description, R.drawable.santo_mauro));

        WordAdapter listAdapter = new WordAdapter(getActivity(), hotel);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        return rootView;
    }
}