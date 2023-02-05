package `in`.dls.pegasus.button

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
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
  text: String = "hello",
  size: DlsButtonSize = DlsButtonSize.MEDIUM,
  isEnabled: Boolean = true,
  onClick: () -> Unit = {}
) {
  val interactionSource = remember { MutableInteractionSource() }
  val isPressed by interactionSource.collectIsPressedAsState()
  val isHovered by interactionSource.collectIsHoveredAsState()

  val bgColorEnabled =
    when {
      isPressed -> DlsTheme.colors.titleActive
      isHovered -> DlsTheme.colors.primaryDark
      else -> DlsTheme.colors.primaryDefault
    }

  val bgColorDisabled = DlsTheme.colors.primaryDefault.copy(alpha = 0.5f)

  Button(
    onClick = onClick,
    interactionSource = interactionSource,
    contentPadding = DlsButtonStyle.getButtonPadding(size),
    shape = DlsButtonStyle.shape,
    colors =
      ButtonDefaults.buttonColors(
        backgroundColor = if (isEnabled) bgColorEnabled else bgColorDisabled,
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
