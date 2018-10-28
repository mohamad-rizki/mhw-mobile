package com.dafian.android.mhwmobile.data

import com.dafian.android.mhwmobile.data.api.RestServices
import com.dafian.android.mhwmobile.data.entity.Armor
import com.dafian.android.mhwmobile.data.entity.Item
import com.dafian.android.mhwmobile.data.entity.SkillHead
import com.dafian.android.mhwmobile.data.entity.Weapon
import io.reactivex.Observable

class DataManager(private val restServices: RestServices) {

    fun findArmorAll(): Observable<List<Armor>> {
        return restServices.findArmorAll()
    }

    fun findArmorById(id: Int): Observable<Armor> {
        return restServices.findArmorById(id)
    }

    fun findWeaponAll(): Observable<List<Weapon>> {
        return restServices.findWeaponAll()
    }

    fun findWeaponById(id: Int): Observable<Weapon> {
        return restServices.findWeaponById(id)
    }

    fun findSkillAll(): Observable<List<SkillHead>> {
        return restServices.findSkillAll()
    }

    fun findSkillById(id: Int): Observable<SkillHead> {
        return restServices.findSkillById(id)
    }

    fun findItemAll(): Observable<List<Item>> {
        return restServices.findItemAll()
    }

    fun findItemById(id: Int): Observable<Item> {
        return restServices.findItemById(id)
    }
}