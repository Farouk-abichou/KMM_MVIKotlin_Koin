package com.example.kmm_mvikotlin_koin.todo.data.local

import android.content.Context
import com.example.translator_kmm.database.TodoDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory(
    private val context: Context
) {
    actual fun create(): SqlDriver {
        return AndroidSqliteDriver(TodoDatabase.Schema, context, "todo.db")
    }
}