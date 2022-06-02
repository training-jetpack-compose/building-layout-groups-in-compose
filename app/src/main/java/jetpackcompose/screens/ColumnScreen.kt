package jetpackcompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import jetpackcompose.router.BackButtonHandler
import jetpackcompose.router.Router
import jetpackcompose.router.Screen

@Composable
fun ColumnScreen() {
  DemoColumn()

  BackButtonHandler {
    Router.navigateTo(Screen.Navigation)
  }
}

@Composable
fun DemoColumn() {
  Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceEvenly,
    modifier = Modifier.fillMaxSize()
  ) {

    THREE_ELEMENT_LIST.forEach { textResId ->
      Text(
        text = stringResource(id = textResId),
        fontSize = 22.sp
      )
    }
  }
}