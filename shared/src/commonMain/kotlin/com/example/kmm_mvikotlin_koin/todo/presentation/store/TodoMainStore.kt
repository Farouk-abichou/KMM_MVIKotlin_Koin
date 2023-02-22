package com.example.kmm_mvikotlin_koin.todo.presentation.store

import com.arkivanov.mvikotlin.core.store.Store
import com.example.kmm_mvikotlin_koin.todo.domain.todos.TodoItem
import com.example.kmm_mvikotlin_koin.todo.presentation.store.TodoMainStore.State
import com.example.kmm_mvikotlin_koin.todo.presentation.store.TodoMainStore.Intent


internal interface TodoMainStore : Store<Intent, State, Nothing> {

    sealed class Intent {
        data class SetItemDone(val id: Long, val isDone: Boolean) : Intent()
        data class DeleteItem(val id: Long) : Intent()
        data class SetText(val text: String) : Intent()
        object AddItem : Intent()
    }

    data class State(
        val items: List<TodoItem> = emptyList(),
        val text: String = ""
    )
}