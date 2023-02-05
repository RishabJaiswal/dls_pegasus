package `in`.dls.pegasus.button

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import `in`.dls.pegasus.theme.DlsTheme

@Preview
@Composable
fun DlsPrimaryButton(
  text: String = "",
  size: DlsButtonSize = DlsButtonSize.MEDIUM,
  onClick: () -> Unit = {}
) {
  val interactionSource = remember { MutableInteractionSource() }
  val isPressed by interactionSource.collectIsPressedAsState()

  val bgColor = when {
    isPressed -> DlsTheme.colors.titleActive
    else -> DlsTheme.colors.primaryDefault
  }

  Button(
    onClick = onClick,
    interactionSource = interactionSource,
    contentPadding = DlsButtonStyle.getButtonPadding(size),
    shape = DlsButtonStyle.shape,
    colors =
      ButtonDefaults.buttonColors(
        backgroundColor = bgColor,
      ),
    content = {
      Text(
        text = text,
        color = DlsTheme.colors.background,
        style = DlsButtonStyle.textStyle(size),
      )
    },
  )
}
