package com.dagger2ex.cosmincodrea.license.page.common;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by cosmincodrea on 07/06/2018.
 */

public abstract class BaseMVPPresenter<V extends MVPView>
        implements MVPPresenter {

    private final CompositeDisposable mCompositeDisposable = new CompositeDisposable();
    private V mView;

    protected BaseMVPPresenter(V view) {
        mView = view;
    }

    protected void addDisposable(Disposable disposable) {
        mCompositeDisposable.add(disposable);
    }

    protected V getView() {
        return mView;
    }

    protected void clearDisposable() {
        mCompositeDisposable.clear();
    }

    @Override
    public void detachView() {
        mView = null;
        if (!mCompositeDisposable.isDisposed()) {
            mCompositeDisposable.clear();
        }
    }

}
