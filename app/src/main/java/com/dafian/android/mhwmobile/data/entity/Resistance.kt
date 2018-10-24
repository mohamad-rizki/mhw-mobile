package com.dafian.android.mhwmobile.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Resistance {

    @SerializedName("fire")
    @Expose
    var fire: Int? = null
    @SerializedName("water")
    @Expose
    var water: Int? = null
    @SerializedName("ice")
    @Expose
    var ice: Int? = null
    @SerializedName("thunder")
    @Expose
    var thunder: Int? = null
    @SerializedName("dragon")
    @Expose
    var dragon: Int? = null
}
