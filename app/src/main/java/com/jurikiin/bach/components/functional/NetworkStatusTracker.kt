package com.jurikiin.bach.components.functional

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import com.jurikiin.bach.util.NetworkConnectionUtil

@Composable
fun NetworkStatusTracker(
    update: @Composable (isOnline: Boolean) -> Unit
) {
    var isOnline by remember { mutableStateOf(true) }
    val context = LocalContext.current

    LaunchedEffect(context) {
        isOnline = NetworkConnectionUtil.isNetworkAvailable(context)

        NetworkConnectionUtil.onConnectionChanged(context) {
            isOnline = it
        }
    }

    update(isOnline)
}
