import java.lang.Math.cbrt
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val population = scanner.nextLong()
    println(cbrt(population.toDouble()).toLong())
}