package com.dagger2ex.cosmincodrea.license.page.main;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dagger2ex.cosmincodrea.license.page.common.BaseActivity;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

public class MainActivity extends BaseActivity<MainViewModel> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected Class<MainViewModel> getViewModelClass() {
        return MainViewModel.class;
    }

}
