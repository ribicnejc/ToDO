package com.example.povio.todo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Splash extends AppCompatActivity {
    protected int _splashTime = 1500;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        new Thread() {

            @Override
            public void run() {
                synchronized (this) {
                    try {
                        wait(_splashTime);
                    } catch (InterruptedException e) {
                        Log.d("Error", "error splash");
                    } finally {
                        finish();
                        Intent intent = new Intent(getBaseContext(), ScrollingActivity.class);
                        startActivity(intent);
                    }
                }
            }

        }.start();
    }
}
