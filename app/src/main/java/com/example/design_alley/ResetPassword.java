package com.example.design_alley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResetPassword extends AppCompatActivity {
   private Button Reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        Reset = findViewById(R.id.reset_btn_reset);
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetpasswordActivity();
            }
        });
    }
    public void resetpasswordActivity(){
        Intent intent = new Intent(this,Newpassword.class);
        startActivity(intent);
    }
}