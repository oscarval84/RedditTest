package com.gnomon.reddittest.ui.screen.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.gnomon.reddittest.R
import com.gnomon.reddittest.data.models.RedditPost
import com.gnomon.reddittest.ui.screen.common.LoadingIndicator
import com.gnomon.reddittest.ui.screen.common.PostItem
import org.koin.compose.viewmodel.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainComposable(
    onClick: (RedditPost) -> Unit,
    vm: MainViewModel = koinViewModel(),
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    Scaffold(
        modifier =
        Modifier
            .fillMaxSize()
            .padding(4.dp)
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.homeTitle))
                },
                scrollBehavior = scrollBehavior,
            )
        },
    ) { paddingValues ->
        val state by vm.state.collectAsState()

        LoadingIndicator(
            enabled = state.loading,
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        )

        LazyColumn(
            contentPadding = paddingValues,
        ) {
            items(state.response) { post ->
                PostItem(
                    post = post,
                    showBody = false,
                    onClick = { post -> onClick(post) }
                )
            }
        }
    }
}
