package com.iqra.iqra;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class LatihanActivity extends AppCompatActivity {
    ImageButton latihan1,latihan2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        latihan1 = (ImageButton) findViewById(R.id.tebak_hijaiyah);
        latihan2 = (ImageButton) findViewById(R.id.tebak_bacaan);

        final MediaPlayer button = MediaPlayer.create(this,R.raw.button);
        latihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.start();
                Intent intent = new Intent(LatihanActivity.this, TebakHijaiyahActivity.class);
                startActivity(intent);
            }
        });

        latihan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.start();
                Intent intent = new Intent(LatihanActivity.this, TebakBacaanHijaiyahActivity.class);
                startActivity(intent);
            }
        });
    }
}
