package com.example.swaad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myorder_adapter extends RecyclerView.Adapter<myorder_adapter.ViewHolder> {
    Context context;
    ArrayList<myorders_model>arr3;

    public myorder_adapter(ArrayList<myorders_model>arr3)
    {
        this.context = context;
        this.arr3 = arr3;
    }

    @NonNull
    @Override
    public myorder_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.myorder_card, parent, false);
        return new myorder_adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myorder_adapter.ViewHolder holder, int position) {
        holder.txt1.setText(arr3.get(position).text1.toString());
        holder.txt2.setText(arr3.get(position).text2.toString());
        holder.txt3.setText(arr3.get(position).text3.toString());
        holder.txt4.setText(arr3.get(position).text4.toString());
        holder.txt5.setText(arr3.get(position).text5.toString());
        holder.txt6.setText(arr3.get(position).text6.toString());
        holder.txt7.setText(arr3.get(position).text7.toString());
    }

    @Override
    public int getItemCount() {
        return arr3.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txt1;
        TextView txt2;
        TextView txt3;
        TextView txt4;
        TextView txt5;
        TextView txt6;
        TextView txt7;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt1 = itemView.findViewById(R.id.textView_hotel);
            txt2 = itemView.findViewById(R.id.textView_time);
            txt3 = itemView.findViewById(R.id.textView_food1);
            txt4 = itemView.findViewById(R.id.textView_rate1);
            txt5 = itemView.findViewById(R.id.textview_food2);
            txt6 = itemView.findViewById(R.id.textView_rate2);
            txt7 = itemView.findViewById(R.id.textView_bill);
        }
    }
}
