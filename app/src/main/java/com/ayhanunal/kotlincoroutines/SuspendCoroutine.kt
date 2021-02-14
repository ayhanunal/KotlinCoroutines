package com.ayhanunal.kotlincoroutines

import kotlinx.coroutines.*

fun main() {

    //suspend func :icerisinde corotine çalıştırılabilen fonksiyonlardır.

    runBlocking {
        delay(2000)
        println("Run Blocking")
        myFunction() //suspend old. icin dısarida çalıştıramayız.

    }



}

suspend fun myFunction() {

    coroutineScope {
        delay(4000)
        println("Suspend Function")
    }

}