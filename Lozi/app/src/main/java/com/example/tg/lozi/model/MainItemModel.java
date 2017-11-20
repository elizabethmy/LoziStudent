package com.example.tg.lozi.model;

/**
 * Created by TG on 09-11-17.
 */

public class MainItemModel {

    private String name;
    private int photo;

    public MainItemModel(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
