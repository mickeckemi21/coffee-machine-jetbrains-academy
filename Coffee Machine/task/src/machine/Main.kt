package machine

import java.util.*

enum class Action {
    EXIT, REMAINING, FILL, BUY, TAKE
}

class CoffeeMachine
constructor (
        private val scanner: Scanner) {

    companion object {
        var water: Int = 550
        var milk: Int = 540
        var coffeeBeans: Int = 120
        var disposableCups: Int = 9
        var money: Int = 550
    }

    fun execute(action: String) {
        when (Action.valueOf(action.toUpperCase())) {
            Action.EXIT -> return
            Action.REMAINING -> printState()
            Action.FILL -> fill()
            Action.BUY -> buy()
            Action.TAKE -> take()
        }
    }

    private fun printState() {
        println()
        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$coffeeBeans of coffee beans")
        println("$disposableCups of disposable cups")
        if (money == 0) {
            println("$money of money")
        } else {
            println("$$money of money")
        }

        println()
    }

    private fun fill() {
        println()
        print("Write how many ml of water do you want to add: ")
        water += scanner.nextInt()
        print("Write how many ml of milk do you want to add: ")
        milk += scanner.nextInt()
        print("Write how many grams of coffee beans do you want to add: ")
        coffeeBeans += scanner.nextInt()
        print("Write how many disposable cups of coffee do you want to add: ")
        disposableCups += scanner.nextInt()
        println()
    }

    private fun buy() {
        println()
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
        when (scanner.next()) {
            "1" -> {
                if (!validateWater(250)) {
                    println("Sorry, not enough water!")
                    return
                }
                water -= 250
                if (!validateCoffeeBeans(16)) {
                    println("Sorry, not enough coffee beans!")
                    return
                }
                coffeeBeans -= 16
                if (!validateDisposableCups(1)) {
                    println("Sorry, not enough disposable cups!")
                    return
                }
                disposableCups -= 1
                money += 4
            }
            "2" -> {
                if (!validateWater(350)) {
                    println("Sorry, not enough water!")
                    return
                }
                water -= 350
                if (!validateMilk(75)) {
                    println("Sorry, not enough milk!")
                    return
                }
                milk -= 75
                if (!validateCoffeeBeans(20)) {
                    println("Sorry, not enough coffee beans!")
                    return
                }
                coffeeBeans -= 20
                if (!validateDisposableCups(1)) {
                    println("Sorry, not enough disposable cups!")
                    return
                }
                disposableCups -= 1
                money += 7
            }
            "3" -> {
                if (!validateWater(200)) {
                    println("Sorry, not enough water!")
                    return
                }
                water -= 200
                if (!validateMilk(100)) {
                    println("Sorry, not enough milk!")
                    return
                }
                milk -= 100
                if (!validateCoffeeBeans(12)) {
                    println("Sorry, not enough coffee beans!")
                    return
                }
                coffeeBeans -= 12
                if (!validateDisposableCups(1)) {
                    println("Sorry, not enough disposable cups!")
                    return
                }
                disposableCups -= 1
                money += 6
            }
            "back" -> return
        }
        println("I have enough resources, making you a coffee!")
        println()
    }

    private fun take() {
        println()
        println("I gave you $$money")
        money -= money
        println()
    }

    private fun validateWater(value: Int): Boolean {
        return water >= value
    }

    private fun validateMilk(value: Int): Boolean {
        return milk >= value
    }

    private fun validateCoffeeBeans(value: Int): Boolean {
        return coffeeBeans >= value
    }

    private fun validateDisposableCups(value: Int): Boolean {
        return disposableCups >= value
    }

}

fun main() {
    val scanner = Scanner(System.`in`)
    val coffeeMachine = CoffeeMachine(scanner)

    // Init state of machine
    loop@ while (true) {
        if (!hasAction(scanner)) {
            break
        }
        coffeeMachine.execute(scanner.next())
    }
}

fun hasAction(scanner: Scanner): Boolean {
    print("Write action (buy, fill, take, remaining, exit): ")
    return scanner.hasNext()
}
