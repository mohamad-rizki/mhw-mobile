package com.dafian.android.mhwmobile.data.api

import com.dafian.android.mhwmobile.data.entity.Armor
import io.reactivex.Observable
import retrofit2.http.GET

interface RestServices {

    @GET("/armor")
    fun findAll() : Observable<List<Armor>>
}