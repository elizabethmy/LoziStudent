package com.example.tg.lozi.adapter;

import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.tg.lozi.activity.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by TG on 11-11-17.
 */

public class FoodHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

public AppCompatImageView imgFood;
public AppCompatTextView tvNameFood;
public AppCompatTextView tvAdress;
public AppCompatTextView tvNumLike;
public AppCompatTextView tvNameUser;
public CircleImageView imgUser;


public FoodHolders(View itemView){
    super(itemView);
    itemView.setOnClickListener(this);

    imgFood=(AppCompatImageView)itemView.findViewById(R.id.imgFood);
    imgUser=(CircleImageView)itemView.findViewById(R.id.imgUser);

    tvNameFood=(AppCompatTextView)itemView.findViewById(R.id.tvNameFood);
    tvAdress=(AppCompatTextView)itemView.findViewById(R.id.tvAdress);
    tvNumLike=(AppCompatTextView)itemView.findViewById(R.id.tvNumLike);
    tvNameUser=(AppCompatTextView)itemView.findViewById(R.id.tvNameUser);
}
    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(), "Click item"+getPosition(), Toast.LENGTH_SHORT).show();
    }
}
