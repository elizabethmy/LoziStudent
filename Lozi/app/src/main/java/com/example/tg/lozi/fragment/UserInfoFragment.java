package com.example.tg.lozi.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tg.lozi.activity.LoginFacebookActivity;
import com.example.tg.lozi.activity.R;

/**
 * Created by TG on 03-12-17.
 */

public class UserInfoFragment extends Fragment {
    View view;
    TextView tvFist,tvLast,tvEmail;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_user_info,container,false);
        control();
        return view;
    }

    private void control() {
        tvFist=(TextView)view.findViewById(R.id.tvNameUserFist);
        tvLast=(TextView)view.findViewById(R.id.tvNameUserLast);
        tvEmail=(TextView)view.findViewById(R.id.tvEmailUser);

        tvFist.setText(LoginFacebookActivity.firstname);
        tvLast.setText(LoginFacebookActivity.lastname);
        tvEmail.setText(LoginFacebookActivity.email);
    }
}
