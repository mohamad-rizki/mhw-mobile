package com.dafian.android.mhwmobile.data

import com.dafian.android.mhwmobile.data.api.RestServices
import com.dafian.android.mhwmobile.data.entity.Armor
import io.reactivex.Observable

class DataManager (private val restServices: RestServices) {

    fun findAll() : Observable<List<Armor>> {
        return restServices.findAll()
    }
}