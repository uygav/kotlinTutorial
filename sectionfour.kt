package com.example.myfirstapp1

import java.lang.IllegalArgumentException

fun main(){
    // var denis = Person("Denis","Panjuta",31)

    // denis.hobby = "skateboard"
    // denis.age = 32
    // denis.stateHobby()
    // println("denis is ${denis.age}")

    // var john = Person()
    // john.hobby = "basketball"
    // var johnPeterson = Person(lastName = "Peterson")
    // myFunction(5)

    var myCar = Car()
    println("brand is : ${myCar.myBrand}")
    //myCar.MaxSpeed = 200
    //println("maxspeed is ${myCar.MaxSpeed}")

    // myCar.myModel = "M3"
    println("my car model is ${myCar.myModel}")
}
class Person(firstName:String = "John" , lastName:String = "Doe"){

    var age : Int? = null
    var hobby : String = "watch Netflix"
    var firstName : String? = null

    init {
        this.firstName = firstName
        println("initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName")
    }

    constructor(firstName: String,lastName: String,age:Int)
            :this(firstName,lastName){
                this.age = age
        println("initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName and age $age")
            }


    fun stateHobby(){
        println("$firstName \'s  hobby is $hobby")
    }



}

fun myFunction(a:Int){
    var b = a
    println("b is $b")
}

class Car(){
    lateinit var owner : String

    val myBrand :String = "BMW"
    get(){
        return field.toLowerCase()
    }
    var maxSpeed : Int = 250
    get() = field
    set(value){
        field = if (value > 0 ) value else throw IllegalArgumentException("maxspeed cannot be less than 0")
    }

    var myModel : String = "M5"
    private set
    init {
        this.myModel = "M3"
        this.owner = "Frank"
    }
}