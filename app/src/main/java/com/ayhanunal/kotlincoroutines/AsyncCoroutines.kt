package com.ayhanunal.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    var userName = ""
    var userAge = 0

    //ornegin netten 2 tane veri indiriyoruz adı ve yası ama ne zmaan indirecegimiz belli değil. async kullanıcaz.

    runBlocking {

        /*
        launch {
            val downloadedName = downloadName()
            userName = downloadedName
        }

        launch {
            val downloadedAge = downloadAge()
            userAge = downloadedAge
        }

        launch {
            println("${userName} -- ${userAge}")
            //bu sekilde yapsaydık isim bos ve yas 0 gelir. Oyuzden async yapmamız gerekiyor.
        }

         */

        val downloadedName = async {
            downloadName()
        }

        val downloadedAge = async {
            downloadAge()
        }

        userName = downloadedName.await()
        userAge = downloadedAge.await()

        println("${userName} -- ${userAge}")

        //bu sekilde yaparsak islemler bekleneceği icin olması gereken degerleri görürüz.







    }


}


suspend fun downloadName() : String {

    delay(2000)
    val userName = "Ayhan :"
    println("username downloaded")
    return userName

}

suspend fun downloadAge() : Int {

    delay(2000)
    val userAge = 22
    println("userage downloaded")
    return userAge

}