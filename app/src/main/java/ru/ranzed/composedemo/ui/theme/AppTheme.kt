package ru.ranzed.composedemo.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape

class AppColors(
    val primaryText: Color,
    val accentText: Color,
    val secondaryText: Color,
    val iconFill: Color,
    val divider: Color,
    val borderOutline: Color,
)

class AppShapes(
    val smallCard: Shape,
    val bigCard: Shape,
    val accentedHeaderButton: Shape,
    val chip: Shape,
    val stretchedRow: Shape,
)

class AppTypography(
    val header1: Typography,
    val header2: Typography,
    val header3: Typography,
    val body1: Typography,
    val body2: Typography,
    val body3: Typography,
    val label1: Typography,
)

private val LocalAppColors = staticCompositionLocalOf<AppColors> {
    error("No AppColors provided")
}

private val LocalAppShapes = staticCompositionLocalOf<AppShapes> {
    error("No AppShapes provided")
}

private val LocalAppTypography = staticCompositionLocalOf<AppTypography> {
    error("No AppShapes provided")
}

object AppTheme {

    val colors: AppColors
        @Composable
        get() = LocalAppColors.current

    val shapes: AppShapes
        @Composable
        get() = LocalAppShapes.current

    val typography: AppTypography
        @Composable
        get() = LocalAppTypography.current
}


@Composable
fun AppTheme(
    colors: AppColors,
    shapes: AppShapes,
    typography: AppTypography,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalAppColors provides colors,
        LocalAppShapes provides shapes,
        LocalAppTypography provides typography
    ) {
        MaterialTheme(content = content)
    }

}