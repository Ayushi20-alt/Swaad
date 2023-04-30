package com.example.swaad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class resturant_page_adapter extends RecyclerView.Adapter<resturant_page_adapter.ViewHolder> {
    Context context;
    ArrayList<resturant_page_model> arrayList;

    public resturant_page_adapter(ArrayList<resturant_page_model>arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public resturant_page_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resturant_page_card, parent, false);
        return new resturant_page_adapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull resturant_page_adapter.ViewHolder holder, int position) {
        holder.img.setImageResource(arrayList.get(position).img);
        holder.textView1.setText(arrayList.get(position).text1);
        holder.textView2.setText(arrayList.get(position).text2);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView textView1;
        TextView textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageView11);
            textView1 = itemView.findViewById(R.id.textView27);
            textView2 = itemView.findViewById(R.id.textView29);

        }
    }
}
