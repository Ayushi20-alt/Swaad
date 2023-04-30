package com.example.swaad;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class cartFragment extends Fragment {
    RecyclerView recyclerView1;
    ArrayList<cardmodel> data = new ArrayList<>();
    public cartFragment() {
        // Required empty public constructor
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        data.add(new cardmodel("Burger", "2", "\u20B9199.00"));
        data.add(new cardmodel("Pizza", "1", "\u20B9499.00"));
        data.add(new cardmodel("Waffle","3", "\u20B9249.00"));

        recyclerView1 = view.findViewById(R.id.card_rv);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this.getActivity(),LinearLayoutManager.VERTICAL,false));

        recyclerView1.setAdapter(new cardAdapter(data));
        return view;
    }


}