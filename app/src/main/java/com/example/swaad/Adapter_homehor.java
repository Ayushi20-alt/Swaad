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


public class Adapter_homehor extends RecyclerView.Adapter<Adapter_homehor.ViewHolder> {

   Context context;
   ArrayList<homehormodel>arrayList;

    public Adapter_homehor(ArrayList<homehormodel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    // where to get the single card as view holder object
    // kya dikhana h?
    @NonNull
    @Override
    public Adapter_homehor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item, parent, false);
        return new ViewHolder(view);
    }

    // ek baar view milne ke baad kya krna h
    @Override
    public void onBindViewHolder(@NonNull Adapter_homehor.ViewHolder holder, int position) {

        holder.img.setImageResource(arrayList.get(position).img);
        holder.txtName.setText(arrayList.get(position).text);
    }

    // kitni baar dikhana h
    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView txtName;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            itemView.setOnClickListener(this);

            txtName = itemView.findViewById(R.id.hor_txt);
            img = itemView.findViewById(R.id.hor_img);
        }

        @Override
        public void onClick(View view) {

        }
    }

}
