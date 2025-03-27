package ru.ranzed.composedemo.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle

data class AppColors(
    val primaryText: Color,
    val accentText: Color,
    val secondaryText: Color,
    val iconFill: Color,
    val divider: Color,
    val borderOutline: Color,
    val primaryBackground: Color,
    val accentLight: Color,
)

class AppShapes(
    val smallCard: Shape,
    val bigCard: Shape,
    val accentedHeaderButton: Shape,
    val chip: Shape,
    val stretchedRow: Shape,
)

class AppTypography(
    val header1: TextStyle,
    val header2: TextStyle,
    val header3: TextStyle,
    val body1: TextStyle,
    val body2: TextStyle,
    val body3: TextStyle,
    val label1: TextStyle,
    val bodyLight14: TextStyle,
    val bodyLightMono14: TextStyle,
    val headerBold32: TextStyle,
)

 val LocalAppColors = staticCompositionLocalOf<AppColors> {
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