package com.example.swaad;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class manage_model {
    String Textview1;
    String Textview2;
    String Textview3;

    public String getTextview1() {
        return Textview1;
    }

    public void setTextview1(String textview1) {
        Textview1 = textview1;
    }

    public String getTextview2() {
        return Textview2;
    }

    public void setTextview2(String textview2) {
        Textview2 = textview2;
    }

    public String getTextview3() {
        return Textview3;
    }

    public void setTextview3(String textview3) {
        Textview3 = textview3;
    }

    public manage_model(String Textview1, String Textview2, String Textview3){
        this.Textview1 = Textview1;
        this.Textview2 = Textview2;
        this.Textview3 = Textview3;
    }



}
