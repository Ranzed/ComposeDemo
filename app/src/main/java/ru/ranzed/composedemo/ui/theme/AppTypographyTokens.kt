package ru.ranzed.composedemo.ui.theme

import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp

internal object AppTypographyTokens {

    val defaultTextStyle = TextStyle.Default.copy(
        platformStyle = PlatformTextStyle(includeFontPadding = false),
        lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None),
    )

    val bodyLight14 = defaultTextStyle.copy(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp,
    )

    val bodyLightMono14 = defaultTextStyle.copy(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.W300,
        fontSize = 14.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp,
    )

    val headerBold32 = defaultTextStyle.copy(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.W700,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.2.sp,
    )
}