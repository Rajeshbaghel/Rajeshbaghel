package com.example.progressline;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    ProgressBar progressBar;
    TextView textView;
    int i = 0;
    ScrollView scrollContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textprogress);
        progressBar = findViewById(R.id.progress);
        scrollContent = findViewById(R.id.scrollContent);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                if (i <= 100) {
                    textView.setText("" + i);
                    progressBar.setMax(100);
                    progressBar.setProgress(i++);

                    handler.postDelayed(this, 100);

                } else {
                    handler.removeCallbacks(this);
                }
            }
        }, 100);
    }
}