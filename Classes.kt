package com.example.kotlinbasicspractice

/*TODO Creating a Data Classes
*  need at least one parameter*/
data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1,"Kenny")
    // not able to reassign id because it is a val not a var
    user1.name = "Gary"
    val user2 = User(2,"Gary")
    //
    println(user1.name == user2.name)
    println("User Details: $user1")
    //TODO copying objects
    val user3 = user1.copy(name = "Frank")
    println(user3)
    //TODO printing components
    println(user3.component1())
    println(user3.component2())

    val(id,name) = user3
    println("id is $id name is $name")
    // creating an object of the class Person / instance of a class
    // using Person default values
    /*
    var user1 = Person()
    //Creating mobilePhone Objects
    var mobile1 = MobilePhone("iOS","Apple","XR")
    var mobile2 = MobilePhone("Android","Samsung","Galaxy S20 Ultra")

    // TODO create an objects of Person class
    // first object of Person class
    var user1 = Person("Bianca","Jones")
    user1.hobby="talking on the phone with family"
    user1.stateHobby()
    // age in Person class can be null dont have to assign when creating a Person instance
    user1.age = 32
    println("Bianca is ${user1.age} years old")
    // Second object of Person
    // able to add age when initializing Person object
    var user2 = Person("Dennis","Jackson",33)
    //edit object function that was created in Person class
    user2.hobby = "play video Games"
    // use the function created in Person class
    user2.stateHobby()
    println("Dennis is ${user1.age} years old")

     */
    var car = Car1()
    // set a new value for variable in Car() instance
    car.maxSpeed = 185
    // not able to change Car() property myModel outside of class
    // car.myModel = "M5"
    println("${car.owner} has a ${car.myModel} ${car.myBrand} that goes ${car.maxSpeed}")

}

/*TODO Scope and Shadowing*/
 fun myFunction(a:Int){
     // cannot assign a value to function argument
     // must create a var to = the argument
     // extra code no need for it -- cause confusion
    var a = a
    print(a)
 }

/*TODO Classes */
// a constructors allows us to add values to our objects
// give constructors default values
class Person(firstName:String = "John",lastName:String="Doe"){
    //class body//create properties and method
    // TODO Member Variable / Properties
    var age :Int? = null
    var hobby:String = "Watch Netflix"
    var firstName:String? = null
    // TODO initializer - automatically runs code when instance is created
    init {
        // using shadowing - saying the variable created in this class = the constructor that was created
        this.firstName = firstName
        println("Initialized a new Person object with " +
                "firstName = $firstName , lastName = $lastName and age = $age")

    }
    // TODO secondary Constructor add old constructors and new constructor which will be age
    constructor(firstName: String,lastName: String,age:Int)
            // using this to symbolize this age created in this class
    : this(firstName,lastName){
        this.age = age
    }
    //TODO Member Function / Methods
    fun stateHobby(){

        println("$firstName\'s hobby is $hobby")
    }
}



/* TODO Class Exercise
*   Create a class called MobilePhone. It should have three primary constructor
*   variables - osName,brand,model
*    Create 3 objects in the main function*/
class MobilePhone(osName:String,brand:String,model:String){
    init {
        println("Initialized a new MobilePhone Object" +
                " osName:$osName brand:$brand model:$model")
    }
}

/* TODO New Class*/
class Car1(){
    // when creating a variable always need to initialize it - lateinit
    // lateinit - means it will be initialize later
    // its not an nullable
    // TODO owner
    lateinit var owner : String
    //TODO myBrand
    val myBrand : String = "BMW"
    // using a custom getter
        // get() is ran by default - custom getter turns string lowercase
        get(){
            // myBrand will print lowercase version
            // TODO field is the final value of the public var
            return  field.toLowerCase()
        }
    //TODO maxSpeed
    var maxSpeed : Int = 250
        // if max speed is less then 0 throw an exception
        set(value) {
            field = if(value>0) value else throw IllegalArgumentException("Max speed cannot be less then 0")
        }

    var myModel : String = "M5"
        //TODO making setter private
        // private is only available within the same class
        // not able to change value once set in class
        private set
    // get() is running automatically for variables
    // when instance is created run block of code
    init {
        this.myModel = "M3"
        this.owner ="Frank"
    }
}

