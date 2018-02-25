package com.android.suci.suciwulandaagusti_1202150266_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_sc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_sc);

        final Handler handler = new Handler();//untuk menghandle splash screen
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));//pindah ke MainActivity
                finish();
            }
        }, 3000L); //waktu delay suatu splash screen
    }
}
