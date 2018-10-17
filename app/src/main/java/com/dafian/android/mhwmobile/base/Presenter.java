package com.dafian.android.mhwmobile.base;

public interface Presenter<V extends BaseView> {

    void attachView(V view);

    void detachView();
}
