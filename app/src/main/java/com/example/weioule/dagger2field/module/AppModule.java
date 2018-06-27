package com.example.weioule.dagger2field.module;

import android.content.Context;

import com.example.weioule.dagger2field.utils.ToastUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


/**
 * author weioule
 * Create on 2018/6/25.
 */

@Module
public class AppModule {

    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public Context getContext() {
        return context;
    }

    @Singleton
    @Provides
    public ToastUtil getToastUtil(Context context) {
        return new ToastUtil(context);
    }


}
