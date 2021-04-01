package com.example.nurainunapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickRS(View view) {
        //gambar RS di click
        Intent i=new Intent(this, RS.class);
        startActivity(i);
    }

    public void clickPolisi(View view) {
        //gambar Polisi di click
        Intent i=new Intent(this, Polisi.class);
        startActivity(i);
    }

    public void clickSupermarket(View view) {
        //gambar Supermarket di click
        Intent i=new Intent(this, Supermarket.class);
        startActivity(i);
    }

    public void clickSekolah(View view) {
        //gambar Sekolah di click
        Intent i=new Intent(this, Sekolah.class);
        startActivity(i);
    }
}