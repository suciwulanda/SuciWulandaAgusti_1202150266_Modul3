package com.android.suci.suciwulandaagusti_1202150266_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailDrink extends AppCompatActivity {

    TextView title;
    ImageButton plus, minus;
    ImageView photo, volumAir;
    private int minteger;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_drink);

        Intent intent = getIntent();
        String titles = intent.getStringExtra("title");
        Integer photos = intent.getIntExtra("photo", 0);

        title =  (TextView) findViewById(R.id.title);
        plus = (ImageButton) findViewById(R.id.ib_plus);
        minus = (ImageButton) findViewById(R.id.ib_minus);
        photo = (ImageView) findViewById(R.id.photo);
        volumAir = (ImageView) findViewById(R.id.iv_volumeAir);



        title.setText(titles);
        photo.setImageResource(photos);

    }
    public void onPlus(View view) {
        minteger = minteger + 1;
        display(minteger);
        if(minteger==4) {
            plus.setEnabled(false);
        }

        switch (minteger){
            case (1):
                volumAir.setImageResource(R.drawable.ic_battery);
                Toast.makeText(getApplicationContext(),"Air sedikit!",Toast.LENGTH_SHORT).show();
                break;
            case (2):
                volumAir.setImageResource(R.drawable.ic_battery_50);
                break;
            case (3):
                volumAir.setImageResource(R.drawable.ic_battery_80);
                break;
            case (4):
                volumAir.setImageResource(R.drawable.ic_battery_full);
                Toast.makeText(getApplicationContext(),"Air sudah full!", Toast.LENGTH_SHORT).show();
                break;
        }

    }

    public void onMinus(View view) {
        minteger = minteger - 1;
        display(minteger);
        if(minteger==0) {
            minus.setEnabled(false);
        }
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(R.id.tv_liter);
        displayInteger.setText("" + number +" L");
    }

}





