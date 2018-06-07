package com.dagger2ex.cosmincodrea.license.di;

import android.app.Application;

import com.dagger2ex.cosmincodrea.license.LicenseApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

@Singleton
@Component(modules = {ActivityBuilder.class, ApplicationModule.class, AndroidInjectionModule.class, AndroidSupportInjectionModule.class})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        ApplicationComponent build();
    }

    void inject(LicenseApplication licenseApplication);

}
