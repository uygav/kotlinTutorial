package com.example.myfirstapp1

///////////////////////////////// NESTED CLASS

class OuterClass{
    private var name:String = "mr x"

    class NestedClass{
        var description :String = "code inside nested class"
        private var id:Int = 101

        fun foo(){
            // println("name is ${name}")  // can not access the outer class member

            println("id is ${id}")
        }
    }
}

fun main(args:Array<String>){
    // nested class must be initialized

    println(OuterClass.NestedClass().description) // accessing property

    var obj = OuterClass.NestedClass()  // object creation
    obj.foo()
}


///////////////////////////////// INNER CLASS/////////////////////

class OuterClass2{
    private var name:String = "mr x"
    inner class InnerClass{
        var description : String = "code inside inner class"
        private var id : Int = 101

        fun foo2(){
            println("name is ${name}") // access the private outher class member
            println("id is ${id}")
        }
    }
}
fun main2(args: Array<String>){
    println(OuterClass2().InnerClass().description) // accessing property

    var obj = OuterClass2().InnerClass() // object creation

    obj.foo2() // access member function


}

