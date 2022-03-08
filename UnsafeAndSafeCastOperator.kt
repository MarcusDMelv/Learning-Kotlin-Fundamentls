package com.example.kotlinbasicspractice
//TODO Unsafe cast operator : as
// Sometimes it is not possible to cast a variable and it throws an exception, this is called unsafe cast
// The unsafe cast is performed by the infix operator as
// Example of Unsafe Cast
// A nullable string (String?) cannot be cast non nullable string(String) this throws an exception

fun main(args:Array<String>){
    val obj:Any? = null
    val str:String = obj as String
    println(str)
    // Output: Exception in thread "main" java.lang.NullPointerException: null cannot be cast to non-null type kotlin.String

    //TODO Trying to cast an integer value of Any type into a string type leads to  ClassCastException
    val obj1: Any =123
    val str1:String = obj1 as String
    println(str1)
    // Output:Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')

    //TODO how to make it work
    // must make variables nullable
    val obj3:Any? = "String unsafe cast"
    val str3:String? = obj3 as String?
    println(str3)
    // Output: String unsafe cast

    //TODO How to pass ClassCastException
    // using as? - provides a safe cast operation to safely cast to a type
    // it returns a null if casting is not possible rather than throwing an ClassCastException exception
    val location:Any = "Kotlin"
    val safeString:String? = location as? String
    val safeInt:Int? = location as? Int
    println(safeString)
    println(safeInt)
    //Output: Kotlin
    //Output: null


}
