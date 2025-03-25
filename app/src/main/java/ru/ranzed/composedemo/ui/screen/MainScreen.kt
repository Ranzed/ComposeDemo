package ru.ranzed.composedemo.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ru.ranzed.composedemo.App
import ru.ranzed.composedemo.ui.theme.AppColors
import ru.ranzed.composedemo.ui.theme.AppColorsDefault
import ru.ranzed.composedemo.ui.theme.AppTheme
import ru.ranzed.composedemo.ui.theme.LocalAppColors

// Переиспользовать modifier

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
                .padding(horizontal = 16.dp, vertical = 4.dp)
        )
        GreetingWithBrief(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp)
                .weight(1f)
        )
        SearchBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp)
        )
        EventCategories(
            modifier = Modifier
                .fillMaxWidth()
                .height(84.dp)
                .padding(horizontal = 0.dp, vertical = 4.dp)
        )
        UpcomingEvents(
            modifier = Modifier
                .fillMaxWidth()
                .height(260.dp)
                .padding(horizontal = 0.dp, vertical = 4.dp)
        )
        BottomTabs(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }

}


@Composable
fun LocationAndNotifications(
    modifier: Modifier,
) {
    Row(modifier = modifier) {
        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "location icon")
        Text(
            text = "Kazan, Russia",
            fontSize = AppTheme.typography.header1.fontSize,
            color = AppTheme.colors.primaryText
        )
        Spacer(Modifier.weight(1f))
        Icon(
            imageVector = Icons.Default.Notifications,
            contentDescription = "Notification icon"
        )
    }
}

@Composable
fun GreetingWithBrief(
    modifier: Modifier,
) {
    Column(
        modifier = modifier.padding(top = 12.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hello, UserName",
            color = AppTheme.colors.primaryText,
            fontSize = AppTheme.typography.header1.fontSize
            )
        Text(
            text = "There are 32 events around your location.",
            color = AppTheme.colors.accentText,
            fontSize = AppTheme.typography.header1.fontSize
        )
    }
}

@Composable
fun SearchBar(
    modifier: Modifier,
) {
    Row(
        modifier = modifier
            .background(
                color = AppTheme.colors.accentText,
                shape = AppTheme.shapes.stretchedRow,
            )
            .border(
                width = 1.dp,
                color = AppTheme.colors.borderOutline,
                shape = AppTheme.shapes.stretchedRow
            )
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Search icon"
        )
        Text(
            text = "Search your  events",
            fontSize = AppTheme.typography.header3.fontSize,
            color = AppTheme.colors.secondaryText,
        )
        Spacer(Modifier.weight(1f))
        Box(
            modifier = Modifier
                .size(width = 1.dp, height = 12.dp)
                .padding(vertical = 2.dp, horizontal = 4.dp)
                .background(color = AppTheme.colors.divider)
        )
        Icon(imageVector = Icons.Default.Menu, contentDescription = "Filters icon")
    }
}


@Composable
fun EventCategories(
    modifier: Modifier,
) {
    Row(
        modifier = modifier
    ) {  }
}

@Composable
fun UpcomingEvents(
    modifier: Modifier,
) {
    Column(modifier = modifier) {
        Row {  }
        Row {  }
    }
}

@Composable
fun BottomTabs(
    modifier: Modifier
) {
    Row(modifier = modifier) {

    }
}

