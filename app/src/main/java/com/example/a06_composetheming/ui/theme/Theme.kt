package com.example.a06_composetheming.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Red300,
    primaryVariant = Red700,
    onPrimary = Color.Black,
    secondary = Red300,
    onSecondary = Color.Black,
    error = Red200

)

// Here we use the lightColors function to build our Colors, this provides sensible
// defaults so we don't have to specify all colors that make up a Material color palette.
// For example, notice that we haven't specified a background color or many of the ‘on' colors, we'll use the defaults.
private val LightColorPalette = lightColors(
    primary = Red700,
    primaryVariant = Red900,
    onPrimary = Color.White,
    secondary = Red700,
    secondaryVariant = Red900,
    onSecondary = Color.White,
    error = Red800

)

// Our own custom theme for this project
@Composable
fun JetnewsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable ()->Unit
) {
    MaterialTheme(
        colors = if(darkTheme) DarkColorPalette else LightColorPalette, // using our own colors
        typography = JetnewsTypography, // using our own type
        shapes = JetnewsShapes, // using our own shape
        content = content
    )
}


@Composable
fun A06_ComposeThemingTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    // decide which set of color to use for the app
    val colors = if (darkTheme) {
                        DarkColorPalette
                    } else {
                        LightColorPalette
                    }

    // actual theming using MaterialTheme composable with colors, Typography, and Shapes which
    // are defined, and can redefined in Color.kt, Type.kt, and Shape.kt files. To apply the
    // theme attribute to our project, we can call MaterialTheme.xxx.yyy, where xxx can be colors
    // typography, or shapes.
    MaterialTheme(
        colors = colors,
        content = content
    )
}

