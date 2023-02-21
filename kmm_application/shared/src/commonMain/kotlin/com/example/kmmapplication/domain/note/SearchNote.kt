package com.example.kmmapplication.domain.note

import com.example.kmmapplication.domain.time.DateTimeUtil

class SearchNote {
    fun executeFilterNotes(notes : List<Note> , query: String): List<Note> {
        if (query.isBlank()) {
            return notes
        }
        return notes.filter {
            it.title.trim().lowercase().contains(query.lowercase()) ||
                    it.content.trim().lowercase().contains(query.lowercase())
        }
    }
    fun executeSortNotes(notes : List<Note> , query: String):List<Note>{
        return notes.sortedBy {
            DateTimeUtil.toEpochMillis(it.created)
        }
    }
}
