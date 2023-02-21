package com.example.kmmapplication.android.note_detail

data class NoteDetailState(
    val noteTitle : String = "",
    val noteContent : String = "",
    val isNoteTitleHintVisible : Boolean =false,
    val isNoteContentHintVisible : Boolean =false,
    val noteColor : Long = 0xFFFFFF,

)
