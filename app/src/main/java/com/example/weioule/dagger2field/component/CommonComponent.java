package com.example.weioule.dagger2field.component;

import com.example.weioule.dagger2field.module.ParameterModule;

import dagger.Component;

/**
 * author weioule
 * Create on 2018/6/27.
 */
@Component()
public interface CommonComponent {
    ParameterComponent addSub(ParameterModule parameterModule);
}
