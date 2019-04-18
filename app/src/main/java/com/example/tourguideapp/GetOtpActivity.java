package com.example.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GetOtpActivity extends Activity {
    EditText editOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getotp);
        editOtp=findViewById(R.id.enterOtp);
        editOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(GetOtpActivity.this, ProfileActivity.class);
                startActivity(i);
            }
        });
    }
}
