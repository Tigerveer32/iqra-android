
package com.iqra.iqra;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.iqra.iqra.adapter.Iqro2Adapter;
import com.iqra.iqra.adapter.Iqro4Adapter;

public class Iqro4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro4);
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        Iqro4Adapter adapterView = new Iqro4Adapter(this);
        mViewPager.setAdapter(adapterView);
    }
}
