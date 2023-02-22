package com.example.kmm_mvikotlin_koin.todo.data.local

import com.squareup.sqldelight.db.SqlDriver

expect class DatabaseDriverFactory {

    fun create():SqlDriver
}