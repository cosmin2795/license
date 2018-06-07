package com.dagger2ex.cosmincodrea.license.page.login;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

@Module
public class LoginModule {

    @Provides
    LoginContract.View provideLoginView(LoginActivity loginActivity){
        return loginActivity;
    }

    @Provides
    LoginContract.Presenter provideLoginPresenter(LoginPresenter loginPresenter){
        return loginPresenter;
    }

}
