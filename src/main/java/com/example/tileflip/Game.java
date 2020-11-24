package com.example.tileflip;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.os.SystemClock;
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

import java.sql.Time;

public class Game extends AppCompatActivity {
    ImageButton temp, s1, s2;
    boolean selected = false;
    boolean flipped = false;
    boolean peeked = false;
    boolean swapped = false;
    int count = 1;
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
        Button f = (Button) findViewById(R.id.fl);
        Button p = (Button) findViewById(R.id.pe);
        Button s = (Button) findViewById(R.id.sw);
        f.setEnabled(false);
        p.setEnabled(false);
        s.setEnabled(false);
    }

    /**
     * To control the token symbol and place them onto table
     * @param v
     */
    public void select(View v){
        temp = (ImageButton) findViewById(v.getId());
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
        if (b1.getDrawable() == null)
            b1.setEnabled(true);
        if (b2.getDrawable() == null)
            b2.setEnabled(true);
        if (b3.getDrawable() == null)
            b3.setEnabled(true);
        if (b4.getDrawable() == null)
            b4.setEnabled(true);
        if (b5.getDrawable() == null)
            b5.setEnabled(true);
        if (b6.getDrawable() == null)
            b6.setEnabled(true);

        t1.setEnabled(false);
        t2.setEnabled(false);
        t3.setEnabled(false);
        t4.setEnabled(false);
        t5.setEnabled(false);
        t6.setEnabled(false);

        Button f = (Button) findViewById(R.id.fl);
        Button p = (Button) findViewById(R.id.pe);
        Button s = (Button) findViewById(R.id.sw);
        f.setEnabled(false);
        p.setEnabled(false);
        s.setEnabled(false);

        selected = true;

    }

    /**
     * This is where the game is actually going on here.
     * It controls the gameboard.
     * @param v
     */
    public void table(View v){
        ImageButton b = (ImageButton) findViewById(v.getId());
        ImageButton b1 = (ImageButton) findViewById(R.id.button1);
        ImageButton b2 = (ImageButton) findViewById(R.id.button2);
        ImageButton b3 = (ImageButton) findViewById(R.id.button3);
        ImageButton b4 = (ImageButton) findViewById(R.id.button4);
        ImageButton b5 = (ImageButton) findViewById(R.id.button5);
        ImageButton b6 = (ImageButton) findViewById(R.id.button6);

        if (selected){

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

            Button f = (Button) findViewById(R.id.fl);
            Button p = (Button) findViewById(R.id.pe);
            Button s = (Button) findViewById(R.id.sw);
            f.setEnabled(true);
            p.setEnabled(true);
            s.setEnabled(true);
            selected = false;
        }

        if (flipped){
            b.setAlpha((float)0);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
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
            Button f = (Button) findViewById(R.id.fl);
            Button p = (Button) findViewById(R.id.pe);
            Button s = (Button) findViewById(R.id.sw);
            f.setEnabled(true);
            p.setEnabled(true);
            s.setEnabled(true);
            flipped = false;
        }

        if (peeked){
            b.setAlpha((float)0.8);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
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
            Button f = (Button) findViewById(R.id.fl);
            Button p = (Button) findViewById(R.id.pe);
            Button s = (Button) findViewById(R.id.sw);
            f.setEnabled(true);
            p.setEnabled(true);
            s.setEnabled(true);
            peeked = false;
        }

        if (swapped){
            if (count == 2){
                s2 = (ImageButton) findViewById(v.getId());
                Drawable d = s1.getDrawable();
                float a = s1.getAlpha();
                s1.setImageDrawable(s2.getDrawable());
                s1.setAlpha(s2.getAlpha());
                s2.setImageDrawable(d);
                s2.setAlpha(a);
                swapped = false;
                count = 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
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
                Button f = (Button) findViewById(R.id.fl);
                Button p = (Button) findViewById(R.id.pe);
                Button s = (Button) findViewById(R.id.sw);
                f.setEnabled(true);
                p.setEnabled(true);
                s.setEnabled(true);
                return;
            }

            count = count + 1;
            s1 = (ImageButton) findViewById(v.getId());
        }

    }

    /**
     * Flip the symbol and make it hidden
     * @param v
     */
    public void flip(View v){
        flipped = true;
        ImageButton b1 = (ImageButton) findViewById(R.id.button1);
        ImageButton b2 = (ImageButton) findViewById(R.id.button2);
        ImageButton b3 = (ImageButton) findViewById(R.id.button3);
        ImageButton b4 = (ImageButton) findViewById(R.id.button4);
        ImageButton b5 = (ImageButton) findViewById(R.id.button5);
        ImageButton b6 = (ImageButton) findViewById(R.id.button6);
        if (b1.getDrawable() != null)
            b1.setEnabled(true);
        if (b2.getDrawable() != null)
            b2.setEnabled(true);
        if (b3.getDrawable() != null)
            b3.setEnabled(true);
        if (b4.getDrawable() != null)
            b4.setEnabled(true);
        if (b5.getDrawable() != null)
            b5.setEnabled(true);
        if (b6.getDrawable() != null)
            b6.setEnabled(true);
        ImageButton t1 = (ImageButton) findViewById(R.id.token1);
        ImageButton t2 = (ImageButton) findViewById(R.id.token2);
        ImageButton t3 = (ImageButton) findViewById(R.id.token3);
        ImageButton t4 = (ImageButton) findViewById(R.id.token4);
        ImageButton t5 = (ImageButton) findViewById(R.id.token5);
        ImageButton t6 = (ImageButton) findViewById(R.id.token6);
        t1.setEnabled(false);
        t2.setEnabled(false);
        t3.setEnabled(false);
        t4.setEnabled(false);
        t5.setEnabled(false);
        t6.setEnabled(false);
        Button f = (Button) findViewById(R.id.fl);
        Button p = (Button) findViewById(R.id.pe);
        Button s = (Button) findViewById(R.id.sw);
        f.setEnabled(false);
        p.setEnabled(false);
        s.setEnabled(false);
    }

    /**
     * Peek through the hidden card
     * @param v
     */
    public void peek(View v){
        peeked = true;
        ImageButton b1 = (ImageButton) findViewById(R.id.button1);
        ImageButton b2 = (ImageButton) findViewById(R.id.button2);
        ImageButton b3 = (ImageButton) findViewById(R.id.button3);
        ImageButton b4 = (ImageButton) findViewById(R.id.button4);
        ImageButton b5 = (ImageButton) findViewById(R.id.button5);
        ImageButton b6 = (ImageButton) findViewById(R.id.button6);
        if (b1.getDrawable() != null)
            b1.setEnabled(true);
        if (b2.getDrawable() != null)
            b2.setEnabled(true);
        if (b3.getDrawable() != null)
            b3.setEnabled(true);
        if (b4.getDrawable() != null)
            b4.setEnabled(true);
        if (b5.getDrawable() != null)
            b5.setEnabled(true);
        if (b6.getDrawable() != null)
            b6.setEnabled(true);
        ImageButton t1 = (ImageButton) findViewById(R.id.token1);
        ImageButton t2 = (ImageButton) findViewById(R.id.token2);
        ImageButton t3 = (ImageButton) findViewById(R.id.token3);
        ImageButton t4 = (ImageButton) findViewById(R.id.token4);
        ImageButton t5 = (ImageButton) findViewById(R.id.token5);
        ImageButton t6 = (ImageButton) findViewById(R.id.token6);
        t1.setEnabled(false);
        t2.setEnabled(false);
        t3.setEnabled(false);
        t4.setEnabled(false);
        t5.setEnabled(false);
        t6.setEnabled(false);
        Button f = (Button) findViewById(R.id.fl);
        Button p = (Button) findViewById(R.id.pe);
        Button s = (Button) findViewById(R.id.sw);
        f.setEnabled(false);
        p.setEnabled(false);
        s.setEnabled(false);
    }

    /**
     * Swap the cards
     * @param v
     */
    public void swap(View v){
        swapped = true;
        Button f = (Button) findViewById(R.id.fl);
        Button p = (Button) findViewById(R.id.pe);
        Button s = (Button) findViewById(R.id.sw);
        f.setEnabled(false);
        p.setEnabled(false);
        s.setEnabled(false);
        ImageButton b1 = (ImageButton) findViewById(R.id.button1);
        ImageButton b2 = (ImageButton) findViewById(R.id.button2);
        ImageButton b3 = (ImageButton) findViewById(R.id.button3);
        ImageButton b4 = (ImageButton) findViewById(R.id.button4);
        ImageButton b5 = (ImageButton) findViewById(R.id.button5);
        ImageButton b6 = (ImageButton) findViewById(R.id.button6);
        if (b1.getDrawable() != null)
            b1.setEnabled(true);
        if (b2.getDrawable() != null)
            b2.setEnabled(true);
        if (b3.getDrawable() != null)
            b3.setEnabled(true);
        if (b4.getDrawable() != null)
            b4.setEnabled(true);
        if (b5.getDrawable() != null)
            b5.setEnabled(true);
        if (b6.getDrawable() != null)
            b6.setEnabled(true);
        ImageButton t1 = (ImageButton) findViewById(R.id.token1);
        ImageButton t2 = (ImageButton) findViewById(R.id.token2);
        ImageButton t3 = (ImageButton) findViewById(R.id.token3);
        ImageButton t4 = (ImageButton) findViewById(R.id.token4);
        ImageButton t5 = (ImageButton) findViewById(R.id.token5);
        ImageButton t6 = (ImageButton) findViewById(R.id.token6);
        t1.setEnabled(false);
        t2.setEnabled(false);
        t3.setEnabled(false);
        t4.setEnabled(false);
        t5.setEnabled(false);
        t6.setEnabled(false);
    }

}
