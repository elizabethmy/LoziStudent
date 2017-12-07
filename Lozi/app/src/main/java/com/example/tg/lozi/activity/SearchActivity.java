package com.example.tg.lozi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by TG on 03-12-17.
 */

public class SearchActivity extends AppCompatActivity {
    private Toolbar toolbar;
    ArrayList<String>arrayList;
    ListView lvMain;//show city or province to search
    ArrayAdapter<String>arrayAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        init();
        control();

    }

    private void control() {
        arrayAdapter=new ArrayAdapter<String>(SearchActivity.this,
                                              android.R.layout.simple_list_item_1,
                                                arrayList);
        lvMain.setAdapter(arrayAdapter);
    }

    private void init() {
        lvMain=(ListView)findViewById(R.id.lvMain);
        arrayList=new ArrayList<>();
        arrayList.addAll(Arrays.asList(getResources().getStringArray(R.array.array_city_province)));
        // Set toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle(R.string.search_activity_title);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_keyboard_arrow_left);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_search,menu);
        MenuItem menuItem=menu.findItem(R.id.mSearch);
        SearchView searchView=(SearchView)menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(SearchActivity.this, MainActivity.class));
            finish(); // Or do you own task
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
