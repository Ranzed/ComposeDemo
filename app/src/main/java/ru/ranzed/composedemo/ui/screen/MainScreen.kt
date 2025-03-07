package ru.ranzed.composedemo.ui.screen

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.core.provider.FontsContractCompat.Columns

@Composable
fun MainScreen(
    modifier: Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Top
    ) {
        LocationAndNotifications(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 0.dp)
        )
        GreetingWithBrief()
        SearchBar()
        EventCategories()
        UpcomingEvents()
    }

}


@Composable
fun LocationAndNotifications(
    modifier: Modifier,
) {
    Row(modifier = modifier) {
        Text(text = "LIcon")
        Text(text = "Current city and region")
        Spacer(Modifier. weight(1f))
        Text(text = "NIcon")
    }
}

@Composable
fun GreetingWithBrief() {

}

@Composable
fun SearchBar() {

}


@Composable
fun EventCategories() {

}

@Composable
fun UpcomingEvents() {

}

