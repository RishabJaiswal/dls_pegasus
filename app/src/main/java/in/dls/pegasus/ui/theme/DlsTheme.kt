package `in`.dls.pegasus.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

@Composable
fun DlsTheme(
    colors: DlsColors = DlsTheme.colors,
    typography: DlsTypography = DlsTheme.typography,
    spaces: DlsSpaces = DlsTheme.spaces,
    content: @Composable () -> Unit,
) {
  CompositionLocalProvider(
      DlsThemeLocals.LocalColors provides colors,
      DlsThemeLocals.LocalTypography provides typography,
      DlsThemeLocals.LocalSpaces provides spaces,
  ) {
    content()
  }
}

internal object DlsThemeLocals {
  val LocalColors = staticCompositionLocalOf { lightDlsColors() }
  val LocalTypography = staticCompositionLocalOf { mobileDlsTypography() }
  val LocalSpaces = staticCompositionLocalOf { mobileDlsSpaces() }
}

object DlsTheme {
  val colors: DlsColors
    @Composable @ReadOnlyComposable get() = DlsThemeLocals.LocalColors.current
  val typography: DlsTypography
    @Composable @ReadOnlyComposable get() = DlsThemeLocals.LocalTypography.current
  val spaces: DlsSpaces
    @Composable @ReadOnlyComposable get() = DlsThemeLocals.LocalSpaces.current
}
