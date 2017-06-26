package com.example.poarry.kotlinsimples

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello Kotlin")

        println("sum:" + sum(4, 2))

        println("sum of inferred  is ${sumInferred(6, 10)}")

        printSum(3, 5)

        printSumOmitted(5, 2)


        val a: Int = 1
        val b = 3
        val c: Int
        c = 3
        println("a=$a b=$b c=$c")

        println("==================================")
        val basicSyntax = BasicSyntax()
        println("==================================")

        basicSyntax.StrFun()
        basicSyntax.helloworld("Poarry")

        println("maxOf " + basicSyntax.maxOf(5, 8))
        println("maxOf " + basicSyntax.maxOfExpress(5, 8))

        /**
         * Using nullable values and checking for null
         */
        val str: String = "3"
        val nullStr: String = "ee"
        println("parse String  " + basicSyntax.parseInt(str))
        println("parse String  " + basicSyntax.parseInt(nullStr))

        basicSyntax.printProduct("2", "3")
        basicSyntax.printProduct("2", "c")

        /**
         * Using type checks and automatic casts
         */
        basicSyntax.getLength("2392eqwudgqsd823")
        basicSyntax.getLength(10)
        basicSyntax.getLength(listOf(Any()))


        /**
         * for loop
         */

        val list = listOf<String>("item", "ss", "apple", "xiaomi")
        printString("list start")
        for (item in list) {
            printString(item)
        }
        printString("list end")

        for (index in list.indices) {
            println("list in position $index value is ${list[index]}")
        }

        /**
         * while  loop
         */
        printString("while loop")
        var index: Int = 0
        while (index < list.size) {
            println(" list data in $index value is ${list[index]}")
            index++
        }

        /**
         * Use  when expression
         */
        printString(" use when expression")
        var whenResult = basicSyntax.useEWhenExpression(1)
        printString(whenResult)
        whenResult = basicSyntax.useEWhenExpression(2)
        printString(whenResult)
        whenResult = basicSyntax.useEWhenExpression(299933L)
        printString(whenResult)
        whenResult = basicSyntax.useEWhenExpression("Hello")
        printString(whenResult)
        whenResult = basicSyntax.useEWhenExpression(nullStr)
        printString(whenResult)
        whenResult = basicSyntax.useEWhenExpression(3)
        printString(whenResult)


        /**
         * use ranges
         */
        printString("use ranges")
        val x=10
        val y=32
        if (x in  1..y ){
            printString("x in y ranges")
        }else{
            printString("s not in y ranges")
        }

        if (-1 !in 0..list.lastIndex){
            printString("-1 is out of list size ranges")
        }


        printString("==============Iterating over a range:========")
        for (index in 0..5){
            printInt(index)
        }
        printString("==============Iterating over a progression:========")
        for (index in 0..10 step 3)
            println(index)
        printString("==============Iterating over a progression downTo:========")
        for (index in 12 downTo 0 step 3){
            println(index)
        }
        printString("==============Iterating over a progression until:========")
        for (index in 0 until 13 step 2){
            println(index)
        }

        /**
         * use Collections
         */
        val items= setOf("apple","banana","orange")
        when{
            "peak" in items -> println("juicy")
            "apple" in items-> println("apple is fine too")
        }

    }


    fun printInt(newValue: Int) {
        println("value is" + newValue)
    }

    fun printString(str: String) {
        println(str)
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sumInferred(a: Int, b: Int) = a + b

    /**
     * The type with only one value: the Unit object. This type corresponds to the `void` type in Java.
     */
    fun printSum(a: Int, b: Int): Unit {
        println("Sum of $a and $b is ${a + b}")
    }

    fun printSumOmitted(a: Int, b: Int) {
        println("Sum of $a and $b is ${a + b}")
    }

}
