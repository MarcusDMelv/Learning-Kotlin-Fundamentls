package com.example.kotlinbasicspractice

import java.util.ArrayList

fun main(args:Array<String>){
    //TODO
    // ArrayList are used to create a dynamic array - can increase or decrease
    // ArrayList class provides both read and write function
    // ArrayList follows the sequence of insertion order
    // ArrayList is non sync and it may contain duplicate elements
    // Constructor of ArrayList
    // ArrayList<E>: - Used to create an empty ArrayList
    // ArrayList(capacity:Int): Used to create an ArrayList of specified capacity
    // ArrayList(elements:Collection<E>): used to create an ArrayList filled with the elements of a collection
    // Creating ArrayList:

    // create a empty arrayList
    val arrayList = ArrayList<String>(5) // <- empty ArrayList, MAX entries of 5
    arrayList.add("Uno") // <- adding a object to arrayList
    arrayList.add("Dos") // <- another object
    arrayList.add("Tres")
    println(arrayList) // show ArrayList
    for (i in arrayList){
        println(i) // <- iterate through arrayList
    }

    //ArrayList using collections
    val list: MutableList<String> = mutableListOf<String>() // <- creating a list collection
    list.add("Cuatro") // adding to list
    list.add("Cinco") // adding to list
    arrayList.addAll(list) // add the collection to the ArrayList
    println(arrayList)
    for (i in arrayList){ // iterate through new ArrayList
        println(i)
    }

    // ArrayList iterator
    val itr = arrayList.iterator() // -> created to specifically iterate through an ArrayList
    println("Using iterator function")
    while (itr.hasNext()){ // as long as the arrayList has an object next in the arrayList
        println(itr.next())
    }
    println("Size of arrayList = ${arrayList.size}") // arrayList Size

    // Using get()
    println("Using get()")
    println(arrayList.get(index = 0))
    println(arrayList.get(index = 3))
    println(arrayList.get(index = 4))


    // TODO ArrayList Exercise
    // Write aa program that adds five Numbers (Double) to an arrayList and then calculates the
    // average of those numbers. Please use a for in loop in this exercise.

    val newArrayList = ArrayList<Double>(5)
    val newList = mutableListOf<Double>()
    newList.add(1.00)
    newList.add(3.00)
    newList.add(4.00)
    newList.add(2.00)
    newList.add(2.00)
    newArrayList.addAll(newList)
    var avg : Double = 0.0
    for (i in newArrayList){ // iterate through list
         avg += i // add each element to empty double
    }
    val arrayListAvg = avg/newArrayList.size // grab the average of newArrayList
    println("The average of newArrayList = $arrayListAvg")
}