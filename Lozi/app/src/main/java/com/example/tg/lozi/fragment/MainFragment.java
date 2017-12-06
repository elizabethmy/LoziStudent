package com.example.tg.lozi.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.tg.lozi.activity.R;
import com.example.tg.lozi.adapter.MainAdapter;
import com.example.tg.lozi.model.MainItemModel;
import com.example.tg.lozi.util.CheckConnection;
import com.example.tg.lozi.util.Server;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {
    private GridLayoutManager xLayout;
    private  View view;
    ViewFlipper viewFlipper;
    int id=0;
    String nameTypeProduct="";
    String imageTypeProduct="";
    List<MainItemModel>allItems;
    MainAdapter rvAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
      view =inflater.inflate(R.layout.fragment_main,container,false);

        Control();
        return view;
    }




    private void Control(){
        if(CheckConnection.haveNetworkConnection(getContext())){
            allItems=new ArrayList<MainItemModel>();
            RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.rvItem);
            xLayout = new GridLayoutManager(getActivity(), 2);

            getTypeProduct();
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(xLayout);
            rvAdapter=new MainAdapter(allItems,getActivity());
            recyclerView.setAdapter(rvAdapter);


            viewFlipper=(ViewFlipper)view.findViewById(R.id.viewflipper);
            actionViewFlipper();
        }else{
            CheckConnection.showToastShort(getContext(),"Error: No connection!");
            getActivity().finish();
        }
    }

    private void getTypeProduct() {

        RequestQueue requestQueue= Volley.newRequestQueue(getContext());
        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(Request.Method.GET, Server.urlGetTypeProduct, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                    //
                        if(response!=null){
                            for(int i=0;i<response.length();i++){
                                try {
                                    JSONObject jsonObject=response.getJSONObject(i);
                                    id=jsonObject.getInt("Id_type");
                                    nameTypeProduct=jsonObject.getString("Name_type");
                                    imageTypeProduct=jsonObject.getString("Image_type");
                                    allItems.add(new MainItemModel(id,nameTypeProduct,imageTypeProduct));
                                    rvAdapter.notifyDataSetChanged();
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
                        CheckConnection.showToastShort(getContext(),error.toString());
                    }
                });
        requestQueue.add(jsonArrayRequest);
    }

    private void actionViewFlipper() {
        ArrayList<String>manageAdvertise=new ArrayList<>();
        manageAdvertise.add("https://images-na.ssl-images-amazon.com/images/I/61XTPnfEZcL.jpg");
        manageAdvertise.add("https://t3.ftcdn.net/jpg/01/07/83/62/500_F_107836201_5C6e3enAcXoF0pMRbcPYgMbEU4N2kqsg.jpg");
        manageAdvertise.add("https://i.ytimg.com/vi/Od6La6QFDz8/maxresdefault.jpg");
        manageAdvertise.add("https://i.pinimg.com/736x/a7/b2/38/a7b238a86122a0a65b839eecb693f7b9--clothing-apparel-woman-clothing.jpg");
        manageAdvertise.add("http://economists-pick-research.hktdc.com/resources/MI_Portal/Article/imn/2016/04/474262/1461310904232_16-4-4r1-2_474262.jpg");
        for(int i=0;i<manageAdvertise.size();i++){
            ImageView imageView=new ImageView(getContext());
            Picasso.with(getContext()).load(manageAdvertise.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(6000);
        viewFlipper.setAutoStart(true);
        Animation animation_slide_in= AnimationUtils.loadAnimation(getContext(),R.anim.slide_in_right);
        Animation animation_slide_out= AnimationUtils.loadAnimation(getContext(),R.anim.slide_out_right);
        viewFlipper.setInAnimation(animation_slide_in);
        viewFlipper.setOutAnimation(animation_slide_out);
    }




}


