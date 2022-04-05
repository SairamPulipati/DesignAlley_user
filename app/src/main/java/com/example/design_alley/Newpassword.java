package com.example.design_alley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Newpassword extends AppCompatActivity {
   private Button Newpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpassword);
        Newpassword = findViewById(R.id.newpassword_btn_next);
        Newpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewpasswordActivity();
            }
        });
    }
    public void NewpasswordActivity(){
        Intent intent = new Intent(this,login.class);
        startActivity(intent);
    }
}