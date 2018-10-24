package com.dafian.android.mhwmobile.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Skill {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("slug")
    @Expose
    var slug: String? = null
    @SerializedName("level")
    @Expose
    var level: Int? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("skill")
    @Expose
    var skill: Int? = null
    @SerializedName("skillName")
    @Expose
    var skillName: String? = null
}
