package `in`.dls.pegasus.ui.theme

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

internal val LocalDlsColors = staticCompositionLocalOf {  }
@Stable
class DlsColors(
    titleActive: Color,
    body: Color,
    label: Color,
    placeholder: Color,
    line: Color,
    inputBackground: Color,
    background: Color,
    offWhite: Color,
    primaryDefault: Color,
    primaryDark: Color,
    primaryLight: Color,
    primaryBg: Color,
    secondaryDefault: Color,
    secondaryDark: Color,
    secondaryBg: Color,
    secondaryLight: Color,
    errorDefault: Color,
    errorDark: Color,
    errorBg: Color,
    errorLight: Color,
    successDefault: Color,
    successDark: Color,
    successBg: Color,
    successLight: Color,
    warningDefault: Color,
    warningDark: Color,
    warningBg: Color,
    warningLight: Color,
    isLight: Color,
) {
  val titleActive by mutableStateOf(titleActive)
  val body by mutableStateOf(body)
  val label by mutableStateOf(label)
  val placeholder by mutableStateOf(placeholder)
  val line by mutableStateOf(line)
  val inputBackground by mutableStateOf(inputBackground)
  val background by mutableStateOf(background)
  val offWhite by mutableStateOf(offWhite)
  val primaryDefault by mutableStateOf(primaryDefault)
  val primaryDark by mutableStateOf(primaryDark)
  val primaryLight by mutableStateOf(primaryLight)
  val primaryBg by mutableStateOf(primaryBg)
  val secondaryDefault by mutableStateOf(secondaryDefault)
  val secondaryDark by mutableStateOf(secondaryDark)
  val secondaryBg by mutableStateOf(secondaryBg)
  val secondaryLight by mutableStateOf(secondaryLight)
  val errorDefault by mutableStateOf(errorDefault)
  val errorDark by mutableStateOf(errorDark)
  val errorBg by mutableStateOf(errorBg)
  val errorLight by mutableStateOf(errorLight)
  val successDefault by mutableStateOf(successDefault)
  val successDark by mutableStateOf(successDark)
  val successBg by mutableStateOf(successBg)
  val successLight by mutableStateOf(successLight)
  val warningDefault by mutableStateOf(warningDefault)
  val warningDark by mutableStateOf(warningDark)
  val warningBg by mutableStateOf(warningBg)
  val warningLight by mutableStateOf(warningLight)
  val isLight by mutableStateOf(isLight)

  fun copy(
      titleActive: Color = this.titleActive,
      body: Color = this.body,
      label: Color = this.label,
      placeholder: Color = this.placeholder,
      line: Color = this.line,
      inputBackground: Color = this.inputBackground,
      background: Color = this.background,
      offWhite: Color = this.offWhite,
      primaryDefault: Color = this.primaryDefault,
      primaryDark: Color = this.primaryDark,
      primaryLight: Color = this.primaryLight,
      primaryBg: Color = this.primaryBg,
      secondaryDefault: Color = this.secondaryDefault,
      secondaryDark: Color = this.secondaryDark,
      secondaryBg: Color = this.secondaryBg,
      secondaryLight: Color = this.secondaryLight,
      errorDefault: Color = this.errorDefault,
      errorDark: Color = this.errorDark,
      errorBg: Color = this.errorBg,
      errorLight: Color = this.errorLight,
      successDefault: Color = this.successDefault,
      successDark: Color = this.successDark,
      successBg: Color = this.successBg,
      successLight: Color = this.successLight,
      warningDefault: Color = this.warningDefault,
      warningDark: Color = this.warningDark,
      warningBg: Color = this.warningBg,
      warningLight: Color = this.warningLight,
      isLight: Color = this.isLight,
  ) =
      DlsColors(
          titleActive,
          body,
          label,
          placeholder,
          line,
          inputBackground,
          background,
          offWhite,
          primaryDefault,
          primaryDark,
          primaryLight,
          primaryBg,
          secondaryDefault,
          secondaryDark,
          secondaryBg,
          secondaryLight,
          errorDefault,
          errorDark,
          errorBg,
          errorLight,
          successDefault,
          successDark,
          successBg,
          successLight,
          warningDefault,
          warningDark,
          warningBg,
          warningLight,
          isLight,
      )
}
