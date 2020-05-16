import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number = scanner.nextInt()
    if (number % 2 == 0) {
        println("Divided by 2")
        if (number % 3 == 0) {
            println("Divided by 3")
            println("Divided by 6")
        }
        if (number % 5 == 0) {
            println("Divided by 5")
        }
    } else if (number % 3 == 0) {
        println("Divided by 3")
        if (number % 5 == 0) {
            print("Divided by 5")
        }
    } else if (number % 5 == 0) {
        println("Divided by 5")
    }
}
