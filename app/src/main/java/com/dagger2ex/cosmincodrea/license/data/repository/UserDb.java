package com.dagger2ex.cosmincodrea.license.data.repository;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

@Entity(tableName = "users")
public class UserDb {

    @PrimaryKey
    @ColumnInfo(name = "userId")
    public int userId;

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "password")
    public String password;
}
