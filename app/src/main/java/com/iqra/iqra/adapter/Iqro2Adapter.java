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

public class Iqro2Adapter extends PagerAdapter {
    Context mContext;

    public Iqro2Adapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return sliderImagesId.length;
    }

    private int[] sliderImagesId = new int[]{
            R.drawable.b1, R.drawable.b2, R.drawable.b3,
            R.drawable.b4, R.drawable.b5, R.drawable.b6,
            R.drawable.b7, R.drawable.b8, R.drawable.b9,
            R.drawable.b10, R.drawable.b11, R.drawable.b12,
            R.drawable.b13, R.drawable.b14, R.drawable.b15,
            R.drawable.b16, R.drawable.b17, R.drawable.b18,
            R.drawable.b19, R.drawable.b20, R.drawable.b21,
            R.drawable.b22, R.drawable.b22, R.drawable.b23,
            R.drawable.b24, R.drawable.b25, R.drawable.b26,
            R.drawable.b27, R.drawable.b28, R.drawable.b29,
            R.drawable.b30,
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