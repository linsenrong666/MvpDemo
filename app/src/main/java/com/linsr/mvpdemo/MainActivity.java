package com.linsr.mvpdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.linsr.mvpdemo.service.MyIntentService;
import com.linsr.mvpdemo.service.MyService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("===", "===MainActivity curr[" + Thread.currentThread().getName() + "]");

        startActivity(new Intent(this, com.linsr.mvpdemo.main.MainActivity.class));
        startService(new Intent(this, MyIntentService.class));
        startService(new Intent(this, MyService.class));
    }

}