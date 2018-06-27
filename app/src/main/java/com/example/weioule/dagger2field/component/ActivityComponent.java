package com.example.weioule.dagger2field.component;

import android.app.Activity;

import com.example.weioule.dagger2field.module.AcvtivityModule;
import com.example.weioule.dagger2field.scope.PerActivity;
import com.example.weioule.dagger2field.utils.ToastUtil;

import dagger.Component;


/**
 * author weioule
 * Create on 2018/6/25.
 */

@PerActivity
@Component(modules = AcvtivityModule.class, dependencies = AppComponent.class)
public interface ActivityComponent {

    Activity getActivity();

    ToastUtil getToastUtil();

}
