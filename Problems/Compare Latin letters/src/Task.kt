import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val character1 = scanner.next()
    val character2 = scanner.next()

    println(character1.first().toLowerCase() == character2.first().toLowerCase())
}