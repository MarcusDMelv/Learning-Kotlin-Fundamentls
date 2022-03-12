package com.example.kotlinbasicspractice

/*TODO
*  reviewed all basic practices with Kotlin.
*  Focused more on exception handling and OOP Concepts
*  Spent a couple weeks going over basic practices.
*  Spent a couple days understanding exception handling and OOP Concepts
*  Inheritance/Classes-(Abstract,Parent,Child,constructors)/Collection/Null/Data types/ Interfaces Lambda Expressions
*  Objects*/

fun main() {
    var bankAccount3 = Bank() // Default
    //TODO var bankAccount2 = Bank(userAccount = "Tony") //Default balance
    var bankAccount0 = Bank(75.60, "Marcus",85000.23) // Custom name and balance
    //add deposits to bankAccount0
    bankAccount0.deposit = 25.00
    bankAccount0.addMoney()
    bankAccount0.printBalance()
    bankAccount0.deposit = 50.21
    bankAccount0.addMoney()
    bankAccount0.printBalance()
    var bankAccount1 = Bank(userAccount = "Frank Ortiz")
    print("\n")
    // TODO Data class Obj
    val shoe1 = Shoes("Jordan",5)
    val shoe2 = Shoes("Jordan",4)
    println(shoe1 == shoe2)
    // copy object but change one property (number)
    val shoe3 = shoe1.copy(number = 1)
    println(shoe3)
    println(shoe3.component1())
    // created variables from attributes in objects
    val(brand,number) = shoe3
    println("$brand and $number")
    // TODO Inheritance
    var student1 = Math("Jessica",11,2.8)
    var student2 =English("Mike",12,2.1,'D')
    student1.read(35.4)
    student2.needFocus(2.3)







}
// creating a class
class Bank(balance:Double=00.00,userAccount:String="UserName",salary: Double=00.00) {
    // Members/Properties
    var balance = balance
    private var userAccount = userAccount
    var deposit: Double? = null
    private var salary: Double? = salary
    // this runs when object is created
    init {
        if (userAccount == "UserName"){
            println("This account has not been set up properly\n")
        }
        if (balance == 00.00 && userAccount!="UserName") {
            println("Client $userAccount is a new client!\n")
        }
        // if client has balance information but no salary information print it out
        if (balance != 00.00 && salary==00.00 && userAccount!="UserName"){
            println("Client: $userAccount Bank Account Balance: $balance\n")
        }
        // if client has all information filled out
        if (salary != 00.00 && userAccount!="UserName") {
            println("Client:$userAccount Salary:$salary Bank Account Balance:$balance\n")
        }
    }
    // add to balance - Scope and Shadowing
    fun addMoney(){
        balance += deposit!!
        println("Added $deposit to $userAccount Balance\n")
    }
    fun printBalance(){
        if (balance != 00.00){
            println("Client: $userAccount New Bank Account Balance: $balance\n")
        }
    }

}

// TODO Data Classes

data class Shoes(val brand: String, val number: Int)


// TODO Inheritance
// must open
// Parent class
open class Student(val name:String, var age:Int){
    //properties
    var studyTime:Double = 00.00

    //methods
    fun needFocus(time:Double){
        if (time>0)
            studyTime += time
    }
    fun read(timeRead:Double){
        println("Read for $timeRead minutes")
    }
}
//sub class of Student()
open class Math(name: String,age: Int,var gpa: Double) : Student(name,age){

}
// sub class of Math()
open class English(name: String, age: Int, gpa: Double,var readingLevel:Char) : Math(name, age, gpa) {}