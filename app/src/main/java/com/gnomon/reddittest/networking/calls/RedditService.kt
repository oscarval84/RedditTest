package com.gnomon.reddittest.networking.calls

import RedditResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class RedditService(private val httpClient: HttpClient) {

    suspend fun getPosts(): RedditResponse {
        return httpClient.get("/.json").body()
    }
}