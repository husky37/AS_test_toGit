package com.develop.art_me.as_test_togit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(multiplex(12,45));
    }

    public int multiplex(int a, int b){
        return a*b;
    }
}
