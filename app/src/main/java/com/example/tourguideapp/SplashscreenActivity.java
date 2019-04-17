package com.example.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;

public class SplashscreenActivity extends Activity {
    private final int SPLASH_DISPLAY_LENGTH = 4000;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splashscreen);
        LinearLayout linearLayout=findViewById(R.id.linearLayout);
//        linearLayout.setAlpha("");

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashscreenActivity.this,MainActivity.class);
                SplashscreenActivity.this.startActivity(mainIntent);
                SplashscreenActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}