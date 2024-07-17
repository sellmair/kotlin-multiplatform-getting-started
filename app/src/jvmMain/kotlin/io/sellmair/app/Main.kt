package io.sellmair.app

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(title = "KMP Demo", onCloseRequest = ::exitApplication) {
        MainScreen()
    }
}