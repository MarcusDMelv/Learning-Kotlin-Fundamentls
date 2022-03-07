package com.example.kotlinbasicspractice

fun main(){
    // Visibility Modifiers aka Access Modifiers
    // keywords which are used to restrict the use of classes, interface methods and properties
    // modifiers are used at multiple places such as class header or method body
    // Visibility Modifiers are categorized into four different types:
    // public - private - protected - internal
    // public and private are the most common used

}
// Todo public modifiers
// public - default modifier / accessible throughout the whole project/placed top up file
public class Example{
    public val x = 5
    public fun hello(){
    }
}


// TODO private modifiers
// private - only accessible where it was declared/does not allow access outside of scope/package accessible within specific file
// accessible from same source file
private class ExamplePrivate{
    //accessible only within Class
    private val x = 1
    //accessible only within Class
    private fun doSomething(){

    }
}


// TODO internal modifiers
// internal - Kotlin only/only visible in module it is implemented in
internal class ExampleInternal(){
    internal val x = 5
    internal fun getValue() {
    }
}


// TODO protected modifier
// protected - allows visibility to its class or subclass only/CANNOT be declared at top level/
// A protected declaration (when overridden) in its subclasses is also protected unless it is explicitly changed
open class Base{
    // must be open to override
    protected open val i =0
}
class Home:Base(){
    fun getValue():Int{
        return i
    }
}
// TODO override protected variables
class Another:Base(){
    fun getValue():Int{
        return i
    }
    override val i = 10
}
// TODO global variables
// public global
public const val i = 10
// private global
private const val x = 10
// internal global
internal const val y = 10
//