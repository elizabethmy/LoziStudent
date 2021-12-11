package com.example.tg.lozi.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.tg.lozi.activity.BuyActivity;
import com.example.tg.lozi.activity.R;
import com.example.tg.lozi.model.FoodItemModel;
import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.util.List;

/**
 * Created by TG on 11-11-17.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodHolders>{
private List<FoodItemModel> foodItemModels;
private Context context;
public static String nameFood;

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
		holder.tvNameFood.setText(foodItemModels.get(position).getNameFood());
		holder.tvDecribe.setText(foodItemModels.get(position).getDecribeFood());

		Picasso.with(context).load(foodItemModels.get(position).getImageFood()).placeholder(R.drawable.ic_no_image).error(R.drawable.ico_delete).into(holder.imgFood);

		DecimalFormat decimalFormat=new DecimalFormat("###,###,###");
		holder.tvPrice.setText("Giá: "+decimalFormat.format(foodItemModels.get(position).getPriceFood())+" vnd");

		holder.itemView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(view.getContext(),nameFood, Toast.LENGTH_SHORT).show();
			}
		});
		holder.ibBuy.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(view.getContext(), "Buy", Toast.LENGTH_SHORT).show();
				context.startActivity(new Intent(context, BuyActivity.class));

			}
		});
	}

	@Override
	public int getItemCount() {
		return  this.foodItemModels.size();
	}
}
