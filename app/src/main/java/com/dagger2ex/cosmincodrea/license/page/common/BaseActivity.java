package com.dagger2ex.cosmincodrea.license.page.common;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

public abstract class BaseActivity<VM extends ViewModel> extends AppCompatActivity {

    @Inject
    ViewModelProvider.Factory mViewModelFactory;

    protected VM mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        performDependencyInjection();
        mViewModel = ViewModelProviders.of(this, mViewModelFactory).get(getViewModelClass());
    }

    protected void inject() {
        AndroidInjection.inject(this);
    }


    private void performDependencyInjection() {
        AndroidInjection.inject(this);
    }

    protected abstract Class<VM> getViewModelClass();

}