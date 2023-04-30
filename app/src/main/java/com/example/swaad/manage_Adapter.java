package com.example.swaad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class manage_Adapter extends RecyclerView.Adapter<manage_Adapter.ViewHolder> {
    Context context;
    ArrayList<manage_model> arrayList2;

    public manage_Adapter(ArrayList<manage_model> arrayList2)
    {
        this.context = context;
        this.arrayList2 = arrayList2;
    }

    @NonNull
    @Override
    public manage_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.manage_card, parent, false);
        return new manage_Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull manage_Adapter.ViewHolder holder, int position) {
        holder.txt1.setText(arrayList2.get(position).Textview1.toString());
        holder.txt2.setText(arrayList2.get(position).Textview2.toString());
        holder.txt3.setText(arrayList2.get(position).Textview3.toString());
    }

    @Override
    public int getItemCount() {
        return arrayList2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt1;
        TextView txt2;
        TextView txt3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt1 = itemView.findViewById(R.id.manage_txt1);
            txt2 = itemView.findViewById(R.id.manage_txt2);
            txt3 = itemView.findViewById(R.id.manage_txt3);
        }
    }
}
