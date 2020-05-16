import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val character = scanner.next()

    val firstCharacter = character.first()
    println((firstCharacter.isLetter() && firstCharacter.isUpperCase()) || (firstCharacter in '1'..'9'))
}