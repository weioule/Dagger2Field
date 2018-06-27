package com.example.weioule.dagger2field.act;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.weioule.dagger2field.R;
import com.example.weioule.dagger2field.component.DaggerMainComponent;
import com.example.weioule.dagger2field.component.MainComponent;
import com.example.weioule.dagger2field.fm.MainFragment;
import com.example.weioule.dagger2field.module.MainModule;


/**
 * author weioule
 * Create on 2018/6/25.
 */
public class MainActivity extends BaseActivity {

    private MainComponent mMainComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.main_fl, new MainFragment()).commit();

        mMainComponent = DaggerMainComponent.builder()
                .activityComponent(getActivityComponent())
                .mainModule(new MainModule())
                .build();
        mMainComponent.inject(this);
    }

    public MainComponent getMainComponent() {
        return mMainComponent;
    }
}
