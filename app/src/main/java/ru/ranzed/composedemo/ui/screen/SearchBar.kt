package ru.ranzed.composedemo.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.ranzed.composedemo.ui.theme.AppColorsDefault
import ru.ranzed.composedemo.ui.theme.AppShapesDefault
import ru.ranzed.composedemo.ui.theme.AppTheme
import ru.ranzed.composedemo.ui.theme.AppTypographyDefault
import ru.ranzed.composedemo.ui.theme.AppTypographyTokens.bodyLight14

@Composable
fun SearchBar(
    modifier: Modifier,
) {
    Row(
        modifier = modifier
            .background(
                color = AppTheme.colors.primaryBackground,
                shape = AppTheme.shapes.stretchedRow,
            )
            .border(
                width = 1.dp,
                color = AppTheme.colors.borderOutline,
                shape = AppTheme.shapes.stretchedRow
            )
            .padding(all = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Outlined.Search,
            contentDescription = "Search icon",
            tint = AppTheme.colors.secondaryText
        )
        Text(
            modifier = Modifier.padding(start = 8.dp),
            text = "Search your favourites events",
            color = AppTheme.colors.secondaryText,
            style = bodyLight14
        )
        Spacer(Modifier.weight(1f))
        Box(
            modifier = Modifier
                .size(width = 1.dp, height = 16.dp)
                .background(color = AppTheme.colors.divider)
        )
        Icon(
            modifier = Modifier.padding(start = 8.dp),
            imageVector = Icons.Outlined.Menu,
            contentDescription = "Filters icon",
            tint = AppTheme.colors.secondaryText
        )
    }
}

@Preview
@Composable
fun SearchBarPreview() {
    AppTheme(
        colors = AppColorsDefault,
        shapes = AppShapesDefault,
        typography = AppTypographyDefault
    ) {
        SearchBar(
            modifier = Modifier
        )
    }
}