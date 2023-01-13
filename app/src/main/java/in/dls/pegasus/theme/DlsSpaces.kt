package `in`.dls.pegasus.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class DlsSpaces(
    val xxs: Dp,
    val xs: Dp,
    val s: Dp,
    val m: Dp,
    val l: Dp,
    val xl: Dp,
)

internal fun mobileDlsSpaces() =
    DlsSpaces(
        xxs = 2.dp,
        xs = 4.dp,
        s = 8.dp,
        m = 16.dp,
        l = 32.dp,
        xl = 64.dp,
    )
