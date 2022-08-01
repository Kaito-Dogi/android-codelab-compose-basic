package com.doggy.android_codelab_compose_basic.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.doggy.android_codelab_compose_basic.ui.screens.GreetingsScreen
import com.doggy.android_codelab_compose_basic.ui.screens.OnBoardingScreen

@Composable
internal fun MyApp() {
  var shouldShowOnBoarding by remember { mutableStateOf(true) }

  if (shouldShowOnBoarding) {
    OnBoardingScreen(onContinueClicked = { shouldShowOnBoarding = false })
  } else {
    GreetingsScreen()
  }
}
