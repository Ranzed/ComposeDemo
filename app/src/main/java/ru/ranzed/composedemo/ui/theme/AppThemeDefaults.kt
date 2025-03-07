package ru.ranzed.composedemo.ui.theme

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

val AppColorsDefault = AppColors(
    primaryText = Color(0xFF241F4E),
    accentText = Color(0xFF7061EF),
    secondaryText = Color(0xFF615D76),
    iconFill = Color(0xFF241F4E), // copy of primaryText
    divider = Color(0xFFEAE8F6),
    borderOutline = Color(0xFFEFF0F9),
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
            label1 = typographyFromMaterial.labelMedium
        )
    }