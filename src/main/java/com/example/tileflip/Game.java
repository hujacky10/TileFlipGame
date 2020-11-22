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
        v.setAlpha((float)0.1);
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
        temp.setEnabled(false);
    }

    public void table(View v){
        ImageButton b = (ImageButton) findViewById(v.getId());
        b.setImageDrawable(temp.getDrawable());
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
        b.setEnabled(false);
    }


}
