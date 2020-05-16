import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number = scanner.nextInt()
    var i = 1
    var length = 0
    while (true) {
        if (length + i > number) {
            repeat(number - length) {
                print("$i ")
            }
            break
        }
        repeat(i) {
            print("$i ")
            length++
        }
        i++
    }
}