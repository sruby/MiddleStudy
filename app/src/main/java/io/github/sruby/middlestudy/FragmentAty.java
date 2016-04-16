package io.github.sruby.middlestudy;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

public class FragmentAty extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_aty);

//        getFragmentManager().beginTransaction().add(R.id.fragmentAty,new FirstFragment());
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentAty,new FirstFragment()).commit();
    }
}
