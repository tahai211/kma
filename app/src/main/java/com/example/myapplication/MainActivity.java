package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
        setContentView(R.layout.study);

        statuscolor();
    }

    private void statuscolor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
        {
            getWindow().setStatusBarColor(getResources().getColor(R.color.white,this.getTheme()));

        }else if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        }
    }
}