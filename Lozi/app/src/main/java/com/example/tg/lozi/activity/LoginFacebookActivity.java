package com.example.tg.lozi.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by TG on 20-11-17.
 */

public class LoginFacebookActivity extends AppCompatActivity {
		LoginButton btloginFB;
		CallbackManager callbackManager;
   public static String firstname, lastname, email,id;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		mapVariable();
		control();

	}

	public void goToMainActivity() {
		Intent intent=new Intent(LoginFacebookActivity.this,MainActivity.class);
		startActivity(intent);
		finish();
	}

	private void mapVariable(){
		btloginFB=(LoginButton)findViewById(R.id.btLoginFB);
	}
	private  void control(){
		// Callback registration
		callbackManager= CallbackManager.Factory.create();
		btloginFB.setReadPermissions("email","public_profile");
		btloginFB.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
			@Override
			public void onSuccess(LoginResult loginResult) {
				//App code
				String userID=loginResult.getAccessToken().getUserId();
				GraphRequest graphRequest=GraphRequest.newMeRequest(loginResult.getAccessToken(), new GraphRequest.GraphJSONObjectCallback() {
					@Override
					public void onCompleted(JSONObject object, GraphResponse response) {
						displayUserInfo(object);
					}
				});
				Bundle parameters=new Bundle();
				parameters.putString("fields","first_name, last_name, email, id");
				graphRequest.setParameters(parameters);
				graphRequest.executeAsync();
				goToMainActivity();
			}

			@Override
			public void onCancel() {

			}

			@Override
			public void onError(FacebookException error) {

			}
		});
	}


	public void displayUserInfo(JSONObject object) {
		try {
			firstname=object.getString("first_name");
			lastname=object.getString("last_name");
			email=object.getString("email");
			id=object.getString("id");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		//some action after get info

	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		callbackManager.onActivityResult(requestCode, resultCode, data);
	}



}
