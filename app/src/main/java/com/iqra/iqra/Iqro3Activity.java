package com.iqra.iqra;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.iqra.iqra.adapter.Iqro2Adapter;
import com.iqra.iqra.adapter.Iqro3Adapter;

public class Iqro3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro3);
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        Iqro3Adapter adapterView = new Iqro3Adapter(this);
        mViewPager.setAdapter(adapterView);
    }
}
