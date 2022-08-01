package com.doggy.android_codelab_compose_basic.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun Greeting(name: String) {
  Surface(color = MaterialTheme.colors.primary) {
    Text(text = "Hello, ${name}!", modifier = Modifier.padding(24.dp))
  }
}