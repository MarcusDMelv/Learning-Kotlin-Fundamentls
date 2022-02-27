/*
package com.example.kotlinbasicspractice

/*TODO Breaks and Continue*/
fun main(){
    /*TODO Nullables
    *  a datatype that allows null not 0 but null = empty*/
    //var name :String = "Marcus"
    // able to change name into a different name but cannot be a null
    //name = "Hampton"
    // declare that variable can be a null
    // a question mark allows a variable to be nullable
    var nullableName:String? = "Gary"
    // now variable can be a null
    //nullableName = null
    // getting length the length of variable
    //var len = name.length
    // getting length of nullables
    // check if var is a null using method below
    var len2 = nullableName?.length
    //println("$len,$len2")
    //println(name.toLowerCase())
    /*TODO Elvis Operator ?: - Not Null Assertion*/
    // if nullableName is empty then use Guest
    val name = nullableName ?:"Guest"
    println(nullableName!!.toLowerCase())
    //println(name)
    /*TODO Safe call operator class is empty*/
    //val wifeAge: String? = user?.wife?.age?:null
    for (i in 1 until 20){
        println("$i")
        if(i/2 == 5){
            // once break is executed exit loop
                // used on condition you have no control over
            break
        }
    }
    println("Done with Break Keyword")

    for(i in 1 until 20){
        if(i/2 == 5){
            // what continue does is skip the code that is in the for loop
                // and continue so 10&11 is skipped
                    // 10/2 = 5 and 11/2=5.5 which is 5 in a int
            continue
        }
        println("$i")
    }
    println("Continue Keyword was used ")

    /*TODO Functions*/
    // allows us to reuse code easily
    // we are in the main function
    // call in function created outside of main
    myFunction()
    // TODO use function with Parameters/Arguments
    // create a variable to store function
    // Arguments
    var addUp = addUp(5,3)
    println("Results of addUp function is $addUp")
    // using datatype double to find average
    var avg = averageValue(13.25,5.878)
    println("\n The average is $avg")
}
/*TODO create a new function outside of main*/
fun myFunction(){
    println("\nCalled from myFunction")
}
// addUp has two parameters aka Arguments that return a Int
// a & b is the input
// Arguments
fun addUp(a:Int, b:Int, ): Int{
    // return is the output
    return a+b
}
// Method - a Method is a Function within a class
/*TODO Method*/
/*TODO Create a function that gives an average of two values*/
fun averageValue(a:Double,b:Double): Double {
    return ((a+b) / 2)
}
*/

package com.example.kotlinbasicspractice

import java.lang.IllegalArgumentException

/*TODO Intro to OOP
*  1.Variables and Types
*  2. Control Flows
*  3. Functions
*  4. Collections
*  5. Classes and objects ( including inheritance )
*   */


fun main(){
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
    var car = Car()
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
class Car(){
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