package com.dafian.android.mhwmobile.ui.weapon

import com.dafian.android.mhwmobile.base.BasePresenter
import com.dafian.android.mhwmobile.data.DataManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class WeaponPresenter(val manager: DataManager) : BasePresenter<WeaponView>() {

    fun getDataAll() {
        disposable.add(manager.findWeaponAll()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if (isViewAttached) view.showWeaponAll(it)
            }, {
                if (isViewAttached) view.showThrowable(it)
            })
        )
    }
}