package com.example.tg.lozi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.tg.lozi.util.Server;

import java.util.HashMap;
import java.util.Map;

public class SellActivity extends AppCompatActivity {

        EditText etName,etPrice,etDecribe;
        Button btAdd,btCc,btType,btAdress,btImage;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_buy);
            init();
            control();
        }

    private void control() {
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameGet=etName.getText().toString().trim();
                String decribe=etDecribe.getText().toString().trim();
                String price=etDecribe.getText().toString().trim();
                if(nameGet.isEmpty()||decribe.isEmpty()||price.isEmpty()){
                    Toast.makeText(SellActivity.this, "You did not insert enough data", Toast.LENGTH_SHORT).show();
                }else{

                    addStudent(Server.urlInsert);
                }
            }
        });
        btCc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    private void addStudent(String url){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request=new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.trim().equals("success")){
                            Toast.makeText(SellActivity.this, "Added data success", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(SellActivity.this,MainActivity.class));
                        }else{
                            Toast.makeText(SellActivity.this, "Added data failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(SellActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
                    }
                }){

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                //Map nhan vao 2 gia tri la key va value, tat ca deu la string
                Map<String,String> params=new HashMap<>();
                //tien hanh day du lieu vao
                params.put("name_foodf",etName.getText().toString().trim());
                params.put("describe_foodf",etDecribe.getText().toString().trim());
                params.put("price_foodf",etPrice.getText().toString().trim());

                return params;
            }
        };//day du lieu, thi method la post
        //luon nho la phai add vao requestque doi tuong
        requestQueue.add(request);

    }

    private void init() {
        etName=(EditText)findViewById(R.id.etNameInsert);
        etDecribe=(EditText)findViewById(R.id.etDescribe);
        etPrice=(EditText)findViewById(R.id.etPrice);

        btAdd=(Button)findViewById(R.id.btInsert);
        btCc=(Button)findViewById(R.id.btCancelInsert);

        btAdress=(Button)findViewById(R.id.btProvince);
        btImage=(Button)findViewById(R.id.btImage);
        btType=(Button)findViewById(R.id.btType);
    }
}

