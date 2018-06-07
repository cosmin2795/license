package com.dagger2ex.cosmincodrea.license;

import android.app.Activity;
import android.app.Application;

import com.dagger2ex.cosmincodrea.license.di.InjectionHelper;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

public class LicenseApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> mActivityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        //DI
        InjectionHelper.getApplicationComponent(this).inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return mActivityDispatchingAndroidInjector;
    }
}
