package ru.ranzed.composedemo.ui.theme.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Music: ImageVector
    get() {
        if (_Music != null) {
            return _Music!!
        }
        _Music = ImageVector.Builder(
            name = "Music",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(9.49982f)
                curveTo(12.5822f, 9.186f, 12.0628f, 9f, 11.5f, 9f)
                curveTo(10.1193f, 9f, 9f, 10.1193f, 9f, 11.5f)
                curveTo(9f, 12.8807f, 10.1193f, 14f, 11.5f, 14f)
                curveTo(12.8807f, 14f, 14f, 12.8807f, 14f, 11.5f)
                verticalLineTo(7f)
                close()
                moveTo(11.5f, 10f)
                curveTo(12.3284f, 10f, 13f, 10.6716f, 13f, 11.5f)
                curveTo(13f, 12.3284f, 12.3284f, 13f, 11.5f, 13f)
                curveTo(10.6716f, 13f, 10f, 12.3284f, 10f, 11.5f)
                curveTo(10f, 10.6716f, 10.6716f, 10f, 11.5f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.4688f, 2.00098f)
                lineTo(5.46881f, 2.50098f)
                lineTo(5f, 3f)
                verticalLineTo(10.4998f)
                curveTo(4.5822f, 10.186f, 4.0628f, 10f, 3.5f, 10f)
                curveTo(2.1193f, 10f, 1f, 11.1193f, 1f, 12.5f)
                curveTo(1f, 13.8807f, 2.1193f, 15f, 3.5f, 15f)
                curveTo(4.8807f, 15f, 6f, 13.8807f, 6f, 12.5f)
                verticalLineTo(6.46974f)
                lineTo(13f, 6.03224f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(2.5f)
                lineTo(13.4688f, 2.00098f)
                close()
                moveTo(13f, 3.03223f)
                verticalLineTo(5.03029f)
                lineTo(6f, 5.46779f)
                verticalLineTo(3.46973f)
                lineTo(13f, 3.03223f)
                close()
                moveTo(3.5f, 11f)
                curveTo(4.3284f, 11f, 5f, 11.6716f, 5f, 12.5f)
                curveTo(5f, 13.3284f, 4.3284f, 14f, 3.5f, 14f)
                curveTo(2.6716f, 14f, 2f, 13.3284f, 2f, 12.5f)
                curveTo(2f, 11.6716f, 2.6716f, 11f, 3.5f, 11f)
                close()
            }
        }.build()
        return _Music!!
    }

private var _Music: ImageVector? = null


