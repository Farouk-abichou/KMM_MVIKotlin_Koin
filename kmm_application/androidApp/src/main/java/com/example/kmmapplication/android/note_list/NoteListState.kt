package com.example.kmmapplication.android.note_list

import com.example.kmmapplication.domain.note.Note

data class NoteListState(
    val notes : List<Note> = emptyList(),
    val searchText : String = "",
    val isSearchActive : Boolean = false,

    )
