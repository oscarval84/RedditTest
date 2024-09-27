package com.gnomon.reddittest.data.models

import kotlinx.serialization.Serializable

@Serializable
data class RedditPost(
    val image: String?,
    val title: String,
    val upVotes: Int,
    val body: String?,
    val commentCount: Int,
)


