package com.example.tg.lozi.activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.telecom.Call;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

/**
 * Created by TG on 20-11-17.
 */

public class LoginFacebookActivity extends AppCompatActivity {
        LoginButton btloginFB;
        CallbackManager callbackManager

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
    private void mapVariable(){
        btloginFB=(LoginButton)findViewById(R.id.btLoginFB);
    }
    private  void control(){
        // Callback registration
        callbackManager= CallbackManager.Factory.create();
        btloginFB.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                //App code

            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {

            }
        });
    }

}
