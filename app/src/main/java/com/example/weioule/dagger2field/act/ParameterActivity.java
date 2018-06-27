package com.example.weioule.dagger2field.act;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.weioule.dagger2field.MvpView;
import com.example.weioule.dagger2field.R;
import com.example.weioule.dagger2field.component.DaggerCommonComponent;
import com.example.weioule.dagger2field.mode.Bean;
import com.example.weioule.dagger2field.module.ParameterModule;

import javax.inject.Inject;


/**
 * author weioule
 * Create on 2018/6/27.
 */
public class ParameterActivity extends AppCompatActivity implements MvpView {

    @Inject
    Bean mBean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);

        DaggerCommonComponent.builder().build().addSub(new ParameterModule(this)).inject(this);

        TextView userName = (TextView) findViewById(R.id.user_name);
        userName.setText(mBean.toString());
        findViewById(R.id.btn_set_user_name).setVisibility(View.GONE);
        findViewById(R.id.btn_toast).setVisibility(View.GONE);
        findViewById(R.id.do_next).setVisibility(View.GONE);
    }
}
