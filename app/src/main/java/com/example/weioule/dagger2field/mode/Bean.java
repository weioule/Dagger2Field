package com.example.weioule.dagger2field.mode;

import com.example.weioule.dagger2field.MvpView;

import javax.inject.Inject;

/**
 * author weioule
 * Create on 2018/6/27.
 */
public class Bean {

    @Inject
    public Bean(MvpView mvpView) {
    }

    @Override
    public String toString() {
        return "我是需要MvpView实例的数据bean";
    }
}
