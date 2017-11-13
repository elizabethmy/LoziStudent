package com.example.tg.lozi.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tg.lozi.activity.FoodItemObject;
import com.example.tg.lozi.activity.R;

import java.util.List;

/**
 * Created by TG on 11-11-17.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodHolders>{
private List<FoodItemObject>foodItemObjects;
private Context context;

    public FoodAdapter(List<FoodItemObject> foodItemObjects, Context context) {
        this.foodItemObjects = foodItemObjects;
        this.context = context;
    }

    @Override
    public FoodHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layView= LayoutInflater.from(parent.getContext()).inflate(R.layout.food_card_view,null);
        FoodHolders rcv=new FoodHolders(layView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(FoodHolders holder, int position) {
        holder.imgFood.setImageResource(foodItemObjects.get(position).getPhotoFood());
        holder.imgUser.setImageResource(foodItemObjects.get(position).getPhotoUser());

        holder.tvNameFood.setText(foodItemObjects.get(position).getNameFood());
        holder.tvAdress.setText(foodItemObjects.get(position).getAddress());
        holder.tvNumLike.setText(foodItemObjects.get(position).getNumLike());
        holder.tvNameUser.setText(foodItemObjects.get(position).getNameUser());
    }

    @Override
    public int getItemCount() {
        return  this.foodItemObjects.size();
    }
}
