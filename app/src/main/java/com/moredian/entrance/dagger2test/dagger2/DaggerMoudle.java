package com.moredian.entrance.dagger2test.dagger2;

import com.moredian.entrance.dagger2test.beans.C;

import dagger.Module;
import dagger.Provides;

/**
 * description ：
 * author : scy
 * email : 1797484636@qq.com
 * date : 2019/10/14 10:18
 */
@Module
public class DaggerMoudle {

    @Provides
    public C provideC(){
        return new C();
    }
}
