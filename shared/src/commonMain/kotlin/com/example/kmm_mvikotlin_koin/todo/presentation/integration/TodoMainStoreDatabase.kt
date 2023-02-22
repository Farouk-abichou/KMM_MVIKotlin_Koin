package com.example.kmm_mvikotlin_koin.todo.presentation.integration

import com.badoo.reaktive.completable.Completable
import com.badoo.reaktive.observable.Observable
import com.badoo.reaktive.observable.mapIterable
import com.example.kmm_mvikotlin_koin.todo.domain.todos.TodoItem
//
//internal class TodoMainStoreDatabase(
//    private val database: TodoSharedDatabase
//) : TodoMainStoreProvider.Database {
//
//    override val updates: Observable<List<TodoItem>> =
//        database
//            .observeAll()
//            .mapIterable { it.toItem() }
//
//    private fun TodoItemEntity.toItem(): TodoItem =
//        TodoItem(
//            id = id,
//            order = orderNum,
//            text = text,
//            isDone = isDone
//        )
//
//    override fun setDone(id: Long, isDone: Boolean): Completable =
//        database.setDone(id = id, isDone = isDone)
//
//    override fun delete(id: Long): Completable =
//        database.delete(id = id)
//
//    override fun add(text: String): Completable =
//        database.add(text = text)
//}