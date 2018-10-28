package com.dafian.android.mhwmobile.ui.skill

import com.dafian.android.mhwmobile.base.BasePresenter
import com.dafian.android.mhwmobile.data.DataManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class SkillPresenter(val manager: DataManager) : BasePresenter<SkillView>() {

    fun getDataAll() {
        disposable.add(manager.findSkillAll()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if (isViewAttached) view.showSkillAll(it)
            }, {
                if (isViewAttached) view.showThrowable(it)
            })
        )
    }
}