import java.util.Scanner

enum class RainbowColor(val color: String) {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    PURPLE("indigo"),
    VIOLET("violet");

    companion object {
        fun order(color: String): Int {
            return values().first { it.color == color }.ordinal + 1
        }
    }

}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val color = input.next()
    println(RainbowColor.order(color))

}