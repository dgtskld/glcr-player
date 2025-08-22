package dev.dgtskld.glcrplayer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform