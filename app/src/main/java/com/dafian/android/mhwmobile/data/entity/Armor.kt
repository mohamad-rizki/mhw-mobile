package com.dafian.android.mhwmobile.data.entity

import com.google.gson.annotations.SerializedName

data class Armor (
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("type") val type: String,
    @SerializedName("rank") val rank: String,
    @SerializedName("rarity") val rarity: Int
)