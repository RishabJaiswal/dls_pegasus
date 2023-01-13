package `in`.dls.pegasus.button

import `in`.dls.pegasus.theme.DlsTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle

internal object DlsButtonStyle {
  val shape = RoundedCornerShape(50)

  @Composable
  fun textStyle(size: DlsButtonSize): TextStyle {
    return when (size) {
      DlsButtonSize.LARGE -> DlsTheme.typography.textMedium
      DlsButtonSize.MEDIUM -> DlsTheme.typography.textMedium
      DlsButtonSize.SMALL -> DlsTheme.typography.textSmall
    }
  }
}
