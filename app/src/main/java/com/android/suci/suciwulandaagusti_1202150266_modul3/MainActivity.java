package com.android.suci.suciwulandaagusti_1202150266_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;//variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.user);
    }

    public void login(View view) {
        username = (EditText)findViewById(R.id.user);//deklarasi username
        password = (EditText)findViewById(R.id.pass);//deklarasi password

//Kondisi untuk mengatur Username dan Password, sehingga bisa login
        if (username.getText().toString().equals("EAD")&&password.getText().toString().equals("MOBILE")){
            startActivity(new Intent(getApplicationContext(), ListMineral.class));//berpindah dari MainActivity ke class ListMineral
            Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();//kondisi jika berhasil login
        }
        else {
            Toast.makeText(getApplicationContext(), "Login Gagal (Username : EAD, pass : mobile", Toast.LENGTH_SHORT).show();//kondisi jika login gagal
        }

    }
}
