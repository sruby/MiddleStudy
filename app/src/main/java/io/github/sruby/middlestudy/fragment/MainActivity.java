package io.github.sruby.middlestudy.fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.sruby.middlestudy.R;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 显示启动另外一个aty
         */
        startActivity(new Intent(MainActivity.this,FragmentAty.class));
    }
}
