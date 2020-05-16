import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val amount = scanner.nextInt()
    var amountToSpend = 0
    var lastAmountToSpend = 0
    while (scanner.hasNextInt()) {
        lastAmountToSpend = scanner.nextInt()
        amountToSpend += lastAmountToSpend
    }

    if (amount >= amountToSpend) {
        println("Thank you for choosing us to manage your account! You have ${amount - amountToSpend} money.")
    } else {
        println("Error, insufficient funds for the purchase. You have ${amount - (amountToSpend - lastAmountToSpend)}, but you need ${lastAmountToSpend}.")
    }
}