package com.example.kotlinbasicspractice

fun main(){
    // function which has no name
    // lambda expressions and anonymous functions are 'function literals' i.e. functions
    // that are not declared, but passed immediately as an expression
    // lambda is defined with curly braces {} which takes variables as a parameter (if any)
    // and a body of a function.
    // the body of a function is written after the variable (if any) followed by -> operator

    // TODO example of lambda expression

    // write lambda - return value
    val sum: (Int,Int) -> Int = {a:Int,b:Int -> a+b}
    println(sum(10,5))
    // another way to write lambda - print value
    val sum2 = {a:Int,b:Int -> println(a+b)}
    sum2(10,5)

}