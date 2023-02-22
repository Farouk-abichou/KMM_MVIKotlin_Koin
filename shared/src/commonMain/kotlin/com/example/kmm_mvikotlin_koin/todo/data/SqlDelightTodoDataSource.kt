package com.example.kmm_mvikotlin_koin.todo.data

import com.example.kmm_mvikotlin_koin.todo.domain.todos.TodoDataSource
import com.example.kmm_mvikotlin_koin.todo.domain.todos.TodoItem
import com.example.translator_kmm.database.TodoDatabase
import com.squareup.sqldelight.runtime.coroutines.asFlow
import com.squareup.sqldelight.runtime.coroutines.mapToList
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class SqlDelightTodoDataSource(
    db: TodoDatabase
): TodoDataSource {

    private val queries = db.todoQueries

    override fun getTodos(): Flow<List<TodoItem>> {
        return queries
            .getTodos()
            .asFlow()
            .mapToList()
            .map { todo ->
                todo.map { it.toTodoItem() }
            }

    }

    override suspend fun insertTodoItem(item: TodoItem) {
        queries.insertTodo(
            id = item.id,
            text = item.text,
            isDone = item.isDone.toString()
        )
    }
}