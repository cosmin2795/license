package com.dagger2ex.cosmincodrea.license.data.pref;

import android.content.Context;
import android.content.SharedPreferences;

import com.dagger2ex.cosmincodrea.license.LicenseApplication;
import com.dagger2ex.cosmincodrea.license.R;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

@Module
public class AppPrefsModule {

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(LicenseApplication app) {
        return app.getSharedPreferences(app.getString(R.string.app_name), Context.MODE_PRIVATE);
    }

//    @Provides
//    @Singleton
//    @Named(AppPrefsConstants.LOCATION)
//    StringPreference provideLocation(@AppPrefs SharedPreferences sharedPreferences) {
//        return new StringPreference(sharedPreferences, AppPrefsConstants.LOCATION);
//    }

}
