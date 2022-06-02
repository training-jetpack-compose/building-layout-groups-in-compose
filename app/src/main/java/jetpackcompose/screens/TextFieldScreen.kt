
package jetpackcompose.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import jetpackcompose.R
import jetpackcompose.router.BackButtonHandler
import jetpackcompose.router.Router
import jetpackcompose.router.Screen

@Composable
fun TextFieldScreen() {
  Column(
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    DemoTextField()
  }

  BackButtonHandler {
    Router.navigateTo(Screen.Navigation)
  }
}

@Composable
fun DemoTextField() {
  val textValue = remember { mutableStateOf("") }

  val primaryColor = colorResource(id = R.color.colorPrimary)

  OutlinedTextField(
    label = { Text(text = stringResource(id = R.string.email)) },
    colors = TextFieldDefaults.outlinedTextFieldColors(
      focusedBorderColor = primaryColor,
      focusedLabelColor = primaryColor,
      cursorColor = primaryColor
    ),
    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email),
    value = textValue.value,
    onValueChange = {
      textValue.value = it
    }
  )
}