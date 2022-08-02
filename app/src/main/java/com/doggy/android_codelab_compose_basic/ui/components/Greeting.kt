package com.doggy.android_codelab_compose_basic.ui.components

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.doggy.android_codelab_compose_basic.R

@Composable
internal fun Greeting(name: String) {
  val expand = remember { mutableStateOf(false) }
  val extraPadding = if (expand.value) 48.dp else 0.dp

  Surface(
    color = MaterialTheme.colors.primary,
    modifier = Modifier
      .padding(
        vertical = 4.dp,
        horizontal = 8.dp,
      )
  ) {
    Row(
      modifier = Modifier
        .padding(12.dp)
        .animateContentSize(
          animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow,
          )
        )
    ) {
      Column(
        modifier = Modifier
          .weight(1f)
          .padding(12.dp)
      ) {
        Text(text = "Hello, ")
        Text(
          text = name,
          style = MaterialTheme.typography.h4.copy(
            fontWeight = FontWeight.ExtraBold,
          ),
        )
        if (expand.value) {
          Text(text = ("Hidden text, ").repeat(20))
        }
      }
      IconButton(
        onClick = { expand.value = !expand.value },
      ) {
        Icon(
          imageVector = if (expand.value) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
          contentDescription = if (expand.value) {
            stringResource(id = R.string.show_less)
          } else {
            stringResource(id = R.string.show_more)
          },
        )
      }
    }
  }
}
