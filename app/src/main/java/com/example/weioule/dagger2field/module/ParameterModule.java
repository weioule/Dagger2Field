package com.example.weioule.dagger2field.module;

import com.example.weioule.dagger2field.MvpView;

import dagger.Module;
import dagger.Provides;

/**
 * author weioule
 * Create on 2018/6/27.
 */

@Module
public class ParameterModule {

    private MvpView mMvpView;

    public ParameterModule(MvpView mvpView) {
        mMvpView = mvpView;
    }

    @Provides
    public MvpView getMvpView() {
        return mMvpView;
    }
}
