
package jetpackcompose.screens

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import jetpackcompose.R
import jetpackcompose.router.BackButtonHandler
import jetpackcompose.router.Router
import jetpackcompose.router.Screen

private val items = listOf(
    BookCategory(
        R.string.android,
        listOf(
            R.drawable.android_aprentice,
            R.drawable.saving_data_android,
            R.drawable.advanced_architecture_android
        )
    ),
    BookCategory(
        R.string.kotlin,
        listOf(
            R.drawable.kotlin_coroutines,
            R.drawable.kotlin_aprentice
        )
    ),
    BookCategory(
        R.string.swift,
        listOf(
            R.drawable.combine,
            R.drawable.rx_swift,
            R.drawable.swift_apprentice,
        )
    ),
    BookCategory(
        R.string.ios,
        listOf(
            R.drawable.core_data,
            R.drawable.ios_apprentice,
        )
    )
)

@Composable
fun ListScreen() {
  DemoList()

  BackButtonHandler {
    Router.navigateTo(Screen.Navigation)
  }
}

@Composable
fun DemoList() {
  //TODO add your code here
}

@Composable
fun ListItem(bookCategory: BookCategory, modifier: Modifier = Modifier) {
  //TODO add your code here
}

data class BookCategory(@StringRes val categoryResourceId: Int, val bookImageResources: List<Int>)