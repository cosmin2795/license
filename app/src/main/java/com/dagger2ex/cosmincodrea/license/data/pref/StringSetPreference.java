package com.dagger2ex.cosmincodrea.license.data.pref;

import android.content.SharedPreferences;

import java.util.Set;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

public class StringSetPreference extends BasePreference<Set<String>> {

    StringSetPreference(SharedPreferences preferences, String key, Set<String> defaultSet) {
        super(preferences, key, defaultSet);
    }

    @Override
    public Set<String> get() {
        return mPreferences.getStringSet(mKey, mDefaultValue);
    }

    @Override
    public void set(Set<String> value) {
        mPreferences.edit().putStringSet(mKey, value).apply();
    }

    public void addStringToSet(String newString) {
        Set<String> oldSet = get();
        oldSet.add(newString);
        set(oldSet);
    }

    public void removeStringFromSet(String toRemove) {
        Set<String> oldSet = get();
        oldSet.remove(toRemove);
        set(oldSet);
    }

    public void replaceStringFromSet(String newString, String oldString) {
        Set<String> oldSet = get();
        oldSet.remove(oldString);
        oldSet.add(newString);
        set(oldSet);
    }
}
