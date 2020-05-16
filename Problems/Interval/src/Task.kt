import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val number = scanner.nextInt()
    println(if ((number > -15 && number <= 12) || (number > 14 && number < 17) || (number >= 19)) "True" else "False")
}