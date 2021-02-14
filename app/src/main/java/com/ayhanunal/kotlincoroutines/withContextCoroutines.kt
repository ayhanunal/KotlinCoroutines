package com.ayhanunal.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {


    //baska thread den baska threade geçme.


    runBlocking {
        launch(Dispatchers.Default) {
            println("Context :${coroutineContext}")

            withContext(Dispatchers.IO) {
                println("Context :${coroutineContext}")
                
            }
        }

    }


}