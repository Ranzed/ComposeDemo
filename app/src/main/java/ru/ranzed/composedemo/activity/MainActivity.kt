package ru.ranzed.composedemo.activity

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import ru.ranzed.composedemo.ui.theme.AppColors
import ru.ranzed.composedemo.ui.theme.AppShapes
import ru.ranzed.composedemo.ui.theme.AppTheme
import ru.ranzed.composedemo.ui.theme.AppTypography
import ru.ranzed.composedemo.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme(
                colors = AppColors(),
                shapes = AppShapes(),
                typography = AppTypography()
            ) {
                Box(
                    modifier = Modifier.fillMaxSize().background(Color.Cyan)
                )
            }
        }
        lifecycleScope.launch {
            viewModel.eventListFlow.collect {
                Log.d("TAG1", it.toString())
            }
        }
    }
}