package io.github.sruby.middlestudy.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.sruby.middlestudy.R;

/**
 * 自动生成的fragment,需要先去掉onCreateView之外的东西.
 */
public class FirstFragment extends Fragment implements View.OnClickListener
{
    /**
     * 生命周期:创建
     * @param savedInstanceState
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        System.out.println("fristFragment create");
        super.onCreate(savedInstanceState);
    }

    /**
     * 生命周期:创建布局
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        System.out.println("FirstFragment onCreateView");
        View rootView = inflater.inflate(R.layout.fragment_first, container, false);

        /**
         * 不通过点击事件来跳转fragment中加载另外一个fragment
         * TODO by sruby 是不是进入一个死循环了?实际上是回退后又立马跳到another
         * 具体原因待了解?
         *
         */
//        getFragmentManager().beginTransaction()
//                //添加到后退栈中
//                .addToBackStack(null)
//                .replace(R.id.fragmentAty, new AnotherFragment())
//                .commit();

        /**
         * 通过点击事件来跳转
         */
        rootView.findViewById(R.id.btnJumpAnotherFrag).setOnClickListener(this);
        rootView.findViewById(R.id.btnStartSlideAty).setOnClickListener(this);


        return rootView;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnJumpAnotherFrag:
                getFragmentManager().beginTransaction()
                        //添加到后退栈中
                        .addToBackStack(null)
                        .replace(R.id.fragmentAty, new AnotherFragment())
                        .commit();
                break;
            case R.id.btnStartSlideAty:
                /**
                 * 启动侧边栏aty
                 */
                startActivity(new Intent(getActivity(),SlideAty.class));
        }
    }

    /**
     * 跳到另外一个fragment会执行.
     * 回退到aty也会执行,但是跟跳到fragment不同的是会执行onDestroy
     */
    @Override
    public void onPause()
    {
        System.out.println("FirstFragment pause");
        super.onPause();
    }

    /**
     * 生命周期:界面销毁
     */
    @Override
    public void onDestroyView()
    {
        System.out.println("FirstFragment onDestroyView");
        super.onDestroyView();
    }

    /**
     *生命周期:销毁
     */
    @Override
    public void onDestroy()
    {
        System.out.println("FirstFragment onDestroy");
        super.onDestroy();
    }
}
