package com.example.init.data.model

import com.squareup.moshi.Json

data class FlowerResponse (
    @Json(name = "total")
    var total: Long = 0,

    @Json(name = "totalHits")
    var totalHits: Long = 0,

    @Json(name = "hits")
    var hits: List<Hit>? = null
) {
    fun isSuccessful() = !hits.isNullOrEmpty()
}