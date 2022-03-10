package com.example.kotlinbasicspractice

/*TODO
*  reviewed all basic practices with Kotlin.
*  Focused more on exception handling and OOP Concepts
*  Spent a couple weeks going over basic practices.
*  Spent a couple days understanding exception handling and OOP Concepts
*  Inheritance/Classes-(Abstract,Parent,Child,constructors)/Collection/Null/Data types/ Interfaces Lambda Expressions
*  Objects*/

fun main() {
  val bankAccount = dataType(75.6, "Marcus")
    bankAccount


}

fun dataType(balance:Double=0.0,userAccount:String="User") {
    println("Account:$userAccount with balance of $balance")
}
