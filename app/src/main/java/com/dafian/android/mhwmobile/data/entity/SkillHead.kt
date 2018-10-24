package com.dafian.android.mhwmobile.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SkillHead {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("slug")
    @Expose
    var slug: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
}