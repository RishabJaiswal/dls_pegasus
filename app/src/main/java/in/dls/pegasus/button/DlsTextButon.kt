package `in`.dls.pegasus.button

import `in`.dls.pegasus.theme.DlsTheme
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun DlsTextButton(
    text: String = "",
    size: DlsButtonSize = DlsButtonSize.MEDIUM,
    onClick: () -> Unit = {}
) {
    TextButton(
        onClick = onClick,
        contentPadding = DlsButtonStyle.getButtonPadding(size),
        shape = DlsButtonStyle.shape,
        colors =
        ButtonDefaults.outlinedButtonColors(
            backgroundColor = Color.Transparent,
        ),
        content = {
            Text(
                text = text,
                color = DlsTheme.colors.primaryDefault,
                style = DlsButtonStyle.textStyle(size),
            )
        },
    )
}
