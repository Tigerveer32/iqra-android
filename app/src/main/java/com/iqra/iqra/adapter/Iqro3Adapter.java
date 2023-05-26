package com.iqra.iqra.adapter;

/**
 * Created by Ujang Wahyu on 11/04/2017.
 */


import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.iqra.iqra.R;

public class Iqro3Adapter extends PagerAdapter {
    Context mContext;

    public Iqro3Adapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return sliderImagesId.length;
    }

    private int[] sliderImagesId = new int[]{
            R.drawable.c1, R.drawable.c2, R.drawable.c3,
            R.drawable.c4, R.drawable.c5, R.drawable.c6,
            R.drawable.c7, R.drawable.c8, R.drawable.c9,
            R.drawable.c10, R.drawable.c11, R.drawable.c12,
            R.drawable.c13, R.drawable.c14, R.drawable.c15,
            R.drawable.c16, R.drawable.c17, R.drawable.c18,
            R.drawable.c19, R.drawable.c20, R.drawable.c21,
            R.drawable.c22, R.drawable.c22, R.drawable.c23,
            R.drawable.c24, R.drawable.c25, R.drawable.c26,
            R.drawable.c27, R.drawable.c28, R.drawable.c29,
            R.drawable.c30,
    };

    @Override
    public boolean isViewFromObject(View v, Object obj) {
        return v == ((ImageView) obj);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int i) {
        ImageView mImageView = new ImageView(mContext);
        mImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        mImageView.setImageResource(sliderImagesId[i]);
        ((ViewPager) container).addView(mImageView, 0);
        return mImageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int i, Object obj) {
        ((ViewPager) container).removeView((ImageView) obj);
    }
}