package com.dagger2ex.cosmincodrea.license.data.pref;

import android.content.SharedPreferences;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

abstract class BasePreference<T> {

    final SharedPreferences mPreferences;
    final String mKey;
    final T mDefaultValue;

    BasePreference(SharedPreferences preferences, String key) {
        this(preferences, key, null);
    }

    BasePreference(SharedPreferences preferences, String key, T defaultValue) {
        mPreferences = preferences;
        mKey = key;
        mDefaultValue = defaultValue;
    }

    public boolean isSet() {
        return mPreferences.contains(mKey);
    }

    void delete() {
        mPreferences.edit().remove(mKey).apply();
    }

    public abstract T get();

    public abstract void set(T value);

}
