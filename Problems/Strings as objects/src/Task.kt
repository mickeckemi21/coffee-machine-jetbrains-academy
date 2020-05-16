import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    if (!scanner.hasNext()) {
        return
    }
    val input = scanner.next()
    // write code here
    when(input.first()) {
        'i' -> println(input.drop(1).toInt() + 1)
        's' -> println(input.drop(1).reversed())
        else -> println(input)
    }
}