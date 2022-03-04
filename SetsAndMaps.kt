package com.example.kotlinbasicspractice
//set is a type of collection that eliminate duplication
//this collection is unordered - elements are not sorted

fun main(){
    //TODO Example
    val fruits = setOf("Orange","Apple", "Grape","Mango","Apple","Orange")
    // will not print duplicates
    println(fruits.size)
    // sort elements in alphabetical order
    println(fruits.toSortedSet())
    // create a new set to add new elements to it
    val newFruits = fruits.toMutableList()
    newFruits.add("Watermelon")
    newFruits.add("Pear")
    println(newFruits)
    //access particular element in set
    println(newFruits.elementAt(4))
    //TODO Map
    // map is a type of collection that holds data in the form of a key value pair
    // and the map keys are unique and hold only one value for each key
    // #'s are the key - weekday is the value
    val daysOfTheWeek = mapOf(1 to "Monday",2 to "Tuesday",3 to "Wednesday")
    println(daysOfTheWeek[2])
    // loop through a Map Collection
    for (key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")
    }
    // TODO using a data class set as a map - using a String as a key
    val fruitMap = mapOf("Favorite" to FruitPrice("Grape",2.25),
        "Dislike" to FruitPrice("Berries",1.25),"mid" to
                FruitPrice("Apples",2.30))
    for (key in fruitMap.keys){
        println("My $key is ${fruitMap[key]}")
    }
    // To make changes make it a mutable list
    val mutableDaysOfTheWeek = daysOfTheWeek.toMutableMap()
    mutableDaysOfTheWeek[4]= "Thursday"
    mutableDaysOfTheWeek[5]= "Friday"
    println(mutableDaysOfTheWeek.toSortedMap())


}

data class FruitPrice(val name:String,val price:Double)