package com.kotlinconf.klem.myweatherapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform