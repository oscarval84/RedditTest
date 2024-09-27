package com.gnomon.reddittest

import com.gnomon.reddittest.networking.calls.RedditService
import com.gnomon.reddittest.ui.screen.main.MainViewModel
import io.ktor.client.HttpClient
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.URLProtocol
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val dataModule = module {
    single {
        HttpClient {
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                })
            }
            install(DefaultRequest) {
                url {
                    protocol = URLProtocol.HTTPS
                    host = "www.reddit.com"
                }
            }
        }
    }
    factoryOf(::RedditService)
}

val viewModelsModule = module {
    viewModelOf(::MainViewModel)
}

