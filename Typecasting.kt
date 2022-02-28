package com.example.kotlinbasicspractice

import kotlin.math.floor

fun main(){
    //TODO creating a list that only contains strings
    val stringList : List<String> = listOf(
        "Denny", "Frank", "Michael", "Gary",
    )
    //TODO creating a list that can contain any datatype
    val mixedTypeList: List<Any> = listOf(
        "Denny",31,4,"BDay",70.54,"weighs","Kg"
    )

    //TODO creating a for loop wit mixedTypeList
    for(value in mixedTypeList){
        // if its a int
        if(value is Int){
            println("Integer: '$value'")
            //if its a double
        }else if (value is Double){
            println("Double: '$value' with Floor value ${floor(value)}")
            //if its a string and the length of string
        }else if (value is String){
            println("String: '$value' of length ${value.length}")
        }else{
            println("Unknown Type")
        }
    }

    // Another way to write for loop
    for (value in mixedTypeList){
        when(value){
            is Int -> println("Integer:'$value'")
            is Double -> println("Double:'$value' with Floor Value ${floor(value)}")
            is String -> println("String:'$value' of the length ${value.length}")
            else -> println("Unknown Type")
        }
    }

    //TODO Smart Cast
    //
    val obj1: Any = "I have a dream"
    // if obj1 ISNOT a string
    if (obj1 !is String){
        println("Not a String")
    }else{
        //obj is automatically cast to a String in this scope
        println("Found a String of length ${obj1.length}")
    }

    // TODO Explicit (unsafe) Casting using the "as" keyword - can go wrong
    val str1: String = obj1 as String
    println(str1.length)
    val obj2: Any =1337
    // this throws an error with out making String and as a nullable
    //val str2: String = obj2 as String
    //println(str2)

    // TODO Explicit (safe) casting using the "as?" keyword
    val obj3: Any = 1337
    // not sure if its going to work - make it nullable
    val str3:String? = obj3 as? String // Works
    println(str3) // prints null
}
