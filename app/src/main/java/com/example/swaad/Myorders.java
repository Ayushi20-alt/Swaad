package com.example.swaad;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Myorders extends Fragment {

   RecyclerView rv2;
   ArrayList<myorders_model>arr3 = new ArrayList<>();

    public Myorders() {
        // Required empty public constructor
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_myorders, container, false);
        arr3.add(new myorders_model("Romania cafe", "October 21,11:04 AM", "1 * Garlic Bread", "\u20B9300.00", "1 * Honey Bread", "\u20B9200.00", "Total Bill: \u20B9500.00"));
        arr3.add(new myorders_model("Muskan cafe","October 22,12:14 AM","1 * Garlic Bread","\u20B9300.00","1 * Honey Bread","\u20B9200.00","Total Bill: \u20B9500.00"));
        arr3.add(new myorders_model("love da  cafe","October 21,11:04 AM","1 * Garlic Bread","\u20B9300.00","1 * Honey Bread","\u20B9200.00","Total Bill: \u20B9500.00"));
        arr3.add(new myorders_model("Sirohi chaap", "October 21,11:04 AM", "1 * Garlic Bread", "\u20B9300.00", "1 * Honey Bread", "\u20B9200.00", "Total Bill: \u20B9500.00"));
        arr3.add(new myorders_model("Muskan cafe","October 22,12:14 AM","1 * Garlic Bread","\u20B9300.00","1 * Honey Bread","\u20B9200.00","Total Bill: \u20B9500.00"));


        rv2 = view.findViewById(R.id.myorders_rv);
        rv2.setLayoutManager(new LinearLayoutManager(this.getActivity(),LinearLayoutManager.VERTICAL,false));

        rv2.setAdapter(new myorder_adapter(arr3));
        return view;
    }
}