package com.example.tg.lozi.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.tg.lozi.activity.R;

/**
 * Created by TG on 04-12-17.
 */

public class SellStoreFragment extends Fragment {
    View view;
    public SellStoreFragment() {
        // Required empty public constructor
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_sell,container,false);
        init();
        control();
        return view;
    }

    private void control() {
        Toast.makeText(getContext(), "Sell", Toast.LENGTH_SHORT).show();
    }

    private void init() {

    }
}
