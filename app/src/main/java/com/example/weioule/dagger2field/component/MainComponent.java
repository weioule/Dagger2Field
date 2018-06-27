package com.example.weioule.dagger2field.component;


import com.example.weioule.dagger2field.act.MainActivity;
import com.example.weioule.dagger2field.module.MainModule;
import com.example.weioule.dagger2field.scope.MainActivityScope;

import dagger.Component;

/**
 * author weioule
 * Create on 2018/6/25.
 */

@MainActivityScope
@Component(modules = MainModule.class, dependencies = ActivityComponent.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);

    MainFragmentComponent getMainFragmentComponent();

}
