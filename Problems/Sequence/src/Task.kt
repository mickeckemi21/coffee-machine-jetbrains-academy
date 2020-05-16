import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val word1 = scanner.next()
    val word2 = scanner.next()
    val word3 = scanner.next()

    val character1 = word1.first()
    val character2 = word2.first()
    val character3 = word3.first()

    println(character1.isLetter() &&
            character2.isLetter() && (character1 + 1 == character2) &&
            character3.isLetter() && (character1 + 2 == character3))
}