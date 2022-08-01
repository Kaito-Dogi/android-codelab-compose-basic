package com.doggy.android_codelab_compose_basic.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doggy.android_codelab_compose_basic.ui.screens.OnBoardingScreen
import com.doggy.android_codelab_compose_basic.ui.theme.AndroidcodelabcomposebasicTheme

@Composable
internal fun MyApp() {
  var shouldShowOnBoarding by remember { mutableStateOf(true) }

  if (shouldShowOnBoarding) {
    OnBoardingScreen(onContinueClicked = { shouldShowOnBoarding = false })
  } else {
    Greetings()
  }
}

@Preview(
  showBackground = true,
  widthDp = 320,
  uiMode = Configuration.UI_MODE_NIGHT_YES,
  name = "DefaultPreviewDark",
)
@Preview(
  showBackground = true,
  widthDp = 320,
)
@Composable
internal fun DefaultPreview() {
  AndroidcodelabcomposebasicTheme {
    MyApp()
  }
}
