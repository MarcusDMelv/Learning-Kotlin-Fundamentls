package com.example.kotlinbasicspractice

/* TODO
*   The class that inherits the features of another class
*   class is called the Sub class or Child class or
*   Derived class, and the class whose features are
*   inherited is called the Super class or Parent class
*   or Bas class.
*   **EVERY CLASS INHERITS FROM THE "ANY CLASS"***/
// creating a new class
// must open class to inherit
// by default classes are final - not able to inherit
// to make sure class is not inherit use "sealed"
/* TODO Superclass/Parent Class/Base Class*/
open class Car(val name: String, val brand: String){
    //properties - you need to open to override
    open var range : Double = 0.0
    //methods - need to open to override
    open fun extendedRange(amount: Double){
        if(amount>0){
            range += amount
        }
    }
    open fun drive(distance:Double){
        println("Drove for $distance miles")
    }
}
/*TODO Subclass/ Child class/ Derived class of Car*/
// use same parameters as parent class
//add more features to child class must have same as parent class
class ElectricCar(name: String, brand: String, batterLife:Double) : Car(name, brand){
    // properties
    var chargerType:String? = null
    // overriding parent properties - must be open first
    override var range = batterLife * 6
    // overriding parent function - must be open first
    override fun drive(distance: Double) {
        // output will be different for e-cars
        println("Drove for $distance miles on electricity")

    }
    fun drive(){
        println("Drove for $range miles on electricity")
    }

}

fun main(){
    var audiM3 = Car("M3", "BMW",)
    var teslaS = ElectricCar("S-Model","Tesla",85.0)
    teslaS.extendedRange(200.0)
    teslaS.chargerType = "Type 3"

    // TODO Polymorphism
    audiM3.drive(200.9)
    teslaS.drive(200.9)
    teslaS.drive()
}