package com.dagger2ex.cosmincodrea.license.di;

import android.app.Application;

import com.dagger2ex.cosmincodrea.license.LicenseApplication;
import com.dagger2ex.cosmincodrea.license.data.ApiModule;
import com.dagger2ex.cosmincodrea.license.data.pref.AppPrefsModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        ApplicationModule.class,
        ActivityBuilder.class,
        AppPrefsModule.class,
        ApiModule.class})
public interface ApplicationComponent {

    void inject(LicenseApplication toolboxApplication);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        ApplicationComponent build();
    }
}
