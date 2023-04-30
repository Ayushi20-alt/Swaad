package com.example.swaad;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_homever extends RecyclerView.Adapter<Adapter_homever.ViewHolder> {
    Context context;
    ArrayList<homevermodel>arrayList;
    private ItemClickListener clickListener;

    public Adapter_homever(ArrayList<homevermodel>arrayList){
        this.context = context;
        this.arrayList = arrayList;

    }

    @NonNull
    @Override
    public Adapter_homever.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resturant_card, parent, false);
        return new Adapter_homever.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_homever.ViewHolder holder, int position) {

        holder.img.setImageResource(arrayList.get(position).img);
        holder.textView.setText(arrayList.get(position).text);
        holder.textView1.setText(arrayList.get(position).text1);
        holder.textView2.setText(arrayList.get(position).text2);
        holder.textView3.setText(arrayList.get(position).text3);
        holder.textView4.setText(arrayList.get(position).text4);


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView img;
        TextView textView1;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textResturant);
            img = itemView.findViewById(R.id.imageRest);
            textView1 = itemView.findViewById(R.id.txt1);
            textView2 = itemView.findViewById(R.id.txt2);
            textView3 = itemView.findViewById(R.id.txt3);
            textView4 = itemView.findViewById(R.id.txt4);
        }
    }
    public interface ItemClickListener {
        public void onItemClick(homevermodel homevermodel);
    }

}
