package com.iqra.iqra;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class IqroActivity extends AppCompatActivity {
    ImageButton iqro1,iqro2,iqro3,iqro4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro);

        final MediaPlayer button = MediaPlayer.create(this, R.raw.button); //suara


        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anime_scale);// untuk animasi
        iqro1 = (ImageButton) findViewById(R.id.btnIqro1);
        iqro2 = (ImageButton) findViewById(R.id.btnIqro2);
        iqro3 = (ImageButton) findViewById(R.id.btnIqro3);
        iqro4 = (ImageButton) findViewById(R.id.btnIqro4);

        iqro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.start();
                Intent intent = new Intent(IqroActivity.this, Iqro1Activity.class);
                startActivity(intent);
            }
        });

        iqro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.start();
                Intent intent = new Intent(IqroActivity.this, Iqro2Activity.class);
                startActivity(intent);
            }
        });

        iqro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.start();
                Intent intent = new Intent(IqroActivity.this, Iqro3Activity.class);
                startActivity(intent);
            }
        });

        iqro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.start();
                Intent intent = new Intent(IqroActivity.this, Iqro4Activity.class);
                startActivity(intent);
            }
        });
    }
}
