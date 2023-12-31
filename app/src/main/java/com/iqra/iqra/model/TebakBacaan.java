package com.iqra.iqra.model;
import com.iqra.iqra.R;
import java.util.Random;

/**
 * Created by Ujang Wahyu on 11/04/2017.
 */

public class TebakBacaan {
    private int listhuruf[] = {
            R.drawable.b_hijaiyah_ain,
            R.drawable.b_hijaiyah_ba,
            R.drawable.b_hijaiyah_ta,
            R.drawable.b_hijaiyah_haa,
            R.drawable.b_hijaiyah_jim,
            R.drawable.b_hijaiyah_tha,
            R.drawable.b_hijaiyah_wau,
            R.drawable.b_hijaiyah_tsa,
            R.drawable.b_hijaiyah_kaf,
            R.drawable.b_hijaiyah_lam,
            R.drawable.b_hijaiyah_mim,
            R.drawable.b_hijaiyah_nun,
            R.drawable.b_hijaiyah_ha,
            R.drawable.b_hijaiyah_alif,
            R.drawable.b_hijaiyah_ra,
            R.drawable.b_hijaiyah_zai,
            R.drawable.b_hijaiyah_ya,
            R.drawable.b_hijaiyah_kha,
            R.drawable.b_hijaiyah_dal,
            R.drawable.b_hijaiyah_sad
    };

    private int listhuruf2[] = {
            R.drawable.aa_ain,
            R.drawable.aa_ba,
            R.drawable.aa_ta,
            R.drawable.aa_haa,
            R.drawable.aa_ja,
            R.drawable.aa_tho,
            R.drawable.aa_wau,
            R.drawable.aa_tsa,
            R.drawable.aa_kof,
            R.drawable.aa_lam,
            R.drawable.aa_mim,
            R.drawable.aa_nun,
            R.drawable.aa_ha,
            R.drawable.aa_alif,
            R.drawable.aa_ro,
            R.drawable.aa_za,
            R.drawable.aa_ya,
            R.drawable.aa_kha,
            R.drawable.aa_da,
            R.drawable.aa_sod
    };

    public int[] getlist(){
        return listhuruf;
    }
    public int[] getlist2(){
        return listhuruf2;
    }

    public int getrandomhuruf(){
        int rnd = new Random().nextInt(listhuruf.length);
        return rnd;
    }

    public int getimagesoal(int i){
        return listhuruf[i];
    }

    public int getimagejwbn(int i){
        return listhuruf2[i];
    }

    public int getjumlah(){
        return listhuruf.length;
    }
    public int getjumlah2(){
        return listhuruf2.length;
    }
}