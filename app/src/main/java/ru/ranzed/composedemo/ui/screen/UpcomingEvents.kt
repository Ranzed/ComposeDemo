package ru.ranzed.composedemo.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ru.ranzed.composedemo.ui.theme.AppTheme

@Composable
fun UpcomingEvents(
    modifier: Modifier,
) {
    Column(modifier = modifier) {
        Spacer(modifier = Modifier.height(32.dp))
        UpcomingEventsHeader(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )
        Row(
            modifier = Modifier.horizontalScroll(state = rememberScrollState()),
            horizontalArrangement = Arrangement.Absolute.Left
        ) {
            Spacer(Modifier.width(16.dp))
            for (i in 0..10) {
                UpcomingEventCard()
                Spacer(Modifier.width(16.dp))
            }
        }
    }
}

@Composable
private fun UpcomingEventsHeader(
    modifier: Modifier,
) {
    Row(
        modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Upcoming events",
            color = AppTheme.colors.primaryText,
            style = AppTheme.typography.headerBold18,
        )
        Text(
            text = "See all events",
            color = AppTheme.colors.secondaryText,
            style = AppTheme.typography.label1,
        )
    }
}

@Composable
private fun UpcomingEventCard() {
    Column(

    ) {
        EventPosterWithData()
        Text(
            text = "Example event name",
            color = AppTheme.colors.primaryText,
            style = AppTheme.typography.body1
        )
        Text(
            text = "EUR 30 - EUR 80",
            color = AppTheme.colors.accentText,
            style = AppTheme.typography.body1
        )
    }
}

@Composable
private fun EventPosterWithData() {
    Box(
        modifier = Modifier.size(width = 200.dp, height = 160.dp)
    ) {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Green))
        Box(modifier = Modifier
            .offset(x = 8.dp, y = 8.dp)
            .size(size = 48.dp)
            .background(color = Color.Magenta))
    }
}