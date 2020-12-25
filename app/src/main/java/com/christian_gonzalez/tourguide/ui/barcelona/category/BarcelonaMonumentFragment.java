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

public class BarcelonaMonumentFragment extends Fragment {

    public BarcelonaMonumentFragment() {
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
        monument.add(new Words(R.string.barcelona_monument_1_name, R.string.barcelona_monument_1_description, R.drawable.sagrada_familia_bcn_monument));
        monument.add(new Words(R.string.barcelona_monument_2_name, R.string.barcelona_monument_2_description, R.drawable.montjuic_barcelona));
        monument.add(new Words(R.string.barcelona_monument_3_name, R.string.barcelona_monument_3_description, R.drawable.colon_bcn));
        monument.add(new Words(R.string.barcelona_monument_4_name, R.string.barcelona_monument_4_description, R.drawable.arco_del_triunfo));
        monument.add(new Words(R.string.barcelona_monument_5_name, R.string.barcelona_monument_5_description, R.drawable.torres_venecianes_barcelona));

        WordAdapter listAdapter = new WordAdapter(getActivity(), monument);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        return rootView;
    }
}