package com.gnomon.reddittest.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.gnomon.reddittest.data.models.RedditPost
import com.gnomon.reddittest.ui.screen.detail.DetailComposable
import com.gnomon.reddittest.ui.screen.main.MainComposable
import kotlinx.serialization.Serializable
import kotlin.reflect.typeOf


@Composable
fun NavigationHost(
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Main) {
        composable<Main> {
            MainComposable(onClick = {
                navController.navigate(it)
            }
            )
        }
        composable<RedditPost> { backStackEntry ->
            val detailRoute = backStackEntry.toRoute<RedditPost>()
            DetailComposable(
                onBack = { navController.popBackStack() },
                redditPost = detailRoute
            )
        }
    }
}

@Serializable
data object Main

@Serializable
data class Detail(val redditPost: String = "") {
    companion object {
        val typeMap = mapOf(typeOf<RedditPost>() to serializableType<RedditPost>())
    }
}
