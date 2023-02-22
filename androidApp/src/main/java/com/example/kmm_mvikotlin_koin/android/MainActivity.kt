package com.example.kmm_mvikotlin_koin.android

import CalculatorStore
import CalculatorStoreFactory
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kmm_mvikotlin_koin.Greeting
import kotlinx.coroutines.coroutineScope

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    Row() {
                        TextButton(onClick = { Log.d("hello","${CalculatorStore.State().value}") }) {
                            Text(text = "+")
                        }

                        Number(text = "${CalculatorStore.State()}")
                        TextButton(onClick = { CalculatorStore.Intent.Increment }) {
                            Text(text = "-")
                        }
                    }
                }
            }
        }
    }
}


suspend fun changeValue (){
    coroutineScope {
        CalculatorStore.Intent.Increment
    }
}
@Composable
fun Number(text: String) {
    Text(text = text)
}



