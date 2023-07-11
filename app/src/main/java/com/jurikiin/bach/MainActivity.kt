package com.jurikiin.bach

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.jurikiin.bach.components.functional.NetworkStatusTracker
import com.jurikiin.bach.components.ui.Card
import com.jurikiin.bach.components.ui.H1
import com.jurikiin.bach.components.ui.H2
import com.jurikiin.bach.ui.theme.BachTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BachTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    Modifier.verticalScroll(rememberScrollState()).fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    NetworkStatusTracker {
                        Card("Network Status") {
                            val connected = if (it) "Connected" else "Offline"
                            H2("Network Status: $connected")
                        }
                    }
                }
            }
        }
    }
}
