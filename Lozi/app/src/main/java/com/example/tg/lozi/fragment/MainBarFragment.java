package com.example.tg.lozi.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.tg.lozi.activity.R;

/**
 * Created by TG on 03-12-17.
 */

public class MainBarFragment extends Fragment {
    View view;
    ImageButton ibHome,ibMessage,ibSell,ibNotification,ibUser;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_main_bar,container,false);
        init();
        control();
        return view;
    }

    private void init() {
        ibHome=(ImageButton)view.findViewById(R.id.ibHome);
        ibMessage=(ImageButton)view.findViewById(R.id.ibMessage);
        ibSell=(ImageButton)view.findViewById(R.id.ibSell);
        ibNotification=(ImageButton)view.findViewById(R.id.ibNotification);
        ibUser=(ImageButton)view.findViewById(R.id.ibUser);
    }

    private void control() {

        ibHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Tab Home", Toast.LENGTH_SHORT).show();
            }
        });
        ibMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        ibSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        ibNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        ibUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
