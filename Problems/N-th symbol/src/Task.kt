import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val word = scanner.nextLine()
    val charIndex = scanner.nextInt()
    println("Symbol # $charIndex of the string \"$word\" is '${word[charIndex - 1]}'")
}