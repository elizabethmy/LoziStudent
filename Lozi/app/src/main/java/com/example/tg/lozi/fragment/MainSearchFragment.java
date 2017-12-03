package com.example.tg.lozi.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tg.lozi.activity.R;
import com.example.tg.lozi.activity.SearchActivity;

/**
 * Created by TG on 03-12-17.
 */

public class MainSearchFragment extends Fragment{
    TextView tvCity;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_main_search,container,false);
        init();
        control();
        return view;
    }

    private void control() {
        tvCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), SearchActivity.class));
            }
        });
    }

    private void init() {
        tvCity=(TextView)view.findViewById(R.id.tvCity);
    }
}
