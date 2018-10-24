package com.dafian.android.mhwmobile.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Item {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("rarity")
    @Expose
    var rarity: Int? = null
    @SerializedName("carryLimit")
    @Expose
    var carryLimit: Int? = null
    @SerializedName("sellPrice")
    @Expose
    var sellPrice: Int? = null
    @SerializedName("buyPrice")
    @Expose
    var buyPrice: Int? = null
}
