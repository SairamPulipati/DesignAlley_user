package com.example.design_alley;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class More extends AppCompatActivity {
   private RecyclerView recyclerViewmore;
   private Button mSignout;
   private ArrayList<moreModel> more;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        recyclerViewmore = findViewById(R.id.more_rv_recycler);
        more = new ArrayList<>();
        Integer[] icons = {R.drawable.hand,R.drawable.orders,R.drawable.notification,R.drawable.email,R.drawable.info};
        String[] details = {"Payment Details","My Orders","Notifications","Chats","About Us"};
        for (int m=0;m<icons.length;m++){
            moreModel moreModel = new moreModel(icons[m],details[m]);
            more.add(moreModel);
        }
        PaymentMoreRecycler moreadapter = new PaymentMoreRecycler(more);
        LinearLayoutManager layoutManagerm = new LinearLayoutManager(getApplicationContext());
        recyclerViewmore.setLayoutManager(layoutManagerm);
        recyclerViewmore.setItemAnimator(new DefaultItemAnimator());
        recyclerViewmore.setAdapter(moreadapter);
        BottomNavigationView bottomNavigationView3 =findViewById(R.id.more_bnav_bottom);
        bottomNavigationView3.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),Home.class));
                        overridePendingTransition(0,0);
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
                        return true;
                }
                return false;
            }
        });

    }

    private void More_SignoutActivity() {
        Intent msignIntent = new Intent(this,login.class);
        startActivity(msignIntent);
    }
}