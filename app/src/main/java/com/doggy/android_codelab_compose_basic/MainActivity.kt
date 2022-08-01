package com.doggy.android_codelab_compose_basic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.doggy.android_codelab_compose_basic.ui.components.MyApp
import com.doggy.android_codelab_compose_basic.ui.theme.AndroidcodelabcomposebasicTheme

internal class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      AndroidcodelabcomposebasicTheme {
        MyApp()
      }
    }
  }
}
