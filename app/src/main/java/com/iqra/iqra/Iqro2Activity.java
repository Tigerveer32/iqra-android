package com.iqra.iqra;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ViewFlipper;

import com.iqra.iqra.adapter.Iqro1Adapter;
import com.iqra.iqra.adapter.Iqro2Adapter;

public class Iqro2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro2);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        Iqro2Adapter adapterView = new Iqro2Adapter(this);
        mViewPager.setAdapter(adapterView);

    }


}
