import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    println(if (abs(x1 - x2) == 1 && abs(y1 - y2) == 2) {
        "YES"
    } else if (abs(x1 - x2) == 2 && abs(y1 - y2) == 1) {
        "YES"
    } else {
        "NO"
    })
}