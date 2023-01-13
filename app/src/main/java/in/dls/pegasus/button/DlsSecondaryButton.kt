package `in`.dls.pegasus.button

import `in`.dls.pegasus.theme.DlsTheme
import androidx.compose.foundation.BorderStroke
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun DlsSecondaryButton(
    text: String = "Button",
    size: DlsButtonSize = DlsButtonSize.MEDIUM,
    onClick: () -> Unit = {}
) {
  OutlinedButton(
      onClick = onClick,
      contentPadding = size.getButtonPadding(),
      shape = DlsButtonStyle.shape,
      colors =
          ButtonDefaults.outlinedButtonColors(
              backgroundColor = Color.Transparent,
          ),
      border =
          BorderStroke(
              width = 2.dp,
              color = DlsTheme.colors.primaryDefault,
          ),
      content = {
        Text(
            text = text,
            color = DlsTheme.colors.primaryDefault,
            style = DlsButtonStyle.textStyle(size),
        )
      },
  )
}
