package com.example.tg.lozi.activity;

/**
 * Created by TG on 11-11-17.
 */

public class FoodItemObject {
    private String nameFood;
    private int photoFood;
    private String address;
    private String numLike;
    private String nameUser;
    private int photoUser;

    public FoodItemObject(String nameFood, int photoFood, String address, String numLike, String nameUser, int photoUser) {
        this.nameFood = nameFood;
        this.photoFood = photoFood;
        this.address = address;
        this.numLike = numLike;
        this.nameUser = nameUser;
        this.photoUser = photoUser;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public int getPhotoFood() {
        return photoFood;
    }

    public void setPhotoFood(int photoFood) {
        this.photoFood = photoFood;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumLike() {
        return numLike;
    }

    public void setNumLike(String numLike) {
        this.numLike = numLike;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getPhotoUser() {
        return photoUser;
    }

    public void setPhotoUser(int photoUser) {
        this.photoUser = photoUser;
    }
}
