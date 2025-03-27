package ru.ranzed.composedemo.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.ranzed.composedemo.App
import ru.ranzed.composedemo.ui.theme.AppColors
import ru.ranzed.composedemo.ui.theme.AppColorsDefault
import ru.ranzed.composedemo.ui.theme.AppShapesDefault
import ru.ranzed.composedemo.ui.theme.AppTheme
import ru.ranzed.composedemo.ui.theme.AppTypographyDefault
import ru.ranzed.composedemo.ui.theme.LocalAppColors
import ru.ranzed.composedemo.ui.theme.gradientBrush

// Переиспользовать modifier

private val MainScreenPaddingModifier = Modifier
    .fillMaxWidth()
    .padding(horizontal = 16.dp, vertical = 4.dp)

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
                .padding(start = 16.dp, end = 16.dp, top = 24.dp)
        )
        GreetingWithBrief(
            modifier = MainScreenPaddingModifier
                .weight(1f)
        )
        SearchBar(
            modifier = MainScreenPaddingModifier
                .height(40.dp)
        )
        Spacer(modifier = Modifier.height(12.dp))
        EventCategories(
            modifier = Modifier
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
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(imageVector = Icons.Outlined.LocationOn, contentDescription = "location icon")
        Text(
            modifier = Modifier.padding(start = 4.dp),
            text = "Kazan, Russia",
            color = AppTheme.colors.primaryText,
            style = AppTheme.typography.bodyLightMono14,
        )
        Icon(
            imageVector = Icons.Outlined.KeyboardArrowDown,
            contentDescription = "Notification icon"
        )
        Spacer(Modifier.weight(1f))
        Icon(
            imageVector = Icons.Outlined.Notifications,
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
            style = AppTheme.typography.headerBold32,
            )
        Text(
            modifier = Modifier.padding(top = 12.dp),
            text = "There are 32 events around your location.",
            color = AppTheme.colors.accentText,
            style = AppTheme.typography.headerBold32,
        )
    }
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


@Preview
@Composable
fun MainScreenPreview() {
    AppTheme(
        colors = AppColorsDefault,
        shapes = AppShapesDefault,
        typography = AppTypographyDefault
    ) {
        MainScreen(
            modifier = Modifier
                .fillMaxSize()
                .background(brush = gradientBrush),
        )
    }
}