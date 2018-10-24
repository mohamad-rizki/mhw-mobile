package com.dafian.android.mhwmobile.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Asset {

    @SerializedName("imageMale")
    @Expose
    var imageMale: String? = null
    @SerializedName("imageFemale")
    @Expose
    var imageFemale: String? = null
    @SerializedName("icon")
    @Expose
    var icon: String? = null
    @SerializedName("image")
    @Expose
    var image: String? = null
}
