package com.gnomon.reddittest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.gnomon.reddittest.ui.navigation.NavigationHost
import com.gnomon.reddittest.ui.screen.common.Screen
import org.koin.compose.KoinContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KoinContext {
                Screen {
                    NavigationHost()
                }
            }
        }
    }
}
