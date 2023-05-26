package com.iqra.iqra;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class HijaiyahActivity extends AppCompatActivity {

    ImageButton TampilGambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anime_scale);

        //Untuk Menambahkan Button Suara
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.alif); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.ba);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.ta);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.sa);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.jim);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.ha);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.kho);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.dal);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.dzal);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.ro);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.dza);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.sin);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.syin);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.shad);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.dod);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.to);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.dho);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.ain);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.gin);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.fa);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.kof);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.kaf);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.lam);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.min);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.nun);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.wawu);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.haa);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.ya);


        final ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.btn_alif);
        final ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.btn_ba);
        final ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.btn_ta);
        final ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.btn_tsa);
        final ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.btn_ja);
        final ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.btn_ha);
        final ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.btn_kha);
        final ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.btn_da);
        final ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.btn_dza);
        final ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.btn_ro);
        final ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.btn_za);
        final ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.btn_sin);
        final ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.btn_syin);
        final ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.btn_sod);
        final ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.btn_dho);
        final ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.btn_tho);
        final ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.btn_do);
        final ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.btn_ain);
        final ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.btn_ghain);
        final ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.btn_fa);
        final ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.btn_kop);
        final ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.btn_ka);
        final ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.btn_lam);
        final ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.btn_mim);
        final ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.btn_nun);
        final ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.btn_wau);
        final ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.btn_haa);
        final ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.btn_ya);

        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara2.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara3.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara4.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara5.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara6.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara7.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara8.startAnimation(animScale);
                SuaraDal.start();
            }
        });
        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara9.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara10.startAnimation(animScale);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara11.startAnimation(animScale);
                SuaraJa.start();
            }
        });
        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara12.startAnimation(animScale);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara13.startAnimation(animScale);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara14.startAnimation(animScale);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara15.startAnimation(animScale);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara16.startAnimation(animScale);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara17.startAnimation(animScale);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara18.startAnimation(animScale);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara19.startAnimation(animScale);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara20.startAnimation(animScale);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara21.startAnimation(animScale);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara22.startAnimation(animScale);
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara23.startAnimation(animScale);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara24.startAnimation(animScale);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara25.startAnimation(animScale);
                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara26.startAnimation(animScale);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara27.startAnimation(animScale);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ButtonSuara28.startAnimation(animScale);
                SuaraYa.start();
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();

    }

}
