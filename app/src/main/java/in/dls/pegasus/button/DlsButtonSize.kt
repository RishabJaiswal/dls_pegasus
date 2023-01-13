package `in`.dls.pegasus.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.dp

enum class DlsButtonSize {
  LARGE,
  MEDIUM,
  SMALL
}

internal fun DlsButtonSize.getButtonPadding(): PaddingValues {
  return when (this) {
    DlsButtonSize.LARGE -> PaddingValues(32.dp, 18.dp)
    DlsButtonSize.MEDIUM -> PaddingValues(32.dp, 14.dp)
    DlsButtonSize.SMALL -> PaddingValues(24.dp, 8.dp)
  }
}
