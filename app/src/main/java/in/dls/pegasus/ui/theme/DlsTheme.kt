package `in`.dls.pegasus.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

@Composable
fun DlsTheme(
    colors: DlsColors = DlsTheme.colors,
    typography: DlsTypography = DlsTheme.typography,
    content: @Composable () -> Unit,
) {
  CompositionLocalProvider(
      DlsThemeLocals.LocalColors provides colors,
      DlsThemeLocals.LocalTypography provides typography,
  ) {
    content()
  }
}

internal object DlsThemeLocals {
  val LocalColors = staticCompositionLocalOf { lightDlsColors() }
  val LocalTypography = staticCompositionLocalOf { mobileDlsTypography() }
}

object DlsTheme {
  val colors: DlsColors
    @Composable @ReadOnlyComposable get() = DlsThemeLocals.LocalColors.current
  val typography: DlsTypography
    @Composable @ReadOnlyComposable get() = DlsThemeLocals.LocalTypography.current
}
