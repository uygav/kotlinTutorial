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
    // val days = arrayOf("sun","mon","tues","wed","thurs","fri","sat")

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






    /////////////////////////////////////////////// LIST /////////////////////////
    val months = listOf("january","february","march")
    val anyTypes = listOf(1,2,3,true,false,"string")
    // println(anyTypes.size)
    // println(months[1])

    for (month in months){
        // println(month)
    }

    val addionalMonths = months.toMutableList()
    val newMonths = arrayOf("april","may","june")
    addionalMonths.addAll(newMonths)
    addionalMonths.add("july")
    // println(addionalMonths)

    val days = mutableListOf<String>("mon","tue","wed")
    days.add("thu")
    days[2] = "sunday"
    days.removeAt(3)
    // println(days)
    val removeList = mutableListOf<String>("mon","wed")
    // days.removeAll(removeList)
    // days.removeAll(days)
    // println(days)

    //////////////////////// SETS AND MAPS //////////////////////

    val a = setOf("orange","apple","mango","grape","apple","orange")
    // println(a.size)
    // println(a)
    // println(a.toSortedSet())

    val newFruits = a.toMutableList()
    newFruits.add("water melon")
    newFruits.add("pear")
    // println(newFruits.elementAt(4))

    /////// maps section


    val daysOfWeek = mapOf(1 to "monday", 2 to "tuesday",3 to "wednesday")
    // println(daysOfWeek[2])   // each number is a key
    for (key in daysOfWeek.keys){
        // println("$key is to ${daysOfWeek[key]}")
    }

    val fruitsMap = mapOf("favorite" to Fruit("grape",2.5)
        , 2 to Fruit("apple",1.0))

    val newDaysOfWeek = daysOfWeek.toMutableMap()
    newDaysOfWeek[4] = "thursday"
    newDaysOfWeek[5] = "friday"

    println(newDaysOfWeek.toSortedMap())

}

data class Fruit(val name : String, val price:Double)
