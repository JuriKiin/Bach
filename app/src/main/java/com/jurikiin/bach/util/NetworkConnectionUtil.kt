package com.jurikiin.bach.util

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest

object NetworkConnectionUtil {
    fun isNetworkAvailable(context: Context): Boolean = context.connectivityManager().activeNetwork
        ?.let(context.connectivityManager()::getNetworkCapabilities)
        ?.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) == true

    fun onConnectionChanged(
        context: Context,
        request: NetworkRequest = networkRequest(),
        doOnChange: (isOnline: Boolean) -> Unit = {}
    ) = context.connectivityManager().registerNetworkCallback(request, networkCallback(doOnChange))

    private fun Context.connectivityManager() =
        this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    private fun networkCallback(onResult: (isOnline: Boolean) -> Unit) =
        object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                onResult(true)
            }

            override fun onLost(network: Network) {
                onResult(false)
            }
        }

    private fun networkRequest() = NetworkRequest.Builder()
        .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
        .build()
}
