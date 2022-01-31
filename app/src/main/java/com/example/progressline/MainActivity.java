package com.example.progressline;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import
        android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.graphics.Color;
import android.graphics.PorterDuff;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressbar;
    int intValue = 0;
    Handler handler = new Handler();
    RelativeLayout relativelayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativelayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        progressbar = new ProgressBar(MainActivity.this, null);

        relativelayout.addView(progressbar);
        new Thread(new Runnable() {
            @Override
            public void run() {
               while (intValue < 1) {
                    intValue++;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressbar.setProgress(intValue);
                        }
                    });
                    try {
                        Thread.sleep(1000000000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}


