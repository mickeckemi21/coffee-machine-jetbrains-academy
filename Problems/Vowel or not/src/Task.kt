import java.util.Scanner

// write your function here

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}

fun isVowel(letter: Char) =
    letter.toLowerCase() == 'a' ||
        letter.toLowerCase() == 'e' ||
        letter.toLowerCase() == 'i' ||
        letter.toLowerCase() == 'o' ||
        letter.toLowerCase() == 'u'