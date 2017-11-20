package com.example.tg.lozi.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tg.lozi.adapter.FoodAdapter;
import com.example.tg.lozi.model.FoodItemModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TG on 11-11-17.
 */

public class FoodActivity extends AppCompatActivity{
    private GridLayoutManager xLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        setTitle(null);
        control();
    }

    private void control(){
        List<FoodItemModel>rowItemList=getAllItemList();
        xLayout=new GridLayoutManager(FoodActivity.this,2);
        RecyclerView rcv=(RecyclerView)findViewById(R.id.rvFoodItem);
        rcv.setHasFixedSize(true);
        rcv.setLayoutManager(xLayout);

        FoodAdapter foodAdapter=new FoodAdapter(rowItemList, FoodActivity.this);
        rcv.setAdapter(foodAdapter);
    }

    private List<FoodItemModel>getAllItemList(){
        List<FoodItemModel>allItems=new ArrayList<FoodItemModel>();
        allItems.add(new FoodItemModel("Trà sữa và ăn vặt...",R.mipmap.food_tra_sua_an_vat,"121 Thành Thái...","5","Nguyễn Văn A",R.mipmap.ic_launcher));
        allItems.add(new FoodItemModel("Trà sữa và ăn vặt...",R.mipmap.food_tra_sua_an_vat,"121 Thành Thái...","5","Nguyễn Văn A",R.mipmap.ic_launcher));
        allItems.add(new FoodItemModel("Trà sữa và ăn vặt...",R.mipmap.food_tra_sua_an_vat,"121 Thành Thái...","5","Nguyễn Văn A",R.mipmap.ic_launcher));
        allItems.add(new FoodItemModel("Trà sữa và ăn vặt...",R.mipmap.food_tra_sua_an_vat,"121 Thành Thái...","5","Nguyễn Văn A",R.mipmap.ic_launcher));
        allItems.add(new FoodItemModel("Trà sữa và ăn vặt...",R.mipmap.food_tra_sua_an_vat,"121 Thành Thái...","5","Nguyễn Văn A",R.mipmap.ic_launcher));
        allItems.add(new FoodItemModel("Trà sữa và ăn vặt...",R.mipmap.food_tra_sua_an_vat,"121 Thành Thái...","5","Nguyễn Văn A",R.mipmap.ic_launcher));
        allItems.add(new FoodItemModel("Trà sữa và ăn vặt...",R.mipmap.food_tra_sua_an_vat,"121 Thành Thái...","5","Nguyễn Văn A",R.mipmap.ic_launcher));
        allItems.add(new FoodItemModel("Trà sữa và ăn vặt...",R.mipmap.food_tra_sua_an_vat,"121 Thành Thái...","5","Nguyễn Văn A",R.mipmap.ic_launcher));
        allItems.add(new FoodItemModel("Trà sữa và ăn vặt...",R.mipmap.food_tra_sua_an_vat,"121 Thành Thái...","5","Nguyễn Văn A",R.mipmap.ic_launcher));
        allItems.add(new FoodItemModel("Trà sữa và ăn vặt...",R.mipmap.food_tra_sua_an_vat,"121 Thành Thái...","5","Nguyễn Văn A",R.mipmap.ic_launcher));
        allItems.add(new FoodItemModel("Trà sữa và ăn vặt...",R.mipmap.food_tra_sua_an_vat,"121 Thành Thái...","5","Nguyễn Văn A",R.mipmap.ic_launcher));
        allItems.add(new FoodItemModel("Trà sữa và ăn vặt...",R.mipmap.food_tra_sua_an_vat,"121 Thành Thái...","5","Nguyễn Văn A",R.mipmap.ic_launcher));
        allItems.add(new FoodItemModel("Trà sữa và ăn vặt...",R.mipmap.food_tra_sua_an_vat,"121 Thành Thái...","5","Nguyễn Văn A",R.mipmap.ic_launcher));
        return allItems;
    }
}
