package com.myhexaville.androidwebrtc;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.myhexaville.androidwebrtc.app_rtc_sample.main.AppRTCMainActivity;

public class Splash extends AppCompatActivity {
    int DELAYE_TIME = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //        Handler for creating a delay to start the Another Activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this, AppRTCMainActivity.class));
                finish();
            }
        }, DELAYE_TIME);
    }
}
