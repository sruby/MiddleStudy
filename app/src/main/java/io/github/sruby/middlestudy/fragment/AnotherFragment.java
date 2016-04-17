package io.github.sruby.middlestudy.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.sruby.middlestudy.R;

/**
 *被加载的另外一个fragment
 *@author create at 16/4/18 00:24
 */
public class AnotherFragment extends Fragment implements View.OnClickListener
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_another, container, false);

        view.findViewById(R.id.btnBackToFirstFrag).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnBackToFirstFrag:
                //执行后退操作,后退到上一个fragment
                getFragmentManager().popBackStack();
        }
    }
}
