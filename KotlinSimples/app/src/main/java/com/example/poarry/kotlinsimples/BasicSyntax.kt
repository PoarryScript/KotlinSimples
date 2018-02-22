package com.example.poarry.kotlinsimples

/**
 * Created by j-yangbo on 2017/6/26.
 */

class BasicSyntax {

    companion object new

    fun main(args: Array<String>) {

        val a = 1
        val s1 = "a is $a"
//        a = 2
        val s2 = "${s1.replace("is", "was")},but now is $a"
        println(s2)

        StrFun()


        helloworld("main")
    }

    fun StrFun() {
        val fooString = "new String is here"
        val fooXString = "new String with warp \nnew string"
        val fooTString = "new string with tab \t new String is here"

        println(fooString)
        println(fooXString)
        println(fooTString)

    }

    fun helloworld(name: String) {
        println("Hello,world $name")
    }

    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun maxOfExpress(a: Int, b: Int) = if (a > b) a else b


    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }


    fun printProduct(a: String, b: String) {
        val a1 = parseInt(a)
        val b1 = parseInt(b)
        if (a1 != null && b1 != null) {
            println(a1 * b1)
        } else {
            println("either $a or $b is not a number")
        }
    }

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            return obj.length
        }
        return null
    }

    fun getLength(obj: Any) {
        println("'$obj' string length is ${getStringLength(obj) ?: "error, not a str"}")
    }


    fun useEWhenExpression(obj: Any): String =
            when (obj) {
                1 -> "One"
                2 -> "Two"
                "Hello" -> "Greeting"
                is Long -> "Long data"
                !is String -> "not a String"
                else -> "others"
            }
}

