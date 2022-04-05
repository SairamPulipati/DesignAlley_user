package com.example.design_alley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {
   private Button login;
   private Button Signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        login = findViewById(R.id.signup_btn_login);
        Signup = findViewById(R.id.signup_btn_signup);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Signup_loginActivity();
            }
        });
        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Signup_signupActivity();
            }
        });
    }
    public void Signup_loginActivity(){
        Intent intent = new Intent(this,login.class);
        startActivity(intent);
    }
    public void Signup_signupActivity(){
        Intent intent = new Intent(this,login.class);
        startActivity(intent);
    }
}