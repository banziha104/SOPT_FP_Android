package com.example.iyeongjun.soptfp2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

fun myFunction(){

}
class MainActivity : AppCompatActivity() {

    var list : ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for ( i in 0..500){ list.add("$i") }

        var resultList : ArrayList<Int> = ArrayList()

        for ( i in list){
            var temp = i.toInt()
            if(temp % 2 == 0){
                resultList.add(temp)
            }
        }
        var result = 0
        for (i in resultList){
            result += i
        }
        Log.d("resultPage","$result")

        var fpList = list
                .map { it.toInt() }
                .filter { it % 2 == 0 }
                .reduce{ num1, num2 ->
                     num1+num2
                }
        Log.d("resultPage","fp : $result")
    }
}
