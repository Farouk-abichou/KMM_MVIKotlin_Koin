package com.example.kmm_mvikotlin_koin

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform