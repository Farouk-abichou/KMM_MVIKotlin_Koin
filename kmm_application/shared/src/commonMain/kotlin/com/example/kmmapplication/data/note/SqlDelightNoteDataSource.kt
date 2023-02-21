package com.example.kmmapplication.data.note

import com.example.kmmapplication.database.NoteDatabase
import com.example.kmmapplication.domain.note.Note
import com.example.kmmapplication.domain.note.NoteDataSource
import com.example.kmmapplication.domain.time.DateTimeUtil

class SqlDelightNoteDataSource(db : NoteDatabase): NoteDataSource {

    private val queries = db.noteQueries

    override suspend fun insertNote(note: Note) {
        queries.insertNote(
            id = note.id,
            title = note.title,
            content = note.content,
            colorHex = note.colorHex,
            created = DateTimeUtil.toEpochMillis(note.created)
        )
    }

    override suspend fun getNoteById(id: Long): Note? {
        return queries
            .getNoteById(id)
            .executeAsOneOrNull()
            ?.toNote()
    }

    override suspend fun getAllNotes(): List<Note> {
        return queries
            .getAllNotes()
            .executeAsList()
            .map { it.toNote() }
    }

    override suspend fun deleteNoteById(id: Long) {
        queries.deleteNoteById(id)
    }
}