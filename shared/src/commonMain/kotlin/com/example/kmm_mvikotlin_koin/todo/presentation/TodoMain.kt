package com.example.kmm_mvikotlin_koin.todo.presentation

import com.example.kmm_mvikotlin_koin.todo.domain.todos.TodoItem


interface TodoMain {
//    val models: Value<Model>

    fun onItemClicked(id: Long)
    fun onItemDoneChanged(id: Long, isDone: Boolean)
    fun onItemDeleteClicked(id: Long)
    fun onInputTextChanged(text: String)
    fun onAddItemClicked()
    data class Model(
        val items: List<TodoItem>,
        val text: String
    )

    sealed class Output {
        data class Selected(val id: Long) : Output()
    }
}