package com.example.kotlinbasicspractice

import java.lang.ArithmeticException
import java.lang.NullPointerException

fun main(){
    //TODO handling runtime problems which occur in the program and would otherwise lead to program termination
    //What is an Exception - a runtime problem which occurs  and ends program
    // Example - run out of memory / array out of bounds / condition like divided bt zero
    // To handle problems during runtime use a technique that is called TODO exception handling
    // Exception Handling - maintains the flow of program execution
    // TODO Four keywords used in exception handling:
    /*try - contains a block must be followed by catch / finally or both
    * catch - used to catch an exception
    * finally - allows execute whether exception is handled or not
    * throw - throw exception explicitly
    * */
    // TODO Unchecked Exception - is thrown due to mistakes in our code
    /*This exception type extends the RuntimeException class
    *The uncheck exception is checked during run time
    * Examples of unchecked exceptions
    * ArithmeticException - Thrown when we divide a number by zero
    * ArrayIndexOutOfBoundExceptions - thrown when array has been access with incorrect index value
    * SecurityException - thrown by security manager to indicate security violation
    * NullPointerException - thrown when invoking a method or property on a null object
    * */
    // TODO Checked Exception - is checked at compile time
    /* This exception type extends the Throwable class
    * Example of checked exceptions:
    * IOException - input/output
    * SQLException -
    * try catch block used for exception handling in the code
    * Syntax of try with catch block
    * try{
    *   //code that may throw the exception
    * }catch(e:SomeException){
    *   // code that handles exception
    * }*/
}
//TODO Example without exception handling
/*
fun getNumber(str:String):Int{
    return try{
        Integer.parseInt(str)
    }catch (e:ArithmeticException){
        0
    }
}
 */

// TODO Multiple catch Blocks
/*We can use multiple catch blocks
* each catch block are used when we are using different types of operations in a try block which may
* cause different exceptions in the try block*/
/*
fun multipleCatchBlock(args: Array<String>){
    try {
        val a =IntArray(5)
        a[5]=10/0
    }catch (e:ArithmeticException){
        println("arithmetic exception catch")
    }catch (e:ArrayIndexOutOfBoundsException){
        println("array index outofbounds exception")
    }catch (e:Exception){
        println("parent exception class")
    }
    println("code after try catch...")
}
 */

// TODO Nested try-catch block
/* The requirement of nested try catch block arises when a block of code generates an exception
* and within that block another code statement also generates another exception*/
/*
fun nestedTryCatchBlock(){
    try {
        // code block
        try {
            // code block
        } catch (e:SomeException){
            // exception
        }
    }catch (e:SomeException){
        //exception
    }
}
*/

//TODO finally Block
/*
* finally block is always executes whether exception is handled or not
* So it is used to execute important code statement*/
/*
fun finallyBlock(args:Array<String>){
    try {
        val data = 10/5
        println(data)
    }catch (e:NullPointerException){
        print(e)
    }finally { // finally code will run no matter what
        println("finally block always executes")
    }
    println("below code")
}
*/

//TODO throw keyword
/*used to throw an explicit exception
*used to throw an custom exception
* throw an exception object wwe will use the throw exception
*  */
/*
fun throwException(args: Array<String>){
    validate(15)// another function
    println("code after validation check")
}
fun validate(age:Int){
    if (age<18)
        throw ArithmeticException("under age")
    else
        println("eligible for drive")
}
 */