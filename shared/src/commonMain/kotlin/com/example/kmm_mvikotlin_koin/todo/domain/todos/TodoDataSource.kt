package com.example.kmm_mvikotlin_koin.todo.domain.todos

import kotlinx.coroutines.flow.Flow


interface TodoDataSource {

    fun getTodos() : Flow<List<TodoItem>>

    suspend fun insertTodoItem(item: TodoItem)
}