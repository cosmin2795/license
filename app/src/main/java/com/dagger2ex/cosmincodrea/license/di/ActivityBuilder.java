package com.dagger2ex.cosmincodrea.license.di;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

import com.dagger2ex.cosmincodrea.license.page.login.LoginActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@SuppressWarnings("unused")
@Module
abstract class ActivityBuilder {

    // add modules = MainActivityFragmentProvider.class if you have any fragments on that activity

    @ContributesAndroidInjector
    abstract LoginActivity contributeLoginActivityInjector();

}