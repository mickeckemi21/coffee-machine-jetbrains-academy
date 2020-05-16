import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var pair: Pair<Int, Int> = Pair(Int.MIN_VALUE, 0)
    var i = 1
    while (scanner.hasNextInt()) {
        val number = scanner.nextInt()
        if (number > pair.first) {
            pair = pair.copy(number, i)
        }
        i++
    }
    println("${pair.first} ${pair.second}")
}