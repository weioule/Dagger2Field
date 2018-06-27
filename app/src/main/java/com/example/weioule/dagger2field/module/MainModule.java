package com.example.weioule.dagger2field.module;


import com.example.weioule.dagger2field.mode.UserRepostory;

import dagger.Module;
import dagger.Provides;

/**
 * author weioule
 * Create on 2018/6/25.
 */

@Module
public class MainModule {
    @Provides
    public UserRepostory getUserRepostory() {
        return new UserRepostory();
    }
}
