package com.example.progressline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;

public class MainActivity3 extends AppCompatActivity {
    ProgressBar progressBar;
    ScrollView scrollContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        scrollContent = findViewById(R.id.scrollContent);

        for (int i = 0; i < 11; i++) {












            progressBar = new ProgressBar(this, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(30, 30, 30, 30);
            progressBar.setLayoutParams(layoutParams);
            progressBar.setIndeterminate(true);
            LinearLayout linearLayout = findViewById(R.id.rootContainer);
            if (linearLayout != null) {
                linearLayout.addView(progressBar);
            }
        }
    }
}