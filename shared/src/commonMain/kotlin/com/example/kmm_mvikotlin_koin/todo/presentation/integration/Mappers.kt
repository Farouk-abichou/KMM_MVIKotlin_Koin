package com.example.kmm_mvikotlin_koin.todo.presentation.integration

import com.example.kmm_mvikotlin_koin.todo.presentation.TodoMain.Model
import com.example.kmm_mvikotlin_koin.todo.presentation.store.TodoMainStore.State



internal val stateToModel: (State) -> Model =
    {
        Model(
            items = it.items,
            text = it.text
        )
    }