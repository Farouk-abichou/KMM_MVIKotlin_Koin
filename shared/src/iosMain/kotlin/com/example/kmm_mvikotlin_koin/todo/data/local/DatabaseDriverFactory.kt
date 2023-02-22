package com.example.kmm_mvikotlin_koin.todo.data.local

import com.example.translator_kmm.database.TodoDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver


actual class DatabaseDriverFactory(
) {
    actual fun create(): SqlDriver {
        return NativeSqliteDriver(TodoDatabase.Schema, "todo.db")
    }
}