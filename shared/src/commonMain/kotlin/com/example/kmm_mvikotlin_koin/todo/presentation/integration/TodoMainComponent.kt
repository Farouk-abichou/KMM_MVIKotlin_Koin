package com.example.kmm_mvikotlin_koin.todo.presentation.integration

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.mvikotlin.core.instancekeeper.getStore
import com.arkivanov.mvikotlin.core.store.StoreFactory
import com.badoo.reaktive.base.Consumer
import com.badoo.reaktive.base.invoke
import com.example.kmm_mvikotlin_koin.todo.presentation.TodoMain
//
//class TodoMainComponent(
//    componentContext: ComponentContext,
//    storeFactory: StoreFactory,
//    database: TodoSharedDatabase,
//    private val output: Consumer<TodoMain.Output>
//) : TodoMain, ComponentContext by componentContext {
//
//    private val store =
//        instanceKeeper.getStore {
//            TodoMainStoreProvider(
//                storeFactory = storeFactory,
//                database = TodoMainStoreDatabase(database = database)
//            ).provide()
//        }
//
////    override val models: Value<TodoMain.Model> = store.asValue().map(stateToModel)
//
//    override fun onItemClicked(id: Long) {
//        output(TodoMain.Output.Selected(id = id))
//    }
//
//    override fun onItemDoneChanged(id: Long, isDone: Boolean) {
////        store.accept(Intent.SetItemDone(id = id, isDone = isDone))
//    }
//
//    override fun onItemDeleteClicked(id: Long) {
////        store.accept(Intent.DeleteItem(id = id))
//    }
//
//    override fun onInputTextChanged(text: String) {
////        store.accept(Intent.SetText(text = text))
//    }
//
//    override fun onAddItemClicked() {
////        store.accept(Intent.AddItem)
//    }
//}