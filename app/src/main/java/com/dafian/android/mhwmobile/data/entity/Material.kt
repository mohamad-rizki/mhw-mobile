package com.dafian.android.mhwmobile.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Material {

    @SerializedName("quantity")
    @Expose
    var quantity: Int? = null
    @SerializedName("item")
    @Expose
    var item: Item? = null
}
