package com.example.tg.lozi.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.tg.lozi.adapter.ViewPagerAdapter;
import com.example.tg.lozi.fragment.PurchaseFragment;
import com.example.tg.lozi.fragment.SellStoreFragment;

/**
 * Created by TG on 04-12-17.
 */

public class StoreActivity extends AppCompatActivity{
View view;
private ViewPager viewPager;
private TabLayout tabLayout;


//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        view=inflater.inflate(R.layout.fragment_store,container,false);
//
//
//        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
//        setupViewPager(viewPager);
//
//        tabLayout = (TabLayout)view.findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);
//        return view;
//    }

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_store);
		viewPager = (ViewPager) findViewById(R.id.viewpager);
		setupViewPager(viewPager);

		tabLayout = (TabLayout)findViewById(R.id.tabs);
		tabLayout.setupWithViewPager(viewPager);
	}

	public void setupViewPager(ViewPager viewPager) {
		Toast.makeText(this, "setupviewPager", Toast.LENGTH_SHORT).show();
	   // FragmentActivity fragmentActivity = new FragmentActivity();
		ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
		viewPagerAdapter.addFragment(new PurchaseFragment(),"Mua");
		viewPagerAdapter.addFragment(new SellStoreFragment(),"Bán");
		viewPager.setAdapter(viewPagerAdapter);

	}


}
