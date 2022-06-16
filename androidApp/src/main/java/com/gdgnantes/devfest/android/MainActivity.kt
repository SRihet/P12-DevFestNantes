package com.gdgnantes.devfest.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gdgnantes.devfest.Greeting
import com.gdgnantes.devfest.android.ui.theme.DevFest_NantesTheme
import dagger.hilt.android.AndroidEntryPoint

fun greet(): String {
    return Greeting().greeting()
}

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevFest_NantesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingLayout()
                }
            }
        }
    }
}

@Composable
fun GreetingLayout() {
    Text(text = greet())
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DevFest_NantesTheme {
        GreetingLayout()
    }
}