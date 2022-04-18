package com.example.design_alley;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;
    private ArrayList<MainModel> data;
    private ArrayList<Mainmodel1> list;
    //private ArrayList<Models> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = findViewById(R.id.home_rv_recycler);
        recyclerView2 = findViewById(R.id.home_rv_recycler1);
        data = new ArrayList<>();
        list = new ArrayList<>();
        Integer[] imagelist = {R.drawable.interior_design,R.drawable.interior_design,R.drawable.interior_design,R.drawable.interior_design};
        String[] Names = {"N/a","N/a","N/a","N/a"};
        Integer[] gallery = {R.drawable.interior,R.drawable.interior1,R.drawable.interior2,R.drawable.interior3,R.drawable.interior,R.drawable.interior,R.drawable.interior};
        for (int i=0;i<gallery.length;i++){
            MainModel model = new MainModel(gallery[i]);
            data.add(model);
        }
        for (int k=0;k<imagelist.length;k++){
            Mainmodel1 model1 = new Mainmodel1(imagelist[k],Names[k]);
            list.add(model1);
        }
        RecylerViewAdapter adapter = new RecylerViewAdapter(Home.this,data);
       LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
       RecyclerAdapter adapter1 = new RecyclerAdapter(Home.this,list);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getApplicationContext());
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView2.setItemAnimator(new DefaultItemAnimator());
        recyclerView2.setAdapter(adapter1);
        BottomNavigationView bottomNavigationView =findViewById(R.id.home_bnav_bottom);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        return true;
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext(),Home2.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.chat:
                        startActivity(new Intent(getApplicationContext(),Chat.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(),More.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });



    }





}