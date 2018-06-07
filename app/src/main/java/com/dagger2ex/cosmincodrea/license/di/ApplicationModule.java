package com.dagger2ex.cosmincodrea.license.di;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;

import com.dagger2ex.cosmincodrea.license.LicenseApplication;
import com.dagger2ex.cosmincodrea.license.R;
import com.dagger2ex.cosmincodrea.license.data.repository.AppDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

@Module
public class ApplicationModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    LicenseApplication provideApplication(Application application) {
        return (LicenseApplication) application;
    }

    @Provides
    @Singleton
    AppDatabase provideAppDatabase(Application application) {
        return Room.databaseBuilder(application, AppDatabase.class, application.getString(R.string.app_name)).build();
    }

}
