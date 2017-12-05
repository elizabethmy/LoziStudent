package com.example.tg.lozi.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.tg.lozi.fragment.MainFragment;
import com.example.tg.lozi.fragment.NotificationFragment;
import com.example.tg.lozi.fragment.UserInfoFragment;


/**drawable :
 *
 * Created by TG on 02-12-17.
 */

public class MainActivity extends AppCompatActivity{
    ImageButton ibHome,ibMessage,ibSell,ibNotification,ibUser;
    Fragment fragment=null;
    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        control();
        ibMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,StoreActivity.class));
            }
        });
        fragment=new MainFragment();
        fragmentTransaction.add(R.id.framefragment,fragment,"frag");
        fragmentTransaction.commit();
    }

    private void control() {
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction =fragmentManager.beginTransaction();//them vao gi do

    }
    private void init() {
        ibHome=(ImageButton)findViewById(R.id.ibHome);
        ibMessage=(ImageButton)findViewById(R.id.ibMessage);
        ibSell=(ImageButton)findViewById(R.id.ibSell);
        ibNotification=(ImageButton)findViewById(R.id.ibNotification);
        ibUser=(ImageButton)findViewById(R.id.ibUser);
    }
    public void AddFragment(View view) {//bat buot fai public
        control();
//        if(fragment!=null){
//            fragmentTransaction.remove(fragment);
//        }


        switch (view.getId()){

            case R.id.ibHome:
                fragment=new MainFragment();

                break;

            //case R.id.ibMessage:
                //fragment=new StoreActivity();

                //break;


            case R.id.ibNotification:
                fragment=new NotificationFragment();

                break;
            case R.id.ibUser:
                fragment=new UserInfoFragment();
                break;
        }
        if(fragment!=null){
            fragmentTransaction.replace(R.id.framefragment,fragment,"frag");
        }else{
            fragmentTransaction.add(R.id.framefragment,fragment,"frag");
        }

        fragmentTransaction.commit();

    }


}
