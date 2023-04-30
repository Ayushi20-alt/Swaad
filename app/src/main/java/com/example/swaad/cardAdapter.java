package com.example.swaad;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class cardAdapter extends RecyclerView.Adapter<cardAdapter.ViewHolder> {
    Context context;
    ArrayList<cardmodel> arrayList;

    public cardAdapter(ArrayList<cardmodel>arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public cardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cardAdapter.ViewHolder holder, int position) {
        holder.txt1.setText(arrayList.get(position).textView1.toString());
        holder.txt2.setText(arrayList.get(position).textView2.toString());
        holder.txt3.setText(arrayList.get(position).textView3.toString());
        Log.d("TAG", "call");
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txt1;
        TextView txt2;
        TextView txt3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt1 = itemView.findViewById(R.id.txt1);
            txt2 = itemView.findViewById(R.id.txt2);
            txt3 = itemView.findViewById(R.id.txt3);

        }

        @Override
        public void onClick(View view) {


        }
    }
}
