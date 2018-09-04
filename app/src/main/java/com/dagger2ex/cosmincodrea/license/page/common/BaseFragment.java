package com.dagger2ex.cosmincodrea.license.page.common;


import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

public abstract class BaseFragment<VM extends ViewModel> extends Fragment {

    protected VM mViewModel;

    @Inject
    ViewModelProvider.Factory mViewModelFactory;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        performDependencyInjection();
        if (getActivity() != null) {
            mViewModel = ViewModelProviders.of(this, mViewModelFactory).get(getViewModelClass());
        }
    }

    private void performDependencyInjection() {
        AndroidSupportInjection.inject(this);
    }

    protected abstract Class<VM> getViewModelClass();

}
