package com.example.init.data.model

import com.squareup.moshi.Json

data class Hit (
    @Json(name = "id")
    var id: Long = 0,

    @Json(name = "pageURL")
    var pageURL: String? = null,

    @Json(name = "type")
    var type: String? = null,

    @Json(name = "tags")
    var tags: String? = null,

    @Json(name = "previewURL")
    var previewURL: String? = null,

    @Json(name = "previewWidth")
    var previewWidth: Long = 0,

    @Json(name = "previewHeight")
    var previewHeight: Long = 0,

    @Json(name = "webformatURL")
    var webformatURL: String? = null,

    @Json(name = "webformatWidth")
    var webformatWidth: Long = 0,

    @Json(name = "webformatHeight")
    var webformatHeight: Long = 0,

    @Json(name = "largeImageURL")
    var largeImageURL: String? = null,

    @Json(name = "imageWidth")
    var imageWidth: Long = 0,

    @Json(name = "imageHeight")
    var imageHeight: Long = 0,

    @Json(name = "imageSize")
    var imageSize: Long = 0,

    @Json(name = "views")
    var views: Long = 0,

    @Json(name = "downloads")
    var downloads: Long = 0,

    @Json(name = "collections")
    var collections: Long = 0,

    @Json(name = "likes")
    var likes: Long = 0,

    @Json(name = "comments")
    var comments: Long = 0,

    @Json(name = "user_id")
    var userId: Long = 0,

    @Json(name = "user")
    var user: String? = null,

    @Json(name = "userImageURL")
    var userImageURL: String? = null
)