package com.doggy.android_codelab_compose_basic.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doggy.android_codelab_compose_basic.ui.theme.AndroidcodelabcomposebasicTheme

@Composable
internal fun OnBoardingScreen(onContinueClicked: () -> Unit) {
  Surface {
    Column(
      modifier = Modifier.fillMaxSize(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally,
    ) {
      Text(text = "Welcome to the Basics Codelab!")
      Button(
        modifier = Modifier.padding(vertical = 24.dp),
        onClick = { onContinueClicked() }) {
        Text(text = "Continue")
      }
    }
  }
}

@Preview(
  showBackground = true,
  widthDp = 320,
  heightDp = 320,
)
@Composable
internal fun OnBoardingPreview() {
  AndroidcodelabcomposebasicTheme {
    OnBoardingScreen(onContinueClicked = { /* do nothing */ })
  }
}
