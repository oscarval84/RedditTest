package com.gnomon.reddittest.ui.screen.main

import DataX
import RedditResponse
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gnomon.reddittest.data.models.RedditPost
import com.gnomon.reddittest.networking.calls.RedditService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

class MainViewModel(private val redditService: RedditService) : ViewModel(), KoinComponent {

    private val _state = MutableStateFlow(UiState())
    val state: StateFlow<UiState> = _state.asStateFlow()

    init {
        onUiReady()
    }

    private fun onUiReady() {
        viewModelScope.launch {
            _state.value = UiState(loading = true)
            try {
                val posts = redditService.getPosts()
                _state.value = UiState(response = posts.toPostItemList())
            } catch (e: Exception) {
                _state.value = UiState(response = emptyList())
            }
        }
    }


    data class UiState(
        val loading: Boolean = false,
        val response: List<RedditPost> = emptyList()
    )
}

private fun RedditResponse?.toPostItemList(): List<RedditPost> =
    this?.data?.children?.map { it.data }?.map {
        RedditPost(
            title = it?.title ?: "",
            image = it?.getImage(),
            upVotes = it?.ups ?: 0,
            body = it?.selftext ?: "",
            commentCount = it?.numComments ?: 0
        )
    } ?: emptyList()

private fun DataX.getImage(): String? {
    val image = urlOverriddenByDest ?: thumbnail ?: preview?.images?.firstOrNull()?.source?.url
    return image
}
