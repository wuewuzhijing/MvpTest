package com.example.administrator.mvptest.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.example.administrator.mvptest.mvp.contract.loginContract;
import com.example.administrator.mvptest.mvp.model.loginModel;


@Module
public class loginModule {
    private loginContract.View view;

    /**
     * 构建loginModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public loginModule(loginContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    loginContract.View provideloginView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    loginContract.Model provideloginModel(loginModel model) {
        return model;
    }
}