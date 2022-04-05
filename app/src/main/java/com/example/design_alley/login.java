package com.example.design_alley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    private Button login;
    private Button Signup;
    private Button Forgot;
    private Button login1;
    private Button login2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Signup = findViewById(R.id.login_btn_signup);
        login = findViewById(R.id.login_button_login);
        Forgot =findViewById(R.id.login_button_forgotpassword);



        Forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login_ForgotActivity();
            }
        });
        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login_SignupActivity();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginActivity2();
            }
        });
    }
    public void loginActivity2(){
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
    }
    public void login_SignupActivity(){
        Intent intent = new Intent(this,Signup.class);
        startActivity(intent);
    }
    public void login_ForgotActivity(){
        Intent intent = new Intent(this,ResetPassword.class);
        startActivity(intent);
    }

}