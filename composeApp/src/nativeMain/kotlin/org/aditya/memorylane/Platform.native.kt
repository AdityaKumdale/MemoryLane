package org.aditya.memorylane

import platform.Foundation.NSURL

actual class Uri(private val iosUrl: NSURL) {

    actual val scheme: String get() = iosUrl.scheme ?: ""
    actual val host: String get() = iosUrl.host ?: ""
    actual val path: String get() = iosUrl.path ?: ""
    actual val fullUri: String get() = iosUrl.absoluteString ?: ""

    actual companion object {
        actual fun fromString(uriString: String): Uri = Uri(NSURL(string = uriString)!!)
    }
}
