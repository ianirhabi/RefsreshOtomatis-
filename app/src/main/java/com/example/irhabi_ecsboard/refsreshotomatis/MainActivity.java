package com.example.irhabi_ecsboard.refsreshotomatis;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Handler mHandler;
Runnable refresh ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mHandler = new Handler();
        this.mHandler.postDelayed(m_Runnable, 5000);
    }

    private final Runnable m_Runnable = new Runnable(){
        public void run(){
            Toast.makeText(MainActivity.this, "di dalam refresh", Toast.LENGTH_SHORT).show();
            MainActivity.this.mHandler.postDelayed(m_Runnable, 5000);
        }
    };
}
