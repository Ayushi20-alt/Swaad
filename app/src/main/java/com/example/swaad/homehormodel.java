package com.example.swaad;

public class homehormodel {
    int img;
    String text;
    public homehormodel(int img , String text)
    {
        this.img = img;
        this.text = text;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
