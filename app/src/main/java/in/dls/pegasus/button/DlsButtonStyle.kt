package `in`.dls.pegasus.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import `in`.dls.pegasus.theme.DlsTheme

internal object DlsButtonStyle {
  val shape = RoundedCornerShape(50)
  @Composable fun textStyle() = DlsTheme.typography.textMedium
}