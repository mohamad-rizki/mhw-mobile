package com.dafian.android.mhwmobile.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

class Armor {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("slug")
    @Expose
    var slug: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("type")
    @Expose
    var type: String? = null
    @SerializedName("rank")
    @Expose
    var rank: String? = null
    @SerializedName("rarity")
    @Expose
    var rarity: Int? = null
    @SerializedName("resistances")
    @Expose
    var resistances: Resistance? = null
    @SerializedName("skills")
    @Expose
    var skills: List<Skill> = ArrayList()
    @SerializedName("assets")
    @Expose
    var assets: Asset? = null
    @SerializedName("crafting")
    @Expose
    var crafting: Crafting? = null
}
