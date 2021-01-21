package com.bort.ktest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("berttest ln")



        //hashmap
        var map = hashMapOf<Int,Int>()
        map.put(1,2)
        map.put(2,3)

        if(map.containsKey(3)){
            map[3] = map[3]?.plus(1)!!
        }
        else{
            map[3] = 0
        }

        for ((key, value) in map) {
            println("array print ${map[key]}")
        }
        //array
        val ar = intArrayOf(1, 2, 3)
        var arr = arrayOfNulls<Int>(100)
        var arr2 = arrayOf(arrayOf(1,2,3),arrayOf(1,2,3),arrayOf(1,2,3))
        var out = arr2[1][1]
        println("berttest array ${arr2[1][1]}")
        for(a in ar){
            //blah
        }



        var socks = 0
        for ((key, value) in map) {
            socks = socks + (value/2)
        }

        var numint = 0
        for ((key, value) in map) {
            numint = numint + value/2
        }

        println("berttest numint: $numint")


        for((key,value) in map) numint = numint + value/2


        val testlist = arrayListOf(1,2,3,4)
        for(s:Int in testlist){
            print("al")
        }

        for (ch in "abc"){
            print(ch + 1)
        }

        for( c in 0 until 9){
            println("berttest c"+c)
        }

        //range for loop
        fun recognize(a:Char) = when (a) {
            in '0' until '9' -> "It's a digit"
            in 'a' .. 'z' -> "It's a letter"
            else -> "I don't know"
        }
        println("berttest recognize" + recognize('3'))


    }

    fun printy(msg: String = "berttest", size: Int = 40) {
        var x = 0

        repeat(4) {
            println(msg)
            x++
            println(x)
        }

        var a = 1
        var b = 2
        var c = 3

        //( a > b ) ? a=5:b=4

    }

    enum class Color { BLUE, ORANGE, RED}


    fun testy(color: Color): String =
            when (color) {
                Color.BLUE -> "cold"
                Color.ORANGE -> "warm"
                Color.RED -> "hot"
            }

    fun testy1(input: String) =
            when(input){
                "y","yes" -> "fuck you"
                "n","no" -> "suck it"
                else -> "fuck off"
            }

    fun testy2(input: String, input1: Int) =
            when(setOf(input,input1)){
                setOf("bitch", 0) -> "yes"
                setOf("fuck", 1) -> "no"
                else -> "haha"
            }


}