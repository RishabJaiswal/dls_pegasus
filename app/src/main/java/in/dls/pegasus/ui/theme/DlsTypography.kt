package `in`.dls.pegasus.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import `in`.dls.pegasus.R

private val poppins =
    FontFamily(
        Font(R.font.poppins_regular, FontWeight.Normal),
        Font(R.font.poppins_medium, FontWeight.Medium),
        Font(R.font.poppins_semi_bold, FontWeight.SemiBold),
        Font(R.font.poppins_bold, FontWeight.Bold),
    )

data class DlsTypography(
    // display
    val displayLarge: TextStyle,
    val displayMedium: TextStyle,
    val displaySmall: TextStyle,
    // display bold
    val displayLargeBold: TextStyle,
    val displayMediumBold: TextStyle,
    val displaySmallBold: TextStyle,
    // text
    val textLarge: TextStyle,
    val textMedium: TextStyle,
    val textSmall: TextStyle,
    val textXSmall: TextStyle,
    // link
    val linkLarge: TextStyle,
    val linkMedium: TextStyle,
    val linkSmall: TextStyle,
    val linkXSmall: TextStyle,
)

fun mobileTypography() =
    DlsTypography(
        displayLarge =
            TextStyle(
                fontFamily = poppins,
                fontSize = 48.sp,
            ),
        displayMedium =
            TextStyle(
                fontFamily = poppins,
                fontSize = 32.sp,
            ),
        displaySmall =
            TextStyle(
                fontFamily = poppins,
                fontSize = 24.sp,
            ),
        displayLargeBold =
            TextStyle(
                fontFamily = poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 48.sp,
            ),
        displayMediumBold =
            TextStyle(
                fontFamily = poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
            ),
        displaySmallBold =
            TextStyle(
                fontFamily = poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
            ),
        textLarge =
            TextStyle(
                fontFamily = poppins,
                fontWeight = FontWeight.Normal,
                fontSize = 20.sp,
            ),
        textMedium =
            TextStyle(
                fontFamily = poppins,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
            ),
        textSmall =
            TextStyle(
                fontFamily = poppins,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
            ),
        textXSmall =
            TextStyle(
                fontFamily = poppins,
                fontWeight = FontWeight.Medium,
                fontSize = 13.sp,
            ),
        linkLarge =
            TextStyle(
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
            ),
        linkMedium =
            TextStyle(
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
            ),
        linkSmall =
            TextStyle(
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
            ),
        linkXSmall =
            TextStyle(
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
                fontSize = 13.sp,
            ),
    )
