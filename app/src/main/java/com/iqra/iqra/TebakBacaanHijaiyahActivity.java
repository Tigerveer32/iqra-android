package com.iqra.iqra;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.iqra.iqra.model.TebakBacaan;

import java.util.Random;

public class TebakBacaanHijaiyahActivity extends AppCompatActivity {

    ImageButton pilih;
    ImageButton jw1,jw2,jw3;
    ImageView soal;
    int s,s1,j1,j2,j3;
    int skor=0;
    TebakBacaan hijayah = new TebakBacaan();
    int n = hijayah.getjumlah();

    boolean jawabanbenar = true;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_bacaan_hijaiyah);

        soal = (ImageView) findViewById(R.id.soal);
        jw1 = (ImageButton)findViewById(R.id.jawaban1);
        jw2 = (ImageButton)findViewById(R.id.jawaban2);
        jw3 = (ImageButton)findViewById(R.id.jawaban3);

        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.button);
        newlevel();

        jw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j1 ==s);
            }
        });

        jw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j2 ==s);
            }
        });

        jw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j3 ==s);
            }
        });
    }

    public void newlevel(){
        s = hijayah.getrandomhuruf();
        s1 = hijayah.getrandomhuruf();
        int i = new Random().nextInt(3) + 1;

        if(i==1){
            j1 = s;
        }
        else{
            j1 = hijayah.getrandomhuruf();
        }

        if(i ==2){
            j2 = s;
        }
        else {
            j2 = hijayah.getrandomhuruf();
        }
        if(i ==3){
            j3 = s;
        }
        else{
            j3 = hijayah.getrandomhuruf();
        }

        soal.setBackgroundResource(hijayah.getimagesoal(s));
        jw1.setBackgroundResource(hijayah.getimagejwbn(j1));
        jw2.setBackgroundResource(hijayah.getimagejwbn(j2));
        jw3.setBackgroundResource(hijayah.getimagejwbn(j3));
    }

    public void isCorrect(boolean input){
        TextView tampilSkor =(TextView) findViewById(R.id.skor);

        if(input && i <n){
            MediaPlayer benar = MediaPlayer.create(getBaseContext(),R.raw.benar);
            Animation animasiBenar = AnimationUtils.loadAnimation(this,R.anim.anime_scale);
            soal.startAnimation(animasiBenar);
            skor +=10;
            benar.start();
            newlevel();
            i++;
        }else{
            MediaPlayer salah = MediaPlayer.create(getBaseContext(),R.raw.salah);
            Animation animasiSalah = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
            soal.startAnimation(animasiSalah);
            skor -=5;
            salah.start();
        }

        tampilSkor.setText("SKOR : "+ skor);
    }
}