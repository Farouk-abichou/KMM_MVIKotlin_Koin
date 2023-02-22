import com.arkivanov.mvikotlin.core.store.Store

 interface CalculatorStore : Store<CalculatorStore.Intent, CalculatorStore.State, Nothing> {

    sealed interface Intent {
        object Increment : Intent
        object Decrement : Intent
    }

    data class State(
        val value: Long = 0L
    )
}