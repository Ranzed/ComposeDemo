package ru.ranzed.composedemo.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
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
import ru.ranzed.composedemo.ui.theme.icons.Music

@Composable
fun EventCategories(
    modifier: Modifier,
) {
    Row(
        modifier = modifier
            .horizontalScroll(state = rememberScrollState()),
        horizontalArrangement = Arrangement.Absolute.Left
    ) {
        Spacer(Modifier.width(16.dp))
        for (i in 0..10) {
            EventCategoryCard()
            Spacer(Modifier.width(16.dp))
        }
    }
}

@Composable
fun EventCategoryCard(
    modifier:  Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .size(width = 96.dp, height = 64.dp)
            .background(
                color = AppTheme.colors.primaryBackground,
                shape = AppTheme.shapes.stretchedRow,
            )
            .border(
                width = 1.dp,
                color = AppTheme.colors.borderOutline,
                shape = AppTheme.shapes.stretchedRow
            )
            .padding(horizontal = 12.dp, vertical = 8.dp),
    ) {
        Icon(
            modifier = Modifier.size(size = 24.dp),
            imageVector = Music,
            contentDescription = "Music icon",
            tint = AppTheme.colors.primaryText
        )
        Text(
            modifier = Modifier.height(24.dp)
                .padding(top = 6.dp),
            text = "Music",
            color = AppTheme.colors.primaryText,
            style = AppTheme.typography.bodyLight14
        )
    }
}

@Preview
@Composable
fun EventCategoriesPreview() {
    AppTheme(
        colors = AppColorsDefault,
        shapes = AppShapesDefault,
        typography = AppTypographyDefault
    ) {
        EventCategories(
            modifier = Modifier
        )
    }
}