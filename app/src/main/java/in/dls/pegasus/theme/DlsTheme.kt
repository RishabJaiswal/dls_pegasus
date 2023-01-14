package `in`.dls.pegasus.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

@Composable
fun DlsTheme(
    colors: DlsColors = DlsTheme.colors,
    typography: DlsTypography = DlsTheme.typography,
    spaces: DlsSpaces = DlsTheme.spaces,
    corners: DlsCorners = DlsTheme.corners,
    content: @Composable () -> Unit,
) {
  CompositionLocalProvider(
      DlsThemeLocals.LocalColors provides colors,
      DlsThemeLocals.LocalTypography provides typography,
      DlsThemeLocals.LocalSpaces provides spaces,
      DlsThemeLocals.LocalCorners provides corners,
  ) {
    content()
  }
}

private object DlsThemeLocals {
  val LocalColors = staticCompositionLocalOf { lightDlsColors() }
  val LocalTypography = staticCompositionLocalOf { mobileDlsTypography() }
  val LocalSpaces = staticCompositionLocalOf { mobileDlsSpaces() }
  val LocalCorners = staticCompositionLocalOf { mobileDlsCorners() }
}

object DlsTheme {
  val colors: DlsColors
    @Composable @ReadOnlyComposable get() = DlsThemeLocals.LocalColors.current
  val typography: DlsTypography
    @Composable @ReadOnlyComposable get() = DlsThemeLocals.LocalTypography.current
  val spaces: DlsSpaces
    @Composable @ReadOnlyComposable get() = DlsThemeLocals.LocalSpaces.current
  val corners: DlsCorners
    @Composable @ReadOnlyComposable get() = DlsThemeLocals.LocalCorners.current
}
