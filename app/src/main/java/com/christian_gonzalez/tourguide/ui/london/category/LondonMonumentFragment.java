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

public class LondonMonumentFragment extends Fragment {

    public LondonMonumentFragment() {
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

        ArrayList<Words> monument = new ArrayList<>();
        monument.add(new Words(R.string.london_monuments_1_name, R.string.london_monuments_1_description, R.drawable.london_eye));
        monument.add(new Words(R.string.london_monuments_2_name, R.string.london_monuments_2_description, R.drawable.palacio_westminster));
        monument.add(new Words(R.string.london_monuments_3_name, R.string.london_monuments_3_description, R.drawable.tower_of_london));
        monument.add(new Words(R.string.london_monuments_4_name, R.string.london_monuments_4_description, R.drawable.big_ben));
        monument.add(new Words(R.string.london_monuments_5_name, R.string.london_monuments_5_description, R.drawable.buckingham_palace));

        WordAdapter listAdapter = new WordAdapter(getActivity(), monument);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        return rootView;
    }
}