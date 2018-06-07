package com.dagger2ex.cosmincodrea.license.page.login;

import android.os.Bundle;

import com.dagger2ex.cosmincodrea.license.R;
import com.dagger2ex.cosmincodrea.license.page.common.BaseActivity;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity implements LoginContract.View {

    @Inject
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inject();
    }
}
