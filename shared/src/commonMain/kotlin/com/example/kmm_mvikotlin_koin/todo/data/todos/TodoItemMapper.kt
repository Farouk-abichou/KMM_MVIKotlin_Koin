package com.example.kmm_mvikotlin_koin.todo.data.todos

import com.example.kmm_mvikotlin_koin.todo.domain.todos.TodoItem
import database.TodoEntity

fun TodoEntity.toTodoItem(): TodoItem{
    return TodoItem(
        id = id,
        text = text
    )
}