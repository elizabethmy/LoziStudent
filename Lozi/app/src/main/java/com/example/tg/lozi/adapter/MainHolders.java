package com.example.tg.lozi.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tg.lozi.activity.R;

/**
 * Created by TG on 09-11-17.
 */

public class MainHolders extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView tvName;
    public ImageView imgItem;

    public MainHolders(View itemView){
        super(itemView);
        itemView.setOnClickListener(this);
        tvName=(TextView)itemView.findViewById(R.id.tvName);
        imgItem=(ImageView)itemView.findViewById(R.id.imgItem);
    }

    @Override
    public void onClick(View view){
        //Toast.makeText(view.getContext(), MainAdapter.nameProduct+"", Toast.LENGTH_SHORT).show();
    }
}
