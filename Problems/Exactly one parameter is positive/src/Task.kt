import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    val number3 = scanner.nextInt()
    
    println((isPositive(number1) && !isPositive(number2) && !isPositive(number3)) || 
            (!isPositive(number1) && isPositive(number2) && !isPositive(number3)) ||
            (!isPositive(number1) && !isPositive(number2) && isPositive(number3)))
}

private fun isPositive(number: Int): Boolean {
    return number > 0
}
