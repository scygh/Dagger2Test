package com.moredian.entrance.dagger2test.beans;

import android.util.Log;

import javax.inject.Inject;

/**
 * description ：
 * author : scy
 * email : 1797484636@qq.com
 * date : 2019/10/14 10:12
 */
public class A {

    private static final String TAG = "dagger";
    @Inject
    B b;
    @Inject
    C c;

    @Inject
    public A() {
    }

    public void xxoo() {
        Log.d(TAG, "xxoo:翠花，关灯了 ");
        b.birthSon();
    }

    public void  appointment() {
        Log.d(TAG, "晚上一起去看月亮聊聊");
        c.Gun();
    }
}
