package com.example.tg.lozi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.tg.lozi.adapter.FoodAdapter;
import com.example.tg.lozi.model.FoodItemModel;
import com.example.tg.lozi.util.CheckConnection;
import com.example.tg.lozi.util.Server;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TG on 11-11-17.
 */

public class FoodActivity extends AppCompatActivity{
    private GridLayoutManager xLayout;
    private TextView tvCity;
    List<FoodItemModel>allItems;
    FoodAdapter foodAdapter;
    RecyclerView rcv;
    private int idFood;
    private  String nameFood;
    private  String imageFood;
    private int priceFood;
    private String decribeFood;
    private String adress;
    private int idType;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_food);
        setTitle(null);
        control();
    }

    private void control(){
        if(CheckConnection.haveNetworkConnection(getApplicationContext())){

            allItems = new ArrayList<FoodItemModel>();
            xLayout=new GridLayoutManager(FoodActivity.this,2);
        rcv=(RecyclerView)findViewById(R.id.rvFoodItem);

        getFood();
        rcv.setHasFixedSize(true);
        rcv.setLayoutManager(xLayout);
        foodAdapter=new FoodAdapter(allItems, FoodActivity.this);
        rcv.setAdapter(foodAdapter);

        tvCity=(TextView)findViewById(R.id.tvCity);
        tvCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FoodActivity.this,SearchActivity.class));
            }
        });
        }else{
            CheckConnection.showToastShort(getApplicationContext(),"Error: No Internet connection!");
            finish();
        }
    }

    private void getFood() {
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(Request.Method.GET, Server.urlGetFood, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        //
                        if(response!=null){
                            allItems.clear();//dam xoa du lieu neu bi trung
                            for(int i=0;i<response.length();i++){
                                try {
                                    JSONObject jsonObject=response.getJSONObject(i);
                                    idFood = jsonObject.getInt("Id_food");
                                    nameFood=jsonObject.getString("Name_food");
                                    imageFood=jsonObject.getString("Image_food");
                                    idType=jsonObject.getInt("Id_type");
                                    priceFood=jsonObject.getInt("Price");
                                    decribeFood=jsonObject.getString("Decribe");
                                    adress=jsonObject.getString("Adress");
                                    allItems.add(new FoodItemModel(nameFood,imageFood,adress,priceFood,decribeFood,idType,idFood));
                                    foodAdapter.notifyDataSetChanged();
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        }else{
                            //if response==null
                        }
                        //
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        CheckConnection.showToastShort(getApplicationContext(),error.toString());
                    }
                });
        requestQueue.add(jsonArrayRequest);
    }


}
