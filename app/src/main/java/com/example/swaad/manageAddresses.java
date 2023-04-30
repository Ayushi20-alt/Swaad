package com.example.swaad;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class manageAddresses extends Fragment {
    RecyclerView recyclerView2;
    ArrayList<manage_model> dikhao = new ArrayList<>();

    public manageAddresses() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_manage_addresses, container, false);
        dikhao.add(new manage_model("Home","27th KM Milestone, Delhi - Meerut Expy, Ghaziabad, Uttar Pradesh 201009","Mobile no.98916969"));
        dikhao.add(new manage_model("Office", "B153, Brij vihar , Ghaziabad","Mobile no.98916978"));
        dikhao.add(new manage_model("Home","27th KM Milestone, Delhi - Meerut Expy, Ghaziabad, Uttar Pradesh 201009","Mobile no.98916969"));

        recyclerView2 = view.findViewById(R.id.manage_rv);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.getActivity(),LinearLayoutManager.VERTICAL,false));

        recyclerView2.setAdapter(new manage_Adapter(dikhao));
        return view;

    }
}