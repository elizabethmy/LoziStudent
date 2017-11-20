package com.example.tg.lozi.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tg.lozi.model.MainItemModel;
import com.example.tg.lozi.activity.R;

import java.util.List;

;

/**
 * Created by TG on 09-11-17.
 */

public class MainAdapter extends RecyclerView.Adapter<MainHolders>{
    private List<MainItemModel> mainItemModels;
    private Context context;

    public MainAdapter(List<MainItemModel> mainItemModels, Context context){
        this.mainItemModels = mainItemModels;
        this.context=context;
    }

    @Override
    public MainHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView= LayoutInflater.from(parent.getContext()).inflate(R.layout.main_card_view_list,null);
        MainHolders rcv=new MainHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(MainHolders holder, int position) {
        holder.tvName.setText(mainItemModels.get(position).getName());
        holder.imgItem.setImageResource(mainItemModels.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.mainItemModels.size();
    }
}