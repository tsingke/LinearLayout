package com.example.linearlayout;//说明当前app存放的位置（目录层级）

import android.support.v7.app.AppCompatActivity;//引入其他对类（类都在包下面）
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i("执行方法", "onStart: ");
    }
}
