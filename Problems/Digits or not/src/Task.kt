import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val character1 = scanner.next()
    val character2 = scanner.next()
    val character3 = scanner.next()
    val character4 = scanner.next()
    
    println("${character1.first().isDigit()}\\${character2.first().isDigit()}\\${character3.first().isDigit()}\\${character4.first().isDigit()}")
}
