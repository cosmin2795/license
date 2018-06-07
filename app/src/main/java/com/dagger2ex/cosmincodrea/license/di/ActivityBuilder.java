package com.dagger2ex.cosmincodrea.license.di;

/**
 * Created by cosmincodrea on 07/06/2018.
 */



import com.dagger2ex.cosmincodrea.license.page.login.LoginActivity;
import com.dagger2ex.cosmincodrea.license.page.login.LoginModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = LoginModule.class)
    abstract LoginActivity contributeLoginActivityInjector();

}