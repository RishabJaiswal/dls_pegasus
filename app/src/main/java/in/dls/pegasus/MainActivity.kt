package `in`.dls.pegasus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import `in`.dls.pegasus.button.DlsPrimaryButton
import `in`.dls.pegasus.theme.DlsTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      DlsTheme {
        // A surface container using the 'background' color from the theme
        DlsPrimaryButton(
            text = "Hello"
        )
      }
    }
  }
}

@Composable
fun Greeting(name: String) {
  Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  DlsTheme { Greeting("Android") }
}
