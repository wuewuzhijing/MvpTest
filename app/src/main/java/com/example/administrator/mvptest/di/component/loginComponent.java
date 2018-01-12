package com.example.administrator.mvptest.di.component;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.example.administrator.mvptest.di.module.loginModule;

import com.example.administrator.mvptest.mvp.ui.activity.loginActivity;

@ActivityScope
@Component(modules = loginModule.class, dependencies = AppComponent.class)
public interface loginComponent {
    void inject(loginActivity activity);
}