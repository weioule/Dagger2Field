package com.example.weioule.dagger2field.act;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.weioule.dagger2field.App;
import com.example.weioule.dagger2field.component.ActivityComponent;
import com.example.weioule.dagger2field.component.DaggerActivityComponent;
import com.example.weioule.dagger2field.module.AcvtivityModule;


/**
 * author weioule
 * Create on 2018/6/25.
 */
public class BaseActivity extends AppCompatActivity {

    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivityComponent = DaggerActivityComponent.builder()
                .appComponent(((App) getApplication()).getAppComponent())
                .acvtivityModule(new AcvtivityModule(this))
                .build();
    }

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }
}
