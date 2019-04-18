package com.example.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public  class DetailProfileActivity extends Activity {
    Button nextButton;
    ImageView imageArrow;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_profile);
        nextButton=findViewById(R.id.nextButton);
        imageArrow=findViewById(R.id.left_arrow);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(DetailProfileActivity.this,MyTourActivity.class);
                startActivity(i);
            }
        });
        imageArrow.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DetailProfileActivity.this,ProfileActivity.class);
                startActivity(intent);

            }
        });
    }
}
