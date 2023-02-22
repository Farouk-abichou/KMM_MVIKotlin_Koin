package com.example.kmm_mvikotlin_koin.android

import CalculatorStore
import CalculatorStoreFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kmm_mvikotlin_koin.Greeting

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
                        Button(text = "+"){
                            CalculatorStore.Intent.Increment
                        }
                        Number(text = "${CalculatorStore.State()}")
                        Button(text = "-"){
                            CalculatorStore.Intent.Decrement

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Button(
    text: String,
    onClick:() -> Unit
) {
    Button(text = text){
        onClick
    }
}

@Composable
fun Number(text: String) {
    Text(text = text)
}



