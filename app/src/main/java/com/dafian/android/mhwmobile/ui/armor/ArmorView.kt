package com.dafian.android.mhwmobile.ui.armor

import com.dafian.android.mhwmobile.base.BaseView
import com.dafian.android.mhwmobile.data.entity.Armor

interface ArmorView : BaseView {

    fun showArmorAll(armorList: List<Armor>)
}