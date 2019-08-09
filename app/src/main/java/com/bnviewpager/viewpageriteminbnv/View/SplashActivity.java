package com.bnviewpager.viewpageriteminbnv.View;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.bnviewpager.viewpageriteminbnv.MainActivity;

/*Tanggal Pengerjaan : 21/5/2019
  Nim                : 10116135
  Nama               : Rival Agung Fahrizal
  Kelas              : IF-3
* */

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1500;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
