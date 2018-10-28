package com.dafian.android.mhwmobile.ui.item

import com.dafian.android.mhwmobile.base.BasePresenter
import com.dafian.android.mhwmobile.data.DataManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ItemPresenter(val manager: DataManager) : BasePresenter<ItemView>() {

    fun getDataAll() {
        disposable.add(
            manager.findItemAll()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    if (isViewAttached) view.showItemAll(it)
                }, {
                    if (isViewAttached) view.showThrowable(it)
                })
        )
    }
}