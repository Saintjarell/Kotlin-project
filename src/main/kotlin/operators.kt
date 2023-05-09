// Arithmetic Operators
fun main(){
    var number:Int=25
    var num1:Int=6

    println(number+num1)
    println(number/num1)
    println(number*num1)
    println(number-num1)
    println(number%num1)
    // modulus

    //Assignment operators
    var x=5
    println(x)

    var y=3
    y+=7
    println(y)

    var a=78
    a-=5
    println(a)
  //Comparison operators
    var num2:Int=100
    println(num2<20)
    println(num2>10)
    println(num2==30)
    println(num2<=30)
    println(num2>=30)
    println(num2!=30)

    //Logical operators
    var myNumber=90
    println(myNumber<100 && myNumber==30) //And
    println(myNumber<100 || myNumber==30) //Or
    println(!(myNumber<100 || myNumber==30)) //Not
}