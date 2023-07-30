package com.example.myfirstapp1

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NullPointerException

fun main(args:Array<String>){
    // val str = getNumber("10.5")
    // println(str)

    // // // // //

     try {
         val a = IntArray(5)
         a[5] = 10/0
     }catch (e:ArithmeticException){
         println("arithmetic exception catch")
     }catch (e:ArrayIndexOutOfBoundsException){
         println("array index outofbounds exception")
     }catch (e:Exception){
         println("parent exception class")
     }
        println("code after try catch...")

    // // // // // // //

    try {
        // codde block
        try {
            // code block
        }catch (e:ArrayIndexOutOfBoundsException){
            // exception
        }
    } catch (e:ArrayIndexOutOfBoundsException){
        // exception
    }

    // // // // // //

    try {
        val data = 10/5
        println(data)
    }catch (e:NullPointerException){
        println(e)
    }finally {
        println("finally block always executes")
    }
    println("below code")

    // // // // // // //

    validate(15)
    println("code after validation check ...")

}
fun getNumber(str:String):Int{
    return try {
        Integer.parseInt(str)
    } catch (e:ArithmeticException){
        0
    }
}

fun validate(age:Int){
    if (age<18)
        throw ArithmeticException("under age")
    else
        println("eligible for drive")
}