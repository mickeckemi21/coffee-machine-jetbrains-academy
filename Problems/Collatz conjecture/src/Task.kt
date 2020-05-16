import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var number = scanner.nextInt()
    while (true) {
        print("$number ")
        if (number == 1) {
            break
        }
        number = if (number % 2 == 1) {
            number * 3 + 1
        } else {
            number / 2
        }
    }
}
