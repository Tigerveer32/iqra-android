package com.iqra.iqra;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ViewFlipper;

import com.iqra.iqra.adapter.Iqro1Adapter;

public class Iqro1Activity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Button next;
    Button previous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro1);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        Iqro1Adapter adapterView = new Iqro1Adapter(this);
        mViewPager.setAdapter(adapterView);

        }
}
