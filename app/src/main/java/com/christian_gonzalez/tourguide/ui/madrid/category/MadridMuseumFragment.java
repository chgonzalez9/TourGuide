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

public class MadridMuseumFragment extends Fragment {

    public MadridMuseumFragment() {
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
        museum.add(new Words(R.string.madrid_museum_1_name, R.string.madrid_museum_1_description, R.drawable.museo_del_prado));
        museum.add(new Words(R.string.madrid_museum_2_name, R.string.madrid_museum_2_description, R.drawable.thyssen_madrid));
        museum.add(new Words(R.string.madrid_museum_3_name, R.string.madrid_museum_3_description, R.drawable.museo_reina_sofia));
        museum.add(new Words(R.string.madrid_museum_4_name, R.string.madrid_museum_4_description, R.drawable.madrid_museo_arqueologico));
        museum.add(new Words(R.string.madrid_museum_5_name, R.string.madrid_museum_5_description, R.drawable.lope_de_vega));

        WordAdapter listAdapter = new WordAdapter(getActivity(), museum);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        return rootView;
    }
}