package io.sellmair.app

import androidx.compose.ui.window.ComposeUIViewController

@Suppress("unused") // used by swift code
fun createViewController() = ComposeUIViewController {
    MainScreen()
}