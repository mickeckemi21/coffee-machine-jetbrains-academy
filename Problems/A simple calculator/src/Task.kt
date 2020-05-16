import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val number1 = scanner.nextLong()
    val operation = scanner.next()
    val number2 = scanner.nextLong()
    when (operation) {
        "+" -> println(number1 + number2)
        "-" -> println(number1 - number2)
        "/" -> if (number2 == 0L) println("Division by 0!") else println(number1 / number2)
        "*" -> println(number1 * number2)
        else -> println("Unknown operator")
    }
}
