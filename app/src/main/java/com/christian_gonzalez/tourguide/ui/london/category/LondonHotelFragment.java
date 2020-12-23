package com.christian_gonzalez.tourguide.ui.london.category;

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

public class LondonHotelFragment extends Fragment {

    public LondonHotelFragment() {
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
        hotel.add(new Words(R.string.london_hotel_1_name, R.string.london_hotel_1_description, R.drawable.mandarin));
        hotel.add(new Words(R.string.london_hotel_2_name, R.string.london_hotel_2_description, R.drawable.shangri_la));
        hotel.add(new Words(R.string.london_hotel_3_name, R.string.london_hotel_3_description, R.drawable.marriot));
        hotel.add(new Words(R.string.london_hotel_4_name, R.string.london_hotel_4_description, R.drawable.w_london));

        WordAdapter listAdapter = new WordAdapter(getActivity(), hotel);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        return rootView;
    }
}