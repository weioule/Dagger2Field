package com.example.weioule.dagger2field.component;

import android.content.Context;

import com.example.weioule.dagger2field.module.AppModule;
import com.example.weioule.dagger2field.utils.ToastUtil;

import javax.inject.Singleton;

import dagger.Component;


/**
 * author weioule
 * Create on 2018/6/25.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    Context getContecxt();

    ToastUtil getToastUtil();
}
