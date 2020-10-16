import java.util.*

fun main(){
    //we can declare a simple list like below
    var listOfnums = listOf(1,2,3,4)
    //listof is a method in Collections.kt
    for(num in listOfnums){
        println(num)
    }
    //In a normal for loop in Java we can print index and number as well
    // So similarlly we can print index and values in Kotlin

    for((index, value) in listOfnums.withIndex()){
        println("Index is $index and value is $value")
    }

    //Lets go for a map in kotlin which has key value pair
    //Tree map is a Java Class and we have to Import Java.util.* package
    var employees = TreeMap<String , Int>()
    employees["Srikanth"] = 1
    employees["Kanth"] = 2

    for ((name , id) in employees){
        println(name+"==="+id)
    }
}