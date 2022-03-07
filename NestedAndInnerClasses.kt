package com.example.kotlinbasicspractice

fun main(){
    // TODO access the nested class
    OuterClass.NestedClass().nested()
    // TODO access the outer class
    val obj = OuterClass()
    obj.outerClass()

    // TODO access inner class using outer class functions
    OuterClassOfInner().InnerClass().inner()
    val innerObj = OuterClassOfInner().InnerClass()
    innerObj.inner()



}
// TODO Nested Class Example
// Nested Class - a class created inside another class
// Nested class is by default static - data members and member functions can be accessed without
// creating an object of the class
// Nested class cannot access data members of the outer class
class OuterClass{
    private val dataMembers:String = "Hello I am in outer class"
    fun outerClass(){
        println(dataMembers)
    }

    class NestedClass{
        // make private
        private val dataMembers:String = "Hello I am in nested class"
        fun nested(){
            println(dataMembers)
        }
    }
}

// TODO Inner class example
// Inner class - is a class which is created inside another class with keyword inner
// inner is a nested class but inner cannot be declared inside interfaces or non inner nested class
// advantage of inner class over nested  - able to be access by outer class even if its private
class OuterClassOfInner{
   private val outerDataMembers:String = "Outer class data"
    fun outerOfInner(){
        println(outerDataMembers)
    }

    inner class InnerClass{
        private val dataMembers:String = "Inner class data"
        fun inner(){
            println("This is $dataMembers and $outerDataMembers in the inner class not possible with Nested classes")
        }
    }
}