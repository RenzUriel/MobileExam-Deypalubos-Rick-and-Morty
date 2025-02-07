package com.example.rickandmorty.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.shapes


private val DarkColorPalette = darkColorScheme(
    primary = Color(0xFF00BCD4), // Your primary color
    onPrimary = Color.White, // Text color for primary elements
    secondary = Color(0xFF424242), // Dark grey background color for cards
    onSecondary = Color.White, // Text color for card items
    background = Color.Black, // Black background for the app
    onBackground = Color.White, // Text color on the background
    surface = Color(0xFF121212), // Surface dark color
    onSurface = Color.White // Text color on surface elements
)

@Composable
fun RickAndMortyTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorPalette,
        typography = Typography,
        shapes = shapes,
        content = content
    )
}
