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
    primaryDefault: Color = Purple500,
    primaryDark: Color = Purple800,
    primaryLight: Color = Purple50,
    primaryBg: Color = Purple25,

    //secondary
    secondaryDefault: Color = Blue500,
    secondaryDark: Color = Blue800,
    secondaryLight: Color = Blue50,
    secondaryBg: Color = Blue25,

    //error
    errorDefault: Color = Pink500,
    errorDark: Color = Pink800,
    errorLight: Color = Pink50,
    errorBg: Color = Pink25,

    //success
    successDefault: Color = Green500,
    successDark: Color = Green800,
    successBg: Color = Green50,
    successLight: Color = Green25,

    //warning
    warningDefault: Color = Yellow500,
    warningDark: Color = Yellow800,
    warningBg: Color = Yellow50,
    warningLight: Color = Yellow25,
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
