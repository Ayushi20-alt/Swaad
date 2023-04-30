package com.example.swaad;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Resturant_page#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Resturant_page extends Fragment {

    RecyclerView recyclerViewyo;

    ArrayList<resturant_page_model> arryo1 = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";


    // TODO: Rename and change types of parameters
    private String mParam1;


    public Resturant_page() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.

     * @return A new instance of fragment Resturant_page.
     */
    // TODO: Rename and change types and number of parameters
    public static Resturant_page newInstance(String param1) {
        Resturant_page fragment = new Resturant_page();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view =  inflater.inflate(R.layout.fragment_resturant_page, container, false);

        recyclerViewyo = view. findViewById(R.id.recyclerviewyo);
        recyclerViewyo.setLayoutManager(new LinearLayoutManager(this.getActivity(),LinearLayoutManager.HORIZONTAL,false));

        arryo1.add(new resturant_page_model(R.drawable.food1, "Waffle", "\u20B9300.00"));
        arryo1.add(new resturant_page_model(R.drawable.food2, "Sandwich", "\u20B9300.00"));
        arryo1.add(new resturant_page_model(R.drawable.food3, "Pizza", "\u20B9300.00"));
        arryo1.add(new resturant_page_model(R.drawable.food4, "Pastry", "\u20B9300.00"));
        arryo1.add(new resturant_page_model(R.drawable.food5, "Cake","\u20B9300.00"));


        recyclerViewyo.setAdapter(new resturant_page_adapter(arryo1));
        return  view;
    }
}