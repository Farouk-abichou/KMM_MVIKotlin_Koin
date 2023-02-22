package com.example.kmm_mvikotlin_koin.edit

import com.arkivanov.mvikotlin.core.store.Store

internal interface TodoEditStore : Store<TodoEditStore.Intent, TodoEditStore.State, TodoEditStore.Label> {

    sealed class Intent {
        data class AddToNumber(val number: Int) : Intent()
        data class IncreaseNumber(val number: Int) : Intent()
    }

    data class State(
        val number: Int = 0,
    )

    sealed class Label {
        data class Changed(val number: Number) : Label()
    }
}