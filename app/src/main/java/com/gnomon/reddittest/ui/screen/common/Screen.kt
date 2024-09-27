package com.gnomon.reddittest.ui.screen.common

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.gnomon.reddittest.ui.theme.RedditTestTheme

@Composable
fun Screen(content: @Composable () -> Unit) {
    RedditTestTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            content = content
        )
    }
}