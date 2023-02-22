
import com.arkivanov.mvikotlin.core.store.Reducer
import com.arkivanov.mvikotlin.core.store.Store
import com.arkivanov.mvikotlin.core.store.StoreFactory
import com.arkivanov.mvikotlin.core.store.create

 class CalculatorStoreFactory(private val storeFactory: StoreFactory) {

    fun create(): CalculatorStore =
        object : CalculatorStore, Store<CalculatorStore.Intent, CalculatorStore.State, Nothing> by storeFactory.create(
            name = "CounterStore",
            initialState = CalculatorStore.State(),
            reducer = ReducerImpl
        ) {
        }

     object ReducerImpl : Reducer<CalculatorStore.State, CalculatorStore.Intent> {
        override fun CalculatorStore.State.reduce(msg: CalculatorStore.Intent): CalculatorStore.State =
            if (msg == CalculatorStore.Intent.Increment){
                copy(value = value + 1L)
            }else{
                copy(value = value - 1L)
            }
//            when (msg) {
//                is CalculatorStore.Intent.Increment -> copy(value = value + 1L)
//                is CalculatorStore.Intent.Decrement -> copy(value = value - 1L)
//            }

    }
}