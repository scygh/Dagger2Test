package com.moredian.entrance.dagger2test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.moredian.entrance.dagger2test.beans.A;
import com.moredian.entrance.dagger2test.dagger2.DaggerMatchCommonent;
import com.moredian.entrance.dagger2test.dagger2.MatchCommonent;

import javax.inject.Inject;

import dagger.Component;

public class MainActivity extends AppCompatActivity {

    @Inject
    A a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MatchCommonent commonent = DaggerMatchCommonent.builder().build();
        commonent.mainA(this);
        a.xxoo();
        a.appointment();
    }
}
