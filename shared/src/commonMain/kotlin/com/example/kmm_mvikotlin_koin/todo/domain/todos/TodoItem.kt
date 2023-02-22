package com.example.kmm_mvikotlin_koin.todo.domain.todos

data class TodoItem(
    val id: Long = 0L,
    val text: String = "",
    val isDone: Boolean = false
)