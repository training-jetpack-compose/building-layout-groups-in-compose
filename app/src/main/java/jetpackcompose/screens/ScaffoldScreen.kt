package jetpackcompose.screens

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import jetpackcompose.R
import jetpackcompose.router.BackButtonHandler
import jetpackcompose.router.Router
import jetpackcompose.router.Screen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun ScaffoldScreen() {
  DemoScaffold()

  BackButtonHandler {
    Router.navigateTo(Screen.Navigation)
  }
}

@Composable
fun DemoScaffold() {
  val scaffoldState: ScaffoldState = rememberScaffoldState()
  val scope: CoroutineScope = rememberCoroutineScope()

  Scaffold(
    scaffoldState = scaffoldState,
    contentColor = colorResource(id = R.color.colorPrimary),
    content = { DemoRow() },
    topBar = { DemoTopAppBar(scaffoldState = scaffoldState, scope = scope) },
    bottomBar = { DemoBottomAppBar() },
    drawerContent = { DemoColumn() }
  )
}

@Composable
fun DemoTopAppBar(scaffoldState: ScaffoldState, scope: CoroutineScope) {

  val drawerState = scaffoldState.drawerState

  TopAppBar(
    navigationIcon = {
      IconButton(
        content = {
          Icon(
            Icons.Default.Menu,
            tint = Color.White,
            contentDescription = stringResource(R.string.menu)
          )
        },
        onClick = {
          scope.launch { if (drawerState.isClosed) drawerState.open() else drawerState.close() }
        }
      )
    },
    title = { Text(text = stringResource(id = R.string.app_name), color = Color.White) },
    backgroundColor = colorResource(id = R.color.colorPrimary)
  )
}

@Composable
fun DemoBottomAppBar() {
  BottomAppBar(
    content = {},
    backgroundColor = colorResource(id = R.color.colorPrimary)
  )
}