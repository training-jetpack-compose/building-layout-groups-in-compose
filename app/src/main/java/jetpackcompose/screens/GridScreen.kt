
package jetpackcompose.screens

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import jetpackcompose.router.BackButtonHandler
import jetpackcompose.router.JetFundamentalsRouter
import jetpackcompose.router.Screen

private val items = listOf(
    Icons.Filled.Check,
    Icons.Filled.Close,
    Icons.Filled.ThumbUp,
    Icons.Filled.Build,
    Icons.Filled.Delete,
    Icons.Filled.Home,
    Icons.Filled.Close,
    Icons.Filled.ThumbUp,
    Icons.Filled.Build,
    Icons.Filled.ThumbUp,
)

@Composable
fun GridScreen() {
  GridView(columnCount = 3)

  BackButtonHandler {
    JetFundamentalsRouter.navigateTo(Screen.Navigation)
  }
}

@Composable
fun GridView(columnCount: Int) {
  //TODO add your code here
}

@Composable
fun RowItem(rowItems: List<IconResource>) {
  //TODO add your code here
}

@Composable
fun RowScope.GridIcon(iconResource: IconResource) {
  //TODO add your code here
}

data class IconResource(val imageVector: ImageVector, val isVisible: Boolean)