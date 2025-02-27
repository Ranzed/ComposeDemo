package ru.ranzed.composedemo.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

class AppColors(
    val primaryTextColor: Color
)

class AppShapes()

class AppTypography()

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
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalAppColors provides colors, // from params
        LocalAppShapes provides AppShapes() // fixed
    ) {
        MaterialTheme(content = content)
    }

}