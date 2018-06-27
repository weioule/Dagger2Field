package com.example.weioule.dagger2field.component;


import com.example.weioule.dagger2field.fm.MainFragment;
import com.example.weioule.dagger2field.scope.MainActivityScope;

import dagger.Subcomponent;

/**
 * author weioule
 * Create on 2018/6/25.
 */

@MainActivityScope
@Subcomponent
public interface MainFragmentComponent {
    void inject(MainFragment mainFragment);
}
