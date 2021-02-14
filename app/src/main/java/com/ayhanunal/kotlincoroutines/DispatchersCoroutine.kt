package com.ayhanunal.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    //Dispatchers :hangi threadlerde çalışmamıza olanak sağlar.

    //Dispatchers.Default :Cpu yoğun işlemlerde kullanılır. (Görsel işleme, çok büyük bir diziyi sort etme...)

    //Dispatchers.IO :Networking işlemleri (netten veri çekme, veri tabanından veri getirme, Retrofit....)

    //Dispatchers.Main :UI yani kullanıcı arayüzü ile ilgili işlemleri bu thread üzerinden yaparız.

    //Dispatchers.Unconfined :inheritted dispatchers, çalıştırılan yere göre değişiyor yani kendi ayarlıyor.


    runBlocking {
        launch(Dispatchers.Main) {
            println("Main Thread :${Thread.currentThread().name}")

        }


        launch(Dispatchers.IO) {
            println("IO Thread :${Thread.currentThread().name}")
        }


        launch(Dispatchers.Default) {
            println("Default Thread :${Thread.currentThread().name}")
        }


        launch(Dispatchers.Unconfined) {
            println("Unconfined Thread :${Thread.currentThread().name}")
        }
    }

    //not: bu bir kotlin file oldugu icin icinde main thread yok o yuzden Dispatchers.Main kısmı hata verecektir.
    //oyuzden bu denemeyi MainActivity icinde çalıştırmamız gerekiyor.







}