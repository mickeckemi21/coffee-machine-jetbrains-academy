import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var sum = 0
    while (true) {
        val number = scanner.nextInt()
        if (number == 0) break
        sum += number
    }
    println(sum)
}
