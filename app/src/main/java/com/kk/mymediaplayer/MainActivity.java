package com.kk.mymediaplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kk.mylibrary.myplayer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myplayer mp = new myplayer();
    }
}
