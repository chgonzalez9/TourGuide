package com.christian_gonzalez.tourguide.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.christian_gonzalez.tourguide.R;
import com.christian_gonzalez.tourguide.utils.Words;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Words> {

    public WordAdapter(Activity context, ArrayList<Words> Word) {
        super(context, 0, Word);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        Words currentWord = getItem(position);

        ImageView icon = (ImageView) listItemView.findViewById(R.id.item_icon);
        icon.setBackground(currentWord.getDefaultItemIcon());

        TextView tittle = (TextView) listItemView.findViewById(R.id.item_name);
        tittle.setText(currentWord.getDefaultTittle());


        return listItemView;
    }
}
