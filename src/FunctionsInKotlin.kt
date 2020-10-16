@file:JvmName("Functions")
fun main(){
    //In Java we call them as methods In Kotlin we are calling it as functions
    //If we are running Java and Kotlin combined we may call it as method
    //So how do we define a function? Check it outside main method
    add(5,6)
    var result = addWithReturn(8,9)
    println("Result is $result")
    var InlineResult = inLineAdd(19,20)
    println("Inline Result = $InlineResult")

    var maxValue = max(12,13)
    println("max value is $maxValue")

    var OneLinemaxValue = max(19,13)
    println("max value is $OneLinemaxValue")
}
//A function without return type or With void return type
  fun add(a: Int , b: Int) : Unit{
    var sum = a+b
    println("Sum is $sum")
}
//A funtion with return type
fun addWithReturn(a: Int , b: Int) : Int{
    return a+b
}
//InLine function... Function in online
 fun inLineAdd(a: Int, b : Int) : Int = a+b

//Function to find a max value
fun max(a : Int, b : Int) : Int{
    if (a>b)
        return a
    else
        return b
}

//Max function in online
fun oneLinemaxFunc(a : Int, b : Int) : Int = if(a>b) a else b
