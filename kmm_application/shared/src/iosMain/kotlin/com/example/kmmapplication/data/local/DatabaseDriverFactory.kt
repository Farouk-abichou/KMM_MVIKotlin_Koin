package com.example.kmmapplication.data.local

import com.example.kmmapplication.database.NoteDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {
    actual fun createDriver() : SqlDriver {
        return NativeSqliteDriver(NoteDatabase.Schema, "note.db")
    }
}