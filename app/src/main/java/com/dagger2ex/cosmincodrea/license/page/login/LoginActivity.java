package com.dagger2ex.cosmincodrea.license.page.login;

import android.os.Bundle;

import com.dagger2ex.cosmincodrea.license.R;
import com.dagger2ex.cosmincodrea.license.page.common.BaseActivity;

import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity<LoginViewModel>  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        inject();
    }

    @Override
    protected Class<LoginViewModel> getViewModelClass() {
        return LoginViewModel.class;
    }
}
