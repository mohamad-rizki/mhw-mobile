package com.dafian.android.mhwmobile.ui.weapon

import com.dafian.android.mhwmobile.base.BaseView
import com.dafian.android.mhwmobile.data.entity.Weapon

interface WeaponView : BaseView {

    fun showWeaponAll(weapList: List<Weapon>)
}