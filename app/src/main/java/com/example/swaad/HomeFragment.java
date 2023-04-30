package com.example.swaad;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class HomeFragment extends Fragment  {
    RecyclerView recyclerView;
    ArrayList<homehormodel> dataSource = new ArrayList<>();
    RecyclerView rv;
    ArrayList<homevermodel> arrmodel = new ArrayList<>();
    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        // Inflate the layout for this fragment
//        RecyclerView rv = findViewById(R.id.home_hor_rv);
//        rv.setLayoutManager(new LinearLayoutManager(HomeFragment.this, LinearLayoutManager.HORIZONTAL, false));
//
//        // setting the data source
//
//
//        Adapter_homehor adapter_homehor = new Adapter_homehor(this, dataSource);
//        rv.setAdapter(adapter_homehor);
        View view = inflater.inflate(R.layout.fragment_home, container, false);
//       RecyclerView txt1 =  view.findViewById(R.id.resturant_card);
                
        recyclerView = view. findViewById(R.id.home_hor_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity(),LinearLayoutManager.HORIZONTAL,false));

        dataSource.add(new homehormodel(R.drawable.ellipse1, "Sweets"));
        dataSource.add(new homehormodel(R.drawable.ellipse2, "Chinese"));
        dataSource.add(new homehormodel(R.drawable.ellipse3, "Burger"));
        dataSource.add(new homehormodel(R.drawable.rest1, "Desserts"));
        dataSource.add(new homehormodel(R.drawable.rest2, "Pastries"));
        dataSource.add(new homehormodel(R.drawable.rest3, "pizza"));
        dataSource.add(new homehormodel(R.drawable.rest4, "B"));
        dataSource.add(new homehormodel(R.drawable.rest5, "C"));
        dataSource.add(new homehormodel(R.drawable.rest6, "D"));

        recyclerView.setAdapter(new Adapter_homehor(dataSource));


        rv = view.findViewById(R.id.home_ver_rv);
        rv.setLayoutManager(new GridLayoutManager(this.getActivity(),2));
        arrmodel.add(new homevermodel(R.drawable.rest1,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest2,"Roma's Cafe n Dine", "4.3", "10-20 Min","\u0024\u0024\u0024","KaviNagar,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest3,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest4,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest5,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest6,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest7,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest8,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest1,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest2,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest3,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest4,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest5,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest6,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest1,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest7,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest8,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));
        arrmodel.add(new homevermodel(R.drawable.rest1,"Heaven's Food", "4.5", "25-30 Min","\u0024\u0024\u0024","122 RDC,Ghaziabad"));

        rv.setAdapter(new Adapter_homever(arrmodel));

//        txt2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
//                fragmentManager.beginTransaction()
//                        .replace(R.id.frame_layout, Resturant_page.class, null)
//                        .setReorderingAllowed(true)
//                        .addToBackStack(null) // name can be null
//                        .commit();
//            }
//
//        });

//        public void onItemClick(homevermodel homevermodel){
//
//        }
        return  view;
    }

}
