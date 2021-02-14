package com.ayhanunal.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Light Weightness --- Threadlere göre daha hafiftir.

        /*
        GlobalScope.launch {
            //tekrar et - islemi 100 000 kere tekrar et.
            repeat(100000) {
                launch {
                    println("android")
                }
            }
        }

        //bu islemi 100 000 thread ile olusturmak isteseydik app çökerdi.

         */


        //Scope : corotine in nerede calistirilacagini ve kapsamını belirler.
        //Global Scope : bütün app içinde çalıştırabileceğimiz kapsamdır. bütün uygulamayı kapsar. //en yukarıda ki örnek glabalScope örneğidir.
        //runBlocking : scope ları bloklayarak olusturur. Tek bir işlem tek bir corotine çalışıcaksa kullanılabilir.

        //gercek uygulamalarda yukardakiler pek kullanılmaz.

        //CoroutineScope : genelde gercek applerde bu kullanılır.


        /*
        //runBlocking örnegi
        println("run blocking start.")
        runBlocking {
            //launch : yeni corotine baslatır, icinde bulundugu threadi bloklamaz.
            launch {
                //delay geciktirmek icin kullanılır.
                delay(5000)
                println("run blocking")
            }
        }
        println("run blocking end.")

        //burada önce run blocking start çalışır 5sn sonra run blocking çalışır hemen sonra run blocking end çalıışır. yani end den önceki kısım bloklanır.

         */


        /*
        //GlobalScope
        println("Global Scope start.")
        GlobalScope.launch {
            delay(5000)
            println("Global Scope")
        }
        println("Global Scope end.")

        //burada ise önce Global Scope start çalışır hemen sonra Global Scope end çalışır 5sn sonra ise Global Scope kısmı çalışır.


         */

        /*
        //corouineScope
        //coroutine contex nedir ? :scope coroutine leri olsutururur ve manage eder. context ise kimlerle çalısıcagını belirler.
        println("Coroutine Scope Start.")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("Coroutine Scope")
        }
        println("Coroutine Scope End.")

        //burda da global scope da oldugu gibi start ve end hemen çalışır 5sn sonra Coroutine Scope çalışır.
        //ancak fark olarak global scope tum uygulamada çalıştırılırken biz burada Dispatchers.Default ile hangi thread de çalışıcagını belirtmiş olduk.


         */






    }




}