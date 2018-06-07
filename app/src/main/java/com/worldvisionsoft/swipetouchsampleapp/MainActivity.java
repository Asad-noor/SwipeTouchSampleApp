package com.worldvisionsoft.swipetouchsampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Try swipe from center dot");
        }

        RelativeLayout root_view = findViewById(R.id.root_view);

        root_view.setOnTouchListener(new OnSwipeTouchListener(this) {
            @Override
            public void onSwipeLeft() {
                showToast("Left swipe happened!");
            }

            @Override
            public void onSwipeRight() {
                showToast("Right swipe happened!");
            }

            @Override
            public void onSwipeTop() {
                showToast("Top swipe happened!");
            }

            @Override
            public void onSwipeBottom() {
                showToast("Bottom swipe happened!");
            }
        });
    }

    private void showToast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}
