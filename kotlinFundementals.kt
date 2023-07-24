package com.example.myfirstapp1

fun main(){
  /*println("uygar")
    var a = "uygar"
    a = "muntas"
    println(a)
    val b = "zort"
    // b cant change bc of 'val'
    println(b)
    // TODO: what is this idk

    val c : Int = (31)
    val d : String = ("uygar")
    val e : Boolean = (true)
    val f = false
    val g : String = "xd"
    val h : Float = 13.37F
    val i = 31.21F
    val j = 21
    println("my age is " + j )
    println("my age is ${j} " )   */

    /* val a = 5.0
    val b = 3
    var resultDouble : Double
    resultDouble = a / b
    print(resultDouble)
    */
    /*
    var season = 3
    when(season){
        1 -> println("spring")
        2 -> println("summer")
        3 -> {
            println("fall")
            println("autumn")
        }
        4 -> println("winter")

        else -> println("invalid season")
    }

    var month = 3

    when(month){
        in 3..5 -> println("spring")
        //  !in 3..5 -> println("spring")
        in 6..8 -> println("summer")
        in 9..11 -> println("fall")
        in 12 downTo 2 -> println("winter")
        // 12 , 1 , 2 -> println("winter")
        else -> println("invalid season")
    }

    var x : Any = 13.37
    when(x){
        is Int -> println("$x is an int")
        is Double -> println("$x is an double")
        !is Double -> println("$x is not a double")
        is String -> println("$x is an string")
        else -> println("$x is none of the above")
    }
    */

    /*
    var x = 1
    while(x <= 10){
        println(x)
        x +=1
    }


    var z = 1
    do {
        print("$z ")
        z++
    } while(z <= 10)
    */

    /*
    for(num in 0..10){
        println(num)
    }

    for(i in 1 until 10 ){
        println(i)
    }
    for (i in 10 downTo 1 step 2){
        println(i)
    }*/
    /*
    for (i in 1 until 20){

        if (i/2 == 5){
            break
            //continue
        }
        println(i)
    }
    */
    /*
    myFunction()
    println(addUp(5,3))
    println(avg(3.2,5.3))

     */

    var name : String = "Denis"
    // name = null  -> Compilation Error
    var nullableName : String? = "Denis"
    // nullableName = null    -> you wont get error

    var len = name.length
    var len2 = nullableName?.length
    println(nullableName?.toLowerCase())

}

fun myFunction(){
    println("myFunction is called")
}

fun addUp(a: Int,b:Int):Int{
    return (a+b)
}
fun avg(a:Double,b:Double):Double{
    return (a+b)/2
}

