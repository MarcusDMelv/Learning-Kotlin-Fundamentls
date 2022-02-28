/*


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

}
