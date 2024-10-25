package org.aditya.memorylane

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()


actual class Uri(private val androidUri: android.net.Uri) {

    actual val scheme: String get() = androidUri.scheme ?: ""
    actual val host: String get() = androidUri.host ?: ""
    actual val path: String get() = androidUri.path ?: ""
    actual val fullUri: String get() = androidUri.toString() // Convert to string for Room compatibility

    actual companion object {
        actual fun fromString(uriString: String): Uri = Uri(android.net.Uri.parse(uriString))
    }
}