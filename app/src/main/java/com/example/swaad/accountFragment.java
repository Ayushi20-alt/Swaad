package com.example.swaad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class accountFragment extends Fragment {

    public accountFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_account,
                container, false);
        TextView txt1 = (TextView) view.findViewById(R.id.textView125);
        TextView txt2 = (TextView) view.findViewById(R.id.textView121);
        TextView txt3 = (TextView) view.findViewById(R.id.textView123);
        TextView txt4 = (TextView) view.findViewById(R.id.textView119);

//        BottomNavigationView navBar = getActivity().findViewById(R.id.bottomNavigationView);
//        navBar.visibility = View.GONE;

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, HelpandSupportFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null) // name can be null
                        .commit();
            }

        });

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, manageAddresses.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null) // name can be null
                        .commit();
            }

        });

        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, AboutSwaad
                                .class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null) // name can be null
                        .commit();
            }

        });

        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, Myorders
                                .class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null) // name can be null
                        .commit();
            }

        });


        return view;
    }

}