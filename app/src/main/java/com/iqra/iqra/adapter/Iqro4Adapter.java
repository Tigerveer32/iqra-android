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

public class Iqro4Adapter extends PagerAdapter {
    Context mContext;

    public Iqro4Adapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return sliderImagesId.length;
    }

    private int[] sliderImagesId = new int[]{
            R.drawable.d1, R.drawable.d2, R.drawable.d3,
            R.drawable.d4, R.drawable.d5, R.drawable.d6,
            R.drawable.d7, R.drawable.d8, R.drawable.d9,
            R.drawable.d10, R.drawable.d11, R.drawable.d12,
            R.drawable.d13, R.drawable.d14, R.drawable.d15,
            R.drawable.d16, R.drawable.d17, R.drawable.d18,
            R.drawable.d19, R.drawable.a20, R.drawable.a21,
            R.drawable.d22, R.drawable.d22, R.drawable.d23,
            R.drawable.d24, R.drawable.d25, R.drawable.d26,
            R.drawable.d27, R.drawable.d28, R.drawable.d29,
            R.drawable.d30,
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