package com.example.povio.todo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    protected int _splashTime = 3000;

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
