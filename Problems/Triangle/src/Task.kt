import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    val biggestSide = if (a >= b) if (a >= c) a else c else if (b >= c) b else c
    println(if (biggestSide == a) {
        if (b + c > a) "YES" else "NO"
    } else if (biggestSide == b) {
        if (a + c > b) "YES" else "NO"
    } else {
        if (a + b > c) "YES" else "NO"
    })
}
