package com.example.design_alley;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class Home2 extends AppCompatActivity {
  private RecyclerView recyclerView3;
  private ArrayList<Mainmodel2> info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        recyclerView3 =findViewById(R.id.home2_rv_recycler2);
        info = new ArrayList<>();
        Integer[] imageinfo = {R.drawable.interior,R.drawable.interior1,R.drawable.interior2,R.drawable.interior3,R.drawable.interior,R.drawable.interior,R.drawable.interior,R.drawable.interior1,R.drawable.interior1,R.drawable.interior1};
        String[] labels = {"Info","Info","Info","Info","Info","Info","Info","Info","Info","Info"};
        for (int s=0;s<imageinfo.length;s++){
            Mainmodel2 mainmodel2 = new Mainmodel2(imageinfo[s],labels[s]);
            info.add(mainmodel2);
        }
        RecyclerAdapter3 adapter3 =new RecyclerAdapter3(Home2.this,info);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(getApplicationContext());
        recyclerView3.setLayoutManager(layoutManager3);
        recyclerView3.setItemAnimator(new DefaultItemAnimator());
        recyclerView3.setAdapter(adapter3);
        BottomNavigationView bottomNavigationView2 =findViewById(R.id.home2_bnav_bottom);
        bottomNavigationView2.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),Home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.dashboard:
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