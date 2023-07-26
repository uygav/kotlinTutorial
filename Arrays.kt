package com.example.myfirstapp1

fun main(){
    // val numbers : IntArray = intArrayOf(1,2,3,4,5)
    // val numbers = intArrayOf(1,2,3,4,5)
    val numbers = arrayOf(1,2,3,4,5,6)
    // println(numbers.contentToString())
    for (element in numbers){
    //     println("$element + 2 = ${element+2}" )
    }
    // println(numbers[3])
    numbers[0] = 5
    numbers[3] = 3 // you can change values like this
    val numbersD : DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0)
    val days = arrayOf("sun","mon","tues","wed","thurs","fri","sat")

    val fruits = arrayOf(Fruit("apple",2.5), Fruit("grape",3.5))
    // println(fruits.contentToString())

    for (fruit in fruits){
        // println("${fruit.name}")
    }
    for (index in fruits.indices){
        // println("${fruits[index].name} is in index ${index}")
    }

    val mix = arrayOf("sunday", "monday","tuesday",1,2,3,Fruit("apple",2.5))
    println(mix.contentToString())
}

data class Fruit(val name : String, val price:Double)