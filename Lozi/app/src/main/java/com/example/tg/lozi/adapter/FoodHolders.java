package com.example.tg.lozi.adapter;

import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.example.tg.lozi.activity.R;

/**
 * Created by TG on 11-11-17.
 */

public class FoodHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

public AppCompatImageView imgFood;
public AppCompatTextView tvNameFood;
public AppCompatTextView tvDecribe;
public AppCompatTextView tvPrice;
public ImageButton ibBuy;



public FoodHolders(View itemView){
    super(itemView);
    itemView.setOnClickListener(this);

    imgFood=(AppCompatImageView)itemView.findViewById(R.id.imgFood);


    tvNameFood=(AppCompatTextView)itemView.findViewById(R.id.tvNameFood);
    tvDecribe=(AppCompatTextView)itemView.findViewById(R.id.tvDecribe);
    tvPrice=(AppCompatTextView)itemView.findViewById(R.id.tvPrice);
    ibBuy=(ImageButton)itemView.findViewById(R.id.ibBuy);

}
    @Override
    public void onClick(View view){

    }
}
