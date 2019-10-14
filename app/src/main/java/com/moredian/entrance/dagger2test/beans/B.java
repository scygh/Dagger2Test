package com.moredian.entrance.dagger2test.beans;

import android.util.Log;

import javax.inject.Inject;

/**
 * description ：
 * author : scy
 * email : 1797484636@qq.com
 * date : 2019/10/14 10:12
 */
public class B {

    @Inject
    public B() {
    }

    public void birthSon() {
        Log.d("dagger", "my son brith");
    }
}
