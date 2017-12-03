package com.example.tg.lozi.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.tg.lozi.fragment.MainBarFragment;
import com.example.tg.lozi.fragment.MainFragment;


/**drawable :
 *
 * Created by TG on 02-12-17.
 */

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // control();
    }

    private void control() {
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();//them vao gi do
        Fragment fragment1=null;
        Fragment fragment2=null;
        fragment1=new MainFragment();
        fragment2=new MainBarFragment();

        fragmentTransaction.add(R.id.layMain,fragment1);
        fragmentTransaction.add(R.id.layMain,fragment2);
        fragmentTransaction.commit();
    }
}
