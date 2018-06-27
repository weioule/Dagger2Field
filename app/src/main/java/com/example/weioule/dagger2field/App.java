package com.example.weioule.dagger2field;

import android.app.Application;

import com.example.weioule.dagger2field.component.AppComponent;
import com.example.weioule.dagger2field.component.DaggerAppComponent;
import com.example.weioule.dagger2field.module.AppModule;


/**
 * author weioule
 * Create on 2018/6/25.
 */
public class App extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
