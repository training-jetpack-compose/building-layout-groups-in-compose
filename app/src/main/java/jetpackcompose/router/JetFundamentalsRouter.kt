package jetpackcompose.router

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf


sealed class Screen {
  object Navigation : Screen()
  object Text : Screen()
  object TextField : Screen()
  object Buttons : Screen()
  object ProgressIndicator : Screen()
  object AlertDialog : Screen()
  object Row : Screen()
  object Column : Screen()
  object Box : Screen()
  object Surface : Screen()
  object Scaffold : Screen()
  object Scrolling : Screen()
  object List : Screen()
  object Grid : Screen()
}

object JetFundamentalsRouter {
  var currentScreen: MutableState<Screen> = mutableStateOf(Screen.Navigation)

  fun navigateTo(destination: Screen) {
    currentScreen.value = destination
  }
}