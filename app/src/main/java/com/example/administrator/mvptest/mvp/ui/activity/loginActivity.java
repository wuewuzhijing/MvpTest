package com.example.administrator.mvptest.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import com.example.administrator.mvptest.di.component.DaggerloginComponent;
import com.example.administrator.mvptest.di.module.loginModule;
import com.example.administrator.mvptest.mvp.contract.loginContract;
import com.example.administrator.mvptest.mvp.presenter.loginPresenter;

import com.example.administrator.mvptest.R;


import static com.jess.arms.utils.Preconditions.checkNotNull;


public class loginActivity extends BaseActivity<loginPresenter> implements loginContract.View {


    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        DaggerloginComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .loginModule(new loginModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(Bundle savedInstanceState) {
        return R.layout.activity_login; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }


    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }


}
