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
   private Button mEdit;
   private ArrayList<moreModel> more;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        mSignout = findViewById(R.id.more_btn_signout);
        mEdit = findViewById(R.id.more_btn_edit);
        mSignout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                More_SignoutActivity();
            }
        });
        mEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                More_EditActivity();
            }
        });
        recyclerViewmore = findViewById(R.id.more_rv_recycler);
        more = new ArrayList<>();
        Integer[] icons = {R.drawable.ic_baseline_monetization,R.drawable.ic_baseline_shopping_bag,R.drawable.ic_baseline_notifications,R.drawable.ic_baseline_chat,R.drawable.ic_baseline_info};
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
    private void More_EditActivity(){
        Intent mEditIntent = new Intent(this,Profile.class);
        startActivity(mEditIntent);
    }
}