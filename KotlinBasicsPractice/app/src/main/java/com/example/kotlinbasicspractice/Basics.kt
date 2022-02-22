package com.example.kotlinbasicspractice

/*create a main function - entry point of app*/
fun main(){
    /*body of the function*/
    val myName = "Marcus"
    /*assign new value to myName*/
    // myName = "Scooter" | ERROR: val cannot be reassigned
    var greeting = "Hello"
    greeting = "Hello World"
//    print("$greeting I am back!! Its me $myName!\n\n\n")
    /*var can be overwritten - val can NOT be over written*/


//    comments goes here
    /*comments goes here - multi line comment*/
//    TODO: comments go here



//    TODO - different types of integer variables
    /* memory space used for each int data type
     - BYTE (8 bit), Short (16 bit),
    * Int(32 bit), Long(64 bit) */
//    Ints are use for whole numbers
//    type inference finds out the type from context
    var myAge = 31
//    using a colon to in between variable name and integer types
//    not able to use any more memory once given a specific int type
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 1234
//    credit card numbers
    val myLong: Long = 12_235_434_547_456_657

//    Floating point number types: Float (32 bit), Double (64 bit)
//    add an F at the end of value to make variable an float
    val mySimpleFloat = 13.37F
    val myDouble:Double = 3.123454667667887
    val myFloat:Float = 134.37F
    myFloat
    mySimpleFloat
    myDouble


//    TODO: Datatypes bool, char and string
    /*Booleans is used to represent logical values
    * It can have two possible values true and false
    * Dont need to assign Boolean just use true or false as the value*/
    var isSunny = true
//    change sunny to false
    isSunny = false

    /*Characters - no need to assign datatype just use one character aka char
    * use single quotation marks */
    val letterChar = 'A'
    val digitChar = '1'
    val symbolChar = '$'

    /*Strings are multiple chars*/
    val myStr = "Hello World"
//    access the first char in myStr
    val firstCharInStr = myStr[0]
    // getting the last character
    val lastCharInStr = myStr[myStr.length - 1]
//    print(myStr+"\n")
    //TODO: String Interpolation - String Templates using ${} & $
//    print("First Character in myStr is - $firstCharInStr and the length of myStr is ${myStr.length} \n")
//    print("Last Character in myStr is - $lastCharInStr\n\n\n")


    /*TODO: Write a program in which you are assigning those values to variables with the right
       (specific) data type for:
       "Android Masterclass"
       13.37F
       3.14159256358979
       25
       2020
       18881233457
       true
       'a'*/

    // Answers listed below
    var title : String = "Android Masterclass"
    val pointsPerGame : Float = 13.37F
    val piValue : Double = 3.14159265358979
    var jerseyNum : Byte = 25
    var year : Short = 2020
    var creditCardNum : Long = 18881234567
    var passingGrade : Boolean = true
    var letterGrade : Char = 'a'

    /*TODO: Arithmetic operators ( +, -, *, /, %)*/
    var results = 5+3
//    results value will be the total of the equation
//    divide results by 2
    results /= 2
    results *= 4
    results -= 2
//    using a % symbol will give the remainder - right now results = 14
    results %=3
//    print("" + results + "\n")
    val a = 5.0
    val b = 3
    var charMath = a / b
//    charMath is now a double and not a int because of a = 5.0
//    print("$charMath \n\n")

    /*TODO Comparison Operators
    *  (==, !=, <, >, <=, >= )*/
//    Does the left side equal the right side?
//    uses Boolean expression
    val isEqual = 5==3
//    println("is 5 equal to 3 $isEqual")

    val isNotEqual = 5!=5
//    println("is 5 not equal to 5 is $isNotEqual")
//    println("is 5 greater 3 is ${5>3}")
//    println("is 5 less Then 3 is ${5<3}")
//    println("is 5 less then or equal to 3 ${5<=3}")
//    println("is 5 greater then or equal to 3 ${5>=3}")

    /*TODO Assignment, increment and decrement operators
    * Assignment operators (+=, -=, *=, /=, %=)*/
    var myNum = 5
    myNum += 3
    myNum *= 5
//    println("My number is $myNum")

//    TODO Increment & Decrement operators (++,--)
//    add one using ++
    myNum++
//    println("My number is $myNum")
//    subtract one using --
    myNum--
//    println("My number is $myNum")
//    able to add/sub inside of prinln statement
//    println("My number is ${++myNum}")
//    println("My number is ${--myNum}")
//    if you put increment/decrement operators after var it will add it after the code is done
//    most common way
//    println("My number is ${myNum++}")
//    println("My number is ${myNum++}")


    /*TODO If / else / else if Conditions*/
    var heightPerson1:Short = 132
    var heightPerson2:Short = 132
//    each statement gets own {} - if starts statement - else ends statement
//    use as many else if statements as you want - as long as it makes since
    /*if(heightPerson1 > heightPerson2){
        println("Use raw force")
    }else if (heightPerson1 == heightPerson2){
        println("Use your power technique")
    }else{
        println("Use technique")
    }

// TODO create conditions using age
    val age:Byte=12
    if (age >= 21){
        println("In the America you can drink! Have fun!")
    }else if(age>=18){
        print("You can! vote")
    }else if (age>=16){
        println("You can drive!")
    }else{
        println("You are very young stay in school!")
    }

// one line statement
    if(age <= 30)
        println("Must be nice being young!")
//    TODO if statement with a String
    val name:String = "Tom"
    if(name == "Marcus"){
        println("Welcome back $name")
    }else{
        println("Who is $name")
    }
     */
    /*
//    TODO if statement with a Boolean
    val itsRainy:Boolean = true
    if(itsRainy)
        println("It's raining!")


    /*TODO When Expressions*/


    var season = 3
    /*TODO grab a variable*/
    when(season){
        // if season ==  -> print ""
        1 -> println("Spring")
        2 -> println("Summer")
//        TODO print multiline
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    //        TODO look at a range of values
    var month : Int = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        // be specific
        12,1,2 -> println("Winter")
        else -> println("Invalid Season")
    }



    var newAge = 17
    when(newAge){
        !in 0..20 -> println("Now you can drink in America!")
        in 18..20 -> println("Now you can vote!")
        16,17 -> println("Now you can drive")
        else -> println("You are a baby focus on school!")
    }


//    TODO using is to find type
//    use Any to declare variable can be anything
    var x : Any = 24.45F
    val anyResults =  when(x){
        is Int -> println("'$x' is an Int")
        is Double -> println("'$x' is a Double")
        is String -> println("'$x' is a String")
        else -> println("'$x' is not a Int , Double or a String!")
    }
    println("$anyResults")
     */

    /*TODO While Loop*/
    
}