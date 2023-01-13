package `in`.dls.pegasus.button

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import `in`.dls.pegasus.theme.DlsTheme

@Preview
@Composable
fun DlsPrimaryButton(
    text: String = "",
    size: DlsButtonSize = DlsButtonSize.MEDIUM,
    onClick: () -> Unit = {}
) {
  Button(
      onClick = onClick,
      contentPadding = size.getButtonPadding(),
      shape = DlsButtonStyle.shape,
      colors =
          ButtonDefaults.buttonColors(
              backgroundColor = DlsTheme.colors.primaryDefault,
          ),
      content = {
        Text(
            text = text,
            color = DlsTheme.colors.background,
            style = DlsTheme.typography.textMedium,
        )
      },
  )
}
