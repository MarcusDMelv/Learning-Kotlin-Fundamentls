package com.example.kotlinbasicspractice

fun main(){
    // used to hold single data type or objects
    // can be resized to grow as new values are added
    // mutable and immutable
    val months = listOf("Jan","Feb","Mar")
    val anyType = listOf(1,2,3,true,false,"String")
    //show how many datatypes is in list
    println(anyType.size)
    //pick a specific item in the list
    println(months[2])
    // methods we can use with list
    // transverse through a list
    for (month in months){
        print("$month, ")
    }
    //TODO make list mutable
    val addMonths = months.toMutableList()
    // create an array of months
    val extraMonths = arrayOf("Apr","May","Jun")
    // TODO add array to mutable list
    addMonths.addAll(extraMonths)
    addMonths.add("Jul")
    println("\nMonths have been added. Here is new list of months $addMonths ")
    //TODO add to specific data type list
    val days = mutableListOf<String>("Mon","Tues","Wed")
    days.add("Thurs")
    println(days)
    //TODO Override items
    days[2]="Sunday"
    println(days)
    // TODO Remove item
    days.removeAt(3)
    println(days)
    //TODO Remove all
    val removeList = mutableListOf<String>("Mon","Sunday")
    // this will remove matching strings from days
    days.removeAll(removeList)
    println(days)
    days.removeAll(days)
    println(days)
}