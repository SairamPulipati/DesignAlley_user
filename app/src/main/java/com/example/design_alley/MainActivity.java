package com.example.design_alley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private Button Signin;
    private Button Signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Signup = findViewById(R.id.launch_btn_signin);
        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
        Signin = findViewById(R.id.launch_btn_signup);
        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }
    public void openActivity(){
        Intent intent = new Intent(this,login.class);
        startActivity(intent);
    }
    public void openActivity2(){
        Intent intent = new Intent(this,Signup.class);
        startActivity(intent);
    }
}