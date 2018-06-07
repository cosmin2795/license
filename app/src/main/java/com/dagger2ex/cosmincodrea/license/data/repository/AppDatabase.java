package com.dagger2ex.cosmincodrea.license.data.repository;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

@Database(entities = {UserDb.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao testDriveDao();

}
