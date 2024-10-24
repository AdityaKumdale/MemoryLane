package org.aditya.memorylane

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform