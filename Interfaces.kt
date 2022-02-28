package com.example.kotlinbasicspractice
/*TODO A interfaces are a feature that allows to extend the functionality of classes
*  interfaces can inherit from other interfaces
*  Why use a interface? - useful when you have certain functions that want to be implemented later on
*  dont want to implement directly*/
fun main(){
    var dodgeChallenger = CarProduct(200.0,"Dodge","Challenger")
    var teslaS = ECar(240.0,"S-model","Tesla",86.0)

    dodgeChallenger.brake()
    teslaS.brake()
    dodgeChallenger.drive()

}

interface Drivable{
    val maxSpeed: Double
    // no function body - just function head
    fun drive(): String
    //
    fun brake(){
        println("The drivable is braking")
    }
}

// Parent Class
/*TODO adding interface to class - must override properties add to class constructor
*  use : after class constructor to implement interface extension*/
open class CarProduct(override val maxSpeed:Double,val name:String,val brand:String): Drivable{
    //properties - you need to open to override
    open var range : Double = 0.0
    //methods - need to open to override
    open fun extendedRange(amount: Double){
        if(amount>0){
            range += amount
        }
    }
    // this is from interface - this drive function is different from class drive function
    // String vs Double
    // override fun drive():String = "Driving the interface drive"
    override fun drive(): String {
       return "driving the interface drive"
    }
    // lowest level in which it was defined
    open fun drive(distance:Double){
        println("Drove for $distance miles")
    }

}
// Child Class of CarProduct
class ECar(maxSpeed: Double,name: String, brand: String, batterLife:Double) : CarProduct(maxSpeed,name, brand){
    // properties
    var chargerType:String? = null
    // overriding parent properties - must be open first
    override var range = batterLife * 6
    // overriding parent function - must be open first
    override fun drive(distance: Double) {
        // output will be different for e-cars
        println("Drove for $distance miles on electricity")

    }
    override fun drive():String{
        return "Drove for $range miles on electricity"
    }
    // brake is suppose to be coming from Drivable interface
    override fun brake(){
        // super.brake() is being pulled from the Super Class/ Parent Class
        super.brake()
        println("brake inside the electric car")
    }



}
