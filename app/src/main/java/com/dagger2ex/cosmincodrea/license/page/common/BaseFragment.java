package com.dagger2ex.cosmincodrea.license.page.common;


import android.support.v4.app.Fragment;

import dagger.android.support.AndroidSupportInjection;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

public class BaseFragment extends Fragment {

    protected void inject() {
        AndroidSupportInjection.inject(this);
    }


}
