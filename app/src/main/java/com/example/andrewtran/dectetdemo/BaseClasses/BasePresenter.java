package com.example.andrewtran.dectetdemo.BaseClasses;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public abstract class BasePresenter<PV extends com.example.andrewtran.dectetdemo.BaseClasses.BasePresenterView> {

    @Nullable
    protected PV mPresenterView;

    @CallSuper
    public void onAttachView(@NonNull PV presenterView) {
        mPresenterView = presenterView;
    }

    @CallSuper
    public void onDetachView() {
        mPresenterView = null;
    }
}