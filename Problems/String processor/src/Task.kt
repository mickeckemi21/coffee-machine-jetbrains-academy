import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val text1 = scanner.next()
    val operation = scanner.next()
    val text2 = scanner.next()
    when (operation) {
        "equals" -> println(text1 == text2)
        "plus" -> println(text1 + text2)
        "endsWith" -> println(text1.endsWith(text2))
        else -> println("Unknown operation")
    }

}