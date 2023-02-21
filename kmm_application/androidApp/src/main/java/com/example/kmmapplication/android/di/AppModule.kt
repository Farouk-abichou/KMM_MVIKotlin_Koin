package com.example.kmmapplication.android.di

import android.app.Application
import com.example.kmmapplication.data.local.DatabaseDriverFactory
import com.example.kmmapplication.data.note.SqlDelightNoteDataSource
import com.example.kmmapplication.database.NoteDatabase
import com.example.kmmapplication.domain.note.NoteDataSource
import com.squareup.sqldelight.db.SqlDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSqlDriver(app: Application): SqlDriver {
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun provideNoteDataSource(driver: SqlDriver): NoteDataSource {
        return SqlDelightNoteDataSource(NoteDatabase(driver))
    }
}