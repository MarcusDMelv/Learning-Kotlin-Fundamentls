package com.example.kotlinbasicspractice
//Arrays allows to store multiple pieces of data in one variable
fun main(){
    // array only for integers
    //val numbers:IntArray = intArrayOf(1,2,3,4,5,6,)
    //val numbers = intArrayOf(1,2,3,4,5,6)
    //TODO most simple format to create array
    val numbers = arrayOf(1,2,3,4,5,6,)
    //TODO must assign double tou doubleArrays
    val numbersD = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0)
    //cant just print arrays - must use .contentToString
    println(numbers.contentToString())
    //TODO traverse through an array
    for (element in numbers ){
        // add two to each element
        println("${element+2}")
    }
    // TODO using an index
    println(numbers[3])
    // Modify Array
    println("Original values ${numbers.contentToString()}")
    numbers[0]=6
    numbers[1]=5
    numbers[4]=2
    numbers[5]=6
    println("Final values after modify ${numbers.contentToString()}")
    // TODO Double Arrays
    println(numbers[3])
    // Modify  Double Array
    println("Original Double values ${numbersD.contentToString()}")
    numbersD[0]=6.0
    numbersD[1]=5.0
    numbersD[4]=2.0
    numbersD[5]=6.0
    println("Final Double values after modify ${numbersD.contentToString()}")
    // TODO a String Array
    val days = arrayOf("sunday","monday","tuesday","wednesday","thursday","friday","saturday")
    println(days.contentToString())

    //TODO store objects in array - using data class Fruits
    val fruits = arrayOf(Fruit("Apples",1.98),Fruit("Grapes",2.99),
    Fruit("Cherries",2.21),Fruit("Strawberries",1.99)
    )
    println(fruits.contentToString())
    //TODO get the index
    for (index in fruits.indices){
        println("${fruits[index].name} is in index $index")
    }
    // TODO random
    for(fruit in fruits){
        if (fruit.name == "Cherries"){
            println("${fruit.name} cost ${fruit.price}")
        }
    }

    //TODO mix data types
    val mixArray = arrayOf("Day",45,5.2,Fruit("Black Berries",2.3))
    println(mixArray.contentToString())
}
data class Fruit(val name: String, val price:Double){

}