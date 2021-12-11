package com.example.tg.lozi.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.tg.lozi.activity.R;

/**
 * Created by TG on 04-12-17.
 */

public class PurchaseFragment extends android.support.v4.app.Fragment{
	public void PurchaseFragment(){

	}
	View view;
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
		view=inflater.inflate(R.layout.fragment_purchase,container,false);
		init();
		control();
		return view;
	}

	private void control() {
		Toast.makeText(getContext(), "Purchase", Toast.LENGTH_SHORT).show();
	}

	private void init() {

	}
}
