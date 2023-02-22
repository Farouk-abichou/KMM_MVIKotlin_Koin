package com.example.kmm_mvikotlin_koin.edit

import com.arkivanov.mvikotlin.core.store.Reducer
import com.arkivanov.mvikotlin.core.store.SimpleBootstrapper
import com.arkivanov.mvikotlin.core.store.Store
import com.arkivanov.mvikotlin.core.store.StoreFactory
import com.arkivanov.mvikotlin.extensions.coroutines.CoroutineExecutor


internal class TodoEditStoreProvider(
    private val storeFactory: StoreFactory,
) {

    fun provide(): TodoEditStore =
        object : TodoEditStore, Store<TodoEditStore.Intent, TodoEditStore.State, TodoEditStore.Label> by storeFactory.create(
            name = "EditStore",
            initialState = TodoEditStore.State(),
            bootstrapper = SimpleBootstrapper(Unit),
            executorFactory = ::ExecutorImpl,
            reducer = ReducerImpl
        ) {}

    private sealed class Msg {
        data class Add(val number: Int) : Msg()
        data class Increase(val number: Int) : Msg()
    }

    private inner class ExecutorImpl : CoroutineExecutor<TodoEditStore.Intent, Unit, TodoEditStore.State, Msg, TodoEditStore.Label>() {
        override fun executeAction(action: Unit, getState: () -> TodoEditStore.State) {

        }

        override fun executeIntent(intent: TodoEditStore.Intent, getState: () -> TodoEditStore.State) =
            when (intent) {
                is TodoEditStore.Intent.AddToNumber -> addToNumber(number = intent.number, state = getState())
                is TodoEditStore.Intent.IncreaseNumber -> increaseNumber(number = intent.number, state = getState())
            }


        private fun addToNumber(number: Int, state: TodoEditStore.State) {
            dispatch(Msg.Add(number = number))
            publish(TodoEditStore.Label.Changed(number))
        }

        private fun increaseNumber(number: Int, state: TodoEditStore.State) {
            dispatch(Msg.Add(number = number))
            publish(TodoEditStore.Label.Changed(number))
        }


    }

    private object ReducerImpl : Reducer<TodoEditStore.State, Msg> {
        override fun TodoEditStore.State.reduce(msg: Msg): TodoEditStore.State =
            when (msg) {
                is Msg.Add -> copy(number = msg.number)
                is Msg.Increase -> copy(number = msg.number)
            }
    }

}