package com.iqra.iqra;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnHijaiyah,btnIqro,btnLatihan,btnAboutme,btnKeluar;
    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        final MediaPlayer button = MediaPlayer.create(this, R.raw.button);

        btnHijaiyah = (ImageButton) findViewById(R.id.btnHijaiyah);
        btnIqro =(ImageButton)findViewById(R.id.btnIqro);
        btnLatihan = (ImageButton)findViewById(R.id.btnLatihan);
        btnAboutme = (ImageButton)findViewById(R.id.btnAbout);
        btnKeluar = (ImageButton)findViewById(R.id.btnKeluar);


        btnHijaiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.start();
                btnHijaiyah.startAnimation(animScale);
                Intent pindah = new Intent(MainActivity.this, HijaiyahActivity.class);
                startActivity(pindah);
            }
        });
        btnIqro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.start();
                btnIqro.startAnimation(animScale);
                Intent pindah = new Intent(MainActivity.this, IqroActivity.class);
                startActivity(pindah);
            }
        });
        btnLatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.start();
                btnLatihan.startAnimation(animScale);
                Intent pindah = new Intent(MainActivity.this, LatihanActivity.class);
                startActivity(pindah);
            }
        });
        btnAboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.start();
                btnAboutme.startAnimation(animScale);
                btnHijaiyah.startAnimation(animScale);
                Intent pindah = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(pindah);
            }
        });
        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.start();
                finish();
            }
        });
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.start();
                Button.startAnimation(animScale);
                Intent pindah = new Intent(MainActivity.this,tambahmahasiswaActivity.class);
                startActivity(pindah);
            }
        });
    }
}
