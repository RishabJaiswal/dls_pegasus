package `in`.dls.pegasus.ui.theme

import androidx.compose.ui.graphics.Color

fun lightDlsColors(
    titleActive: Color = Grey800,
    body: Color = Grey700,
    label: Color = Grey600,
    placeholder: Color = Grey500,
    line: Color = Grey400,
    inputBackground: Color = Grey300,
    background: Color = Grey200,
    offWhite: Color = Grey100,

    //primary
    primaryDefault: Color = Violet500,
    primaryDark: Color = Violet500,
    primaryLight: Color = Violet500,
    primaryBg: Color = Violet500,

    //secondary
    secondaryDefault: Color = Violet500,
    secondaryDark: Color = Violet500,
    secondaryBg: Color = Violet500,
    secondaryLight: Color = Violet500,

    //error
    errorDefault: Color = Violet500,
    errorDark: Color = Violet500,
    errorBg: Color = Violet500,
    errorLight: Color = Violet500,

    //success
    successDefault: Color = Violet500,
    successDark: Color = Violet500,
    successBg: Color = Violet500,
    successLight: Color = Violet500,

    //warning
    warningDefault: Color = Violet500,
    warningDark: Color = Violet500,
    warningBg: Color = Violet500,
    warningLight: Color = Violet500,
) =
    DlsColors(
        titleActive = titleActive,
        body = body,
        label = label,
        placeholder = placeholder,
        line = line,
        inputBackground = inputBackground,
        background = background,
        offWhite = offWhite,
        primaryDefault = primaryDefault,
        primaryDark = primaryDark,
        primaryLight = primaryLight,
        primaryBg = primaryBg,
        secondaryDefault = secondaryDefault,
        secondaryDark = secondaryDark,
        secondaryBg = secondaryBg,
        secondaryLight = secondaryLight,
        errorDefault = errorDefault,
        errorDark = errorDark,
        errorBg = errorBg,
        errorLight = errorLight,
        successDefault = successDefault,
        successDark = successDark,
        successBg = successBg,
        successLight = successLight,
        warningDefault = warningDefault,
        warningDark = warningDark,
        warningBg = warningBg,
        warningLight = warningLight,
        isLight = true,
    )
