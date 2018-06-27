package com.example.weioule.dagger2field.component;

import com.example.weioule.dagger2field.act.ParameterActivity;
import com.example.weioule.dagger2field.module.ParameterModule;

import dagger.Subcomponent;

/**
 * author weioule
 * Create on 2018/6/27.
 */
@Subcomponent(modules = ParameterModule.class)
public interface ParameterComponent {
    void inject(ParameterActivity parameterActivity);
}
