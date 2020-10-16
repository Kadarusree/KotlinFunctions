fun main(){
  //for converting String to Int we use parseInt Method of Integer in java
    //lets try an example
    var str : String = "4"
   // var num : Int = str //This will not work
    var num = str.toInt();//This toInt Fun uses Integer.parseInt internally
    num = Integer.parseInt(str)
    println("Integer Value is $num")
    //if we change value of str to a string
  //  str = "4a"
  //  num = str.toInt() this will give java.lang.NumberFormatException: For input string: "4a"
    //This can be resolved by using try keyword... Exception handling
    var str2 = "4a"
    var num2 : Int

    try {
        num2 = str2.toInt();
    }
    catch (e : NumberFormatException){
        println("Input is not proper")
    }
    //is there anything more in java?
    //We can use try as an expression like below

    var str3 : String = "13"
    var num3 : Int = try {
        str3.toInt()
    }
    catch (e : Exception){
        -1
    }
    println("Try as an Expression Returns : $num3")
}