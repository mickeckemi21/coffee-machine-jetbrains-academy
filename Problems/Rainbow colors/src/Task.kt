import java.util.Scanner

enum class RainbowColor(val color: String) {
    BLUE("blue"),
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    PURPLE("purple"),
    CYAN("cyan"),
    AZURE("azure"),
    INDIGO("indigo"),
    VIOLET("violet");

    companion object {

        fun isRainbowColor(color: String): Boolean {
            return values().any { it.color == color }
        }

    }

}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val color = input.next()
    println(RainbowColor.isRainbowColor(color))
}