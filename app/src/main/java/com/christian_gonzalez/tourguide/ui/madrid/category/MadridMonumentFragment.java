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

public class MadridMonumentFragment extends Fragment {

    public MadridMonumentFragment() {
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
        monument.add(new Words(R.string.madrid_monument_1_name, R.string.madrid_monument_1_description, R.drawable.el_retiro));
        monument.add(new Words(R.string.madrid_monument_2_name, R.string.madrid_monument_2_description, R.drawable.templo_deblod));
        monument.add(new Words(R.string.madrid_monument_3_name, R.string.madrid_monument_3_description, R.drawable.teleferico_de_madrid));
        monument.add(new Words(R.string.madrid_monument_4_name, R.string.madrid_monument_4_description, R.drawable.puerta_del_sol));
        monument.add(new Words(R.string.madrid_monument_5_name, R.string.madrid_monument_5_description, R.drawable.palacio_real_madrid));

        WordAdapter listAdapter = new WordAdapter(getActivity(), monument);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        return rootView;
    }
}