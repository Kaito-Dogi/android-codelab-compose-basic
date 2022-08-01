package com.doggy.android_codelab_compose_basic.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable

@Composable
internal fun MyApp() {
  Surface(color = MaterialTheme.colors.background) {
    Greeting(name = "Android")
  }
}
