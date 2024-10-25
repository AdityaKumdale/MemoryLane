package org.aditya.memorylane

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect class Uri {

    val scheme: String
    val host: String
    val path: String
    val fullUri: String // Full URI as a string for conversions

    companion object {
        fun fromString(uriString: String): Uri
    }
}
