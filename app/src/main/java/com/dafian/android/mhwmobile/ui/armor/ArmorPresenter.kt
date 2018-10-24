package com.dafian.android.mhwmobile.ui.armor

import com.dafian.android.mhwmobile.base.BasePresenter
import com.dafian.android.mhwmobile.data.DataManager
import io.reactivex.schedulers.Schedulers

class ArmorPresenter (val manager: DataManager) : BasePresenter<ArmorView>() {

    fun getDataAll () {
        disposable.add(manager.findArmorAll()
            .observeOn(Schedulers.newThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if (isViewAttached) view.showArmorAll(it)
            }, {
                if (isViewAttached) view.showThrowable(it)
            }))
    }
}