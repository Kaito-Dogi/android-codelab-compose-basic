package com.doggy.android_codelab_compose_basic.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun MyApp(names: List<String> = listOf("Android", "Compose")) {
  Surface(color = MaterialTheme.colors.background) {
    Column(
      modifier = Modifier
        .padding(vertical = 4.dp)
    ) {
      for (name in names) {
        Greeting(name = name)
      }
    }
  }
}
