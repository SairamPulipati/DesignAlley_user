package com.example.design_alley;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class Chat extends AppCompatActivity {
   private ArrayList<chatModel> info;

   private RecyclerView chatrecyclerview;
    private Context chatContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        chatrecyclerview = findViewById(R.id.chat_rv_recycler);
        info = new ArrayList<>();
       String inmessages[] = {"Hai","I want to renovate my house","Could you please share me your previous works","IT's looking good"};
       String outmessages[] = {"Hai","Wow Cool","I attached the files to you","Could please go through it once"};
      for (int i=0;i<inmessages.length;i++){
          chatModel chatModel = new chatModel(inmessages[i],outmessages[i]);
          info.add(chatModel);
      }

        ChatAdapter chatAdapter = new ChatAdapter(this,info);
        LinearLayoutManager linearLayoutManagercaht = new LinearLayoutManager(getApplicationContext());
        chatrecyclerview.setLayoutManager(linearLayoutManagercaht);
        chatrecyclerview.setAdapter(chatAdapter);


        BottomNavigationView bottomNavigationView2 =findViewById(R.id.chat_bnav_bottom);
        bottomNavigationView2.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
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