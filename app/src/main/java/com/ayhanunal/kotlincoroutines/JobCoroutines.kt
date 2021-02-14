package com.ayhanunal.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {


    //job :sonucunda bir iş donduruluyor ve biz onu kontrol edebiliriz.

    runBlocking {

        val myJob = launch {
            delay(2000)
            println("job")
            val secondJob = launch {
                println("job 2")
            }

        }

        myJob.invokeOnCompletion {
            //my job bittiginde ne yapılacagını yaz.
            println("my job end.")
        }

        myJob.cancel() //bunu yazdığımızda direkt my job end yazar çünkü 2sn bekelemeden direkt iptal eder.
        //not :bir job iptal edildiğinde içindeki job da iptal edilir. yani job 2 de gider.


    }


}