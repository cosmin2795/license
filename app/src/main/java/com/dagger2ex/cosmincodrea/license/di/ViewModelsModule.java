package com.dagger2ex.cosmincodrea.license.di;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.dagger2ex.cosmincodrea.license.page.common.LicenseViewModelFactory;
import com.dagger2ex.cosmincodrea.license.page.login.LoginViewModel;
import com.dagger2ex.cosmincodrea.license.page.main.MainViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by cosmincodrea on 04/09/2018.
 */

@SuppressWarnings("unused")
@Module
abstract class ViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel.class)
    abstract ViewModel bindLoginViewModel(LoginViewModel loginViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    abstract ViewModel bindMainViewModel(MainViewModel mainViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(LicenseViewModelFactory factory);
}
