package com.dafian.android.mhwmobile.ui.item

import com.dafian.android.mhwmobile.base.BaseView
import com.dafian.android.mhwmobile.data.entity.Item

interface ItemView : BaseView {

    fun showItemAll(itemList: List<Item>)
}