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

public class LondonMuseumFragment extends Fragment {

    public LondonMuseumFragment() {
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

        ArrayList<Words> museum = new ArrayList<>();
        museum.add(new Words(R.string.london_museum_1_name, R.string.london_museum_1_description));
        museum.add(new Words(R.string.london_museum_2_name, R.string.london_museum_2_description));
        museum.add(new Words(R.string.london_museum_3_name, R.string.london_museum_3_description));
        museum.add(new Words(R.string.london_museum_4_name, R.string.london_museum_4_description));
        museum.add(new Words(R.string.london_museum_5_name, R.string.london_museum_5_description));

        WordAdapter listAdapter = new WordAdapter(getActivity(), museum);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        return rootView;
    }
}