import java.util.Scanner

fun main(){
    var scanner=Scanner(System.`in`)

    println("Enter your name:")
    var name= readln()
    println("My name is "+name)

    println("Enter an integer:")
    var num=scanner.nextInt()
    println("Entered "+ num)

    println("Enter your float:")
    var number=scanner.nextFloat()
    println("Entered "+number)
}