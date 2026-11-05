package com.example.emptyactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment // ARREGLADO: Faltaba este import para que reconozca 'Alignment'
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.emptyactivity.ui.theme.EmptyActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EmptyActivityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingText(
                        menssage = "Happy Birthday Sam!",
                        modifier = Modifier.padding(innerPadding) // Aplica el padding del Scaffold aquí
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(menssage: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(), // ARREGLADO: Usamos 'modifier' en minúscula que viene por parámetro
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = menssage
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EmptyActivityTheme {
        GreetingText("Android")
    }
}
