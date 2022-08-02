package com.doggy.android_codelab_compose_basic.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun Greeting(name: String) {
  Card(
    backgroundColor = MaterialTheme.colors.primary,
    modifier = Modifier
      .padding(vertical = 4.dp, horizontal = 8.dp)
  ) {
    CardContent(name = name)
  }
}
