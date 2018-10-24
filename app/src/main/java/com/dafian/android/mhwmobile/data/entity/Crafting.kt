package com.dafian.android.mhwmobile.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

class Crafting {

    @SerializedName("materials")
    @Expose
    var materials: List<Material> = ArrayList()
}
