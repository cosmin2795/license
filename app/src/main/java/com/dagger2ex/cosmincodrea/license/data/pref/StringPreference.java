package com.dagger2ex.cosmincodrea.license.data.pref;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.text.TextUtils;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

public class StringPreference extends BasePreference<String> {

    public StringPreference(@NonNull SharedPreferences preferences, @NonNull String key) {
        super(preferences, key);
    }

    @Override
    public String get() {
        return mPreferences.getString(mKey, mDefaultValue);
    }

    @Override
    public void set(String value) {
        if (!TextUtils.isEmpty(value)) {
            mPreferences.edit().putString(mKey, value).apply();
        } else {
            delete();
        }
    }
}
