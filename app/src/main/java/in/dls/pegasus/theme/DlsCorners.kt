package `in`.dls.pegasus.theme

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.dp

@Immutable
data class DlsCorners(
    val small: CornerSize,
    val medium: CornerSize,
    val large: CornerSize,
)

fun mobileDlsCorners() =
    DlsCorners(
        small = CornerSize(8.dp),
        medium = CornerSize(16.dp),
        large = CornerSize(32.dp),
    )