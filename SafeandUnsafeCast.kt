package com.example.myfirstapp1

fun main(args:Array<String>){
    // val obj: Any? = null
    // var str:String = obj as String
    // we are getting an error

    // // // // // //

    // val a:Any = 123
    // val b:String = a as String
    // println(a)

    // // // //

    val c:Any? = "String unsafe cast"
    val d:String? = c as String?
    println(d)

    // // // // // //

    val location:Any = "kotlin"
    val safeString:String? = location as? String
    val safeInt:Int? = location as? Int
    println(safeString)
    println(safeInt)


}

