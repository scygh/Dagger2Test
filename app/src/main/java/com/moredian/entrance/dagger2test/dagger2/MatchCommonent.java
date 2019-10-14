package com.moredian.entrance.dagger2test.dagger2;

import com.moredian.entrance.dagger2test.MainActivity;

import dagger.Component;

/**
 * description ：
 * author : scy
 * email : 1797484636@qq.com
 * date : 2019/10/14 10:19
 */
@Component(modules = {DaggerMoudle.class})
public interface MatchCommonent {
    void mainA(MainActivity activity);
}
