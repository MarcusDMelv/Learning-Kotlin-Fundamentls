package com.example.kotlinbasicspractice

/*TODO similar to interfaces but different
*  cannot be instantiated
*  can inherit subclasses from an abstract class
*  the members (properties and methods) of an abstract class are non-abstract
*  unless explicitly use the abstract keyword to make them abstract*/

//constructors in abstract are Concrete (non abstract ) properties
abstract  class Mammal(private val name:String,private val origin:String,private val weight:Double){

    // TODO Abstract Property ( Must be overridden by Subclasses)
    // if a class inherits Mammal must be overridden in child class
    abstract var maxSpeed:Double
    // TODO Abstract Methods ( Must ber implemented by Subclasses)
    abstract fun run()
    abstract fun breath()
    // Concrete (Non Abstract) Method
    fun displayDetails(){
        println("Name: $name, Origin: $origin, Weight: $weight, " +
                "Max Speed: $maxSpeed")
    }
}

//TODO child class of Mammal
// overrides maxSpeed - abstract properties
class Human(name:String,origin:String,weight:Double,override var maxSpeed:Double): Mammal(name,origin,weight){
    //must override abstract from parent class
    override fun run() {
       println("Runs on two legs")
    }
    // must override abstract from parent class
    override fun breath() {
       println("Breath through mouth or nose")
    }

}
// TODO child class of Mammal
// overrides maxSpeed - abstract properties
class Elephant(name:String,origin:String,weight:Double,override var maxSpeed:Double): Mammal(name,origin,weight){
    //must override abstract from parent class
    override fun run() {
        println("Runs on four legs")
    }
    // must override abstract from parent class
    override fun breath() {
        println("Breath through trunk")
    }

}


fun main(){
    //create an instant of each child class
    val human = Human("Andrew","South America",145.8,10.0)
    val elephant = Elephant("Rose","Asia",3500.0,25.6)
    // display override functions
    human.run()
    elephant.run()
    // display override functions
    elephant.breath()
    human.breath()
    // Cant create an instance of abstract class
}