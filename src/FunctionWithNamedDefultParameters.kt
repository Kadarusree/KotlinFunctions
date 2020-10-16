@file:JvmName("Interest")
fun main(){
    //This is new concept in Kotlin... Functions with Default and named parameters
    var total = calucalteAmount(100)
    println("Total amount is $total")
    //Lets increase interest
    var newAmount = calucalteAmount(1000, 0.5f) //This will replace default value
    println("New Amount is $newAmount")

    //For above 2 types of method you have two create two diff mwthods in Java
    //But how do you call same function in java weither you pass  argument or 2 arguments
    //By defauly java func asks for 2 arugumets
    //This can be resolved by adding a annotation before function @JVMOverloads
    //Check it in MyJavaClass.java
    //It executes but confusion which is default and which is compulsary parameter
    //For this reason we will go to function with named parameters
    //We call it with named arguments
    var namedparamResult = calucalteAmount(intrest = 0.6f, principle = 300)
    println("Result of named parm = $namedparamResult")

    //This not there in Java and it will not work in java


}

//Function with Default parameter
@JvmOverloads
fun calucalteAmount(principle : Int, intrest : Float = 0.25f) : Int{
    return  principle + (principle * intrest).toInt()
}
