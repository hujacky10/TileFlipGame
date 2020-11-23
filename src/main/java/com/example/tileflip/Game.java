package com.example.tileflip;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DrawableUtils;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.view.View.OnTouchListener;

public class Game extends AppCompatActivity {
    ImageButton temp;
    boolean flipped = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameboard);
        ImageButton b1 = (ImageButton) findViewById(R.id.button1);
        ImageButton b2 = (ImageButton) findViewById(R.id.button2);
        ImageButton b3 = (ImageButton) findViewById(R.id.button3);
        ImageButton b4 = (ImageButton) findViewById(R.id.button4);
        ImageButton b5 = (ImageButton) findViewById(R.id.button5);
        ImageButton b6 = (ImageButton) findViewById(R.id.button6);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
    }

    public void select(View v){
        temp = (ImageButton) findViewById(v.getId());
        //Initial Case
        v.setAlpha((float)0.1);
        ImageButton b1 = (ImageButton) findViewById(R.id.button1);
        ImageButton b2 = (ImageButton) findViewById(R.id.button2);
        ImageButton b3 = (ImageButton) findViewById(R.id.button3);
        ImageButton b4 = (ImageButton) findViewById(R.id.button4);
        ImageButton b5 = (ImageButton) findViewById(R.id.button5);
        ImageButton b6 = (ImageButton) findViewById(R.id.button6);
        ImageButton t1 = (ImageButton) findViewById(R.id.token1);
        ImageButton t2 = (ImageButton) findViewById(R.id.token2);
        ImageButton t3 = (ImageButton) findViewById(R.id.token3);
        ImageButton t4 = (ImageButton) findViewById(R.id.token4);
        ImageButton t5 = (ImageButton) findViewById(R.id.token5);
        ImageButton t6 = (ImageButton) findViewById(R.id.token6);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        temp.setEnabled(false);
        t1.setEnabled(false);
        t2.setEnabled(false);
        t3.setEnabled(false);
        t4.setEnabled(false);
        t5.setEnabled(false);
        t6.setEnabled(false);

    }

    public void table(View v){
        ImageButton b = (ImageButton) findViewById(v.getId());
        ImageButton b1 = (ImageButton) findViewById(R.id.button1);
        ImageButton b2 = (ImageButton) findViewById(R.id.button2);
        ImageButton b3 = (ImageButton) findViewById(R.id.button3);
        ImageButton b4 = (ImageButton) findViewById(R.id.button4);
        ImageButton b5 = (ImageButton) findViewById(R.id.button5);
        ImageButton b6 = (ImageButton) findViewById(R.id.button6);
        if (flipped == true){
            b.setAlpha(0);
            flipped = false;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            return;
        }
        //Initial Case
        b.setImageDrawable(temp.getDrawable());

        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b.setEnabled(false);
        ImageButton t1 = (ImageButton) findViewById(R.id.token1);
        ImageButton t2 = (ImageButton) findViewById(R.id.token2);
        ImageButton t3 = (ImageButton) findViewById(R.id.token3);
        ImageButton t4 = (ImageButton) findViewById(R.id.token4);
        ImageButton t5 = (ImageButton) findViewById(R.id.token5);
        ImageButton t6 = (ImageButton) findViewById(R.id.token6);
        if(t1.getAlpha() != 0.1){
            t1.setEnabled(true);
        }

        if(t2.getAlpha() != 0.1){
            t2.setEnabled(true);
        }

        if(t3.getAlpha() != 0.1){
            t3.setEnabled(true);
        }

        if(t4.getAlpha() != 0.1){
            t4.setEnabled(true);
        }

        if(t5.getAlpha() != 0.1){
            t5.setEnabled(true);
        }

        if(t6.getAlpha() != 0.1){
            t6.setEnabled(true);
        }
    }

    public void flip(View v){
        flipped = true;
        ImageButton b1 = (ImageButton) findViewById(R.id.button1);
        ImageButton b2 = (ImageButton) findViewById(R.id.button2);
        ImageButton b3 = (ImageButton) findViewById(R.id.button3);
        ImageButton b4 = (ImageButton) findViewById(R.id.button4);
        ImageButton b5 = (ImageButton) findViewById(R.id.button5);
        ImageButton b6 = (ImageButton) findViewById(R.id.button6);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
    }

    public void peek(View v){

    }

    public void swap(View v){

    }

}
