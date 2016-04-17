package io.github.sruby.middlestudy.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.github.sruby.middlestudy.R;

public class FragmentAty extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_aty);

//        getFragmentManager().beginTransaction().add(R.id.fragmentAty,new FirstFragment());

        /**
         * 第一个参数是aty中的布局id
         * 第二个参数是自定义Fragment类的实例
         */
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentAty,new FirstFragment()).commit();
    }
}
