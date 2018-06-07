package com.dagger2ex.cosmincodrea.license.di;

import com.dagger2ex.cosmincodrea.license.LicenseApplication;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

public class InjectionHelper {


    private InjectionHelper() {
    }

    public static ApplicationComponent getApplicationComponent(LicenseApplication licenseApplication) {
        return DaggerApplicationComponent
                .builder()
                .application(licenseApplication)
                .build();
    }

}
