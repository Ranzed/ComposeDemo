package ru.ranzed.composedemo.ui.theme

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.ranzed.composedemo.ui.theme.AppTypographyTokens.bodyLight14
import ru.ranzed.composedemo.ui.theme.AppTypographyTokens.bodyLightMono14
import ru.ranzed.composedemo.ui.theme.AppTypographyTokens.headerBold32

val AppColorsDefault = AppColors(
    primaryText = Color(0xFF241F4E),
    accentText = Color(0xFF7061EF),
    secondaryText = Color(0xFF615D76),
    iconFill = Color(0xFF241F4E), // copy of primaryText
    divider = Color(0xFFEAE8F6),
    borderOutline = Color(0xFFEFF0F9),
    primaryBackground = Color(0xFFFFFFFF),
    accentLight = Color(0xFFE2E4FF),
)

val AppShapesDefault = AppShapes(
    smallCard = RoundedCornerShape(size = 8.0.dp),
    bigCard = RoundedCornerShape(size = 8.0.dp),
    accentedHeaderButton = CircleShape,
    chip = CircleShape,
    stretchedRow = RoundedCornerShape(size = 8.0.dp),
)

val AppTypographyDefault: AppTypography
    get() {
        // TODO remove Typography
        val typographyFromMaterial = Typography()
        return AppTypography(
            header1 = typographyFromMaterial.headlineLarge,
            header2 = typographyFromMaterial.headlineMedium,
            header3 = typographyFromMaterial.headlineSmall,
            body1 = typographyFromMaterial.bodyLarge,
            body2 =  typographyFromMaterial.bodyMedium,
            body3 = typographyFromMaterial.bodySmall,
            label1 = typographyFromMaterial.labelMedium,
            bodyLight14 = bodyLight14,
            bodyLightMono14 = bodyLightMono14,
            headerBold32 = headerBold32
        )
    }

internal var gradientBrush = Brush.verticalGradient(
    colorStops = arrayOf(
        0f to AppColorsDefault.accentLight,
        0.3f to AppColorsDefault.accentLight,
        0.8f to Color.White,
        1f to Color.White,
    )
)