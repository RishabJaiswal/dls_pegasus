package `in`.dls.pegasus.button

import `in`.dls.pegasus.theme.DlsTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

internal object DlsButtonStyle {
  val shape = RoundedCornerShape(50)

  fun getButtonPadding(size: DlsButtonSize): PaddingValues {
    return when (size) {
      DlsButtonSize.LARGE -> PaddingValues(32.dp, 18.dp)
      DlsButtonSize.MEDIUM -> PaddingValues(32.dp, 14.dp)
      DlsButtonSize.SMALL -> PaddingValues(24.dp, 8.dp)
    }
  }

  @Composable
  fun textStyle(size: DlsButtonSize): TextStyle {
    return when (size) {
      DlsButtonSize.LARGE -> DlsTheme.typography.textMedium
      DlsButtonSize.MEDIUM -> DlsTheme.typography.textMedium
      DlsButtonSize.SMALL -> DlsTheme.typography.textSmall
    }
  }
}
