package com.dagger2ex.cosmincodrea.license.page.login;

import com.dagger2ex.cosmincodrea.license.page.common.BaseMVPPresenter;

import javax.inject.Inject;


/**
 * Created by cosmincodrea on 07/06/2018.
 */

public class LoginPresenter extends BaseMVPPresenter<LoginContract.View> implements LoginContract.Presenter {

    @Inject
    protected LoginPresenter(LoginContract.View view) {
        super(view);
    }
}
