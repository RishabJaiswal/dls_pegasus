package `in`.dls.pegasus.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

@Composable
fun DlsTheme(
    colors: DlsColors = DlsTheme.colors,
    content: @Composable () -> Unit,
) {
  CompositionLocalProvider(
      LocalDlsColors provides colors,
  ) {
    content()
  }
}

object DlsTheme {
  val colors: DlsColors
    @Composable @ReadOnlyComposable get() = LocalDlsColors.current
}
