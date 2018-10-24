package com.dafian.android.mhwmobile.data.api

import com.dafian.android.mhwmobile.data.entity.Armor
import com.dafian.android.mhwmobile.data.entity.Item
import com.dafian.android.mhwmobile.data.entity.SkillHead
import com.dafian.android.mhwmobile.data.entity.Weapon
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface RestServices {

    @GET("/armor")
    fun findArmorAll(): Observable<List<Armor>>

    @GET("/armor/{id}")
    fun findArmorById(@Path("id") id: Int?): Observable<Armor>

    @GET("/weapons")
    fun findWeaponAll(): Observable<List<Weapon>>

    @GET("/weapons/{id}")
    fun findWeaponById(@Path("id") id: Int?): Observable<Weapon>

    @GET("/skills")
    fun findSkillAll(): Observable<List<SkillHead>>

    @GET("/skills/{id}")
    fun findSkillById(@Path("id") id: Int?): Observable<SkillHead>

    @GET("/items")
    fun findItemAll(): Observable<List<Item>>

    @GET("/items/{id}")
    fun findItemById(@Path("id") id: Int?): Observable<Item>
}