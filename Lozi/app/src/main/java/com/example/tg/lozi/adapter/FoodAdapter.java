package com.example.tg.lozi.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tg.lozi.model.FoodItemModel;
import com.example.tg.lozi.activity.R;

import java.util.List;

/**
 * Created by TG on 11-11-17.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodHolders>{
private List<FoodItemModel> foodItemModels;
private Context context;

    public FoodAdapter(List<FoodItemModel> foodItemModels, Context context) {
        this.foodItemModels = foodItemModels;
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
        holder.imgFood.setImageResource(foodItemModels.get(position).getPhotoFood());
        holder.imgUser.setImageResource(foodItemModels.get(position).getPhotoUser());

        holder.tvNameFood.setText(foodItemModels.get(position).getNameFood());
        holder.tvAdress.setText(foodItemModels.get(position).getAddress());
        holder.tvNumLike.setText(foodItemModels.get(position).getNumLike());
        holder.tvNameUser.setText(foodItemModels.get(position).getNameUser());
    }

    @Override
    public int getItemCount() {
        return  this.foodItemModels.size();
    }
}
