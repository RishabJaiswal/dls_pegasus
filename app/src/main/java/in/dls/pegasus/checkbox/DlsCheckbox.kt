package `in`.dls.pegasus.checkbox

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import `in`.dls.pegasus.R
import `in`.dls.pegasus.theme.DlsTheme

@OptIn(ExperimentalAnimationApi::class)
@Preview
@Composable
fun DlsCheckbox(
  isChecked: Boolean = false,
  onCheckedChange: ((Boolean) -> Unit)? = null,
) {
  val isCheckedState = remember { mutableStateOf(isChecked) }
  val checkboxColor by
    animateColorAsState(
      if (isCheckedState.value) DlsTheme.colors.primaryDefault else DlsTheme.colors.line
    )

  Box(
    modifier =
      Modifier.size(40.dp)
        .clickable {}
        .toggleable(
          isCheckedState.value,
          onValueChange = {
            isCheckedState.value = isCheckedState.value.not()
            onCheckedChange?.invoke(it)
          }
        )
        .padding(4.dp)
        .clip(CircleShape)
        .background(color = checkboxColor),
    contentAlignment = Alignment.Center,
  ) {
    AnimatedVisibility(
      visible = isCheckedState.value,
      enter = scaleIn() + fadeIn(),
      exit = scaleOut() + fadeOut(),
    ) {
      Icon(
        contentDescription = "",
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_check),
        tint = DlsTheme.colors.background
      )
    }
  }
}
