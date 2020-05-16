import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val xBox1 = scanner.nextInt()
    val yBox1 = scanner.nextInt()
    val zBox1 = scanner.nextInt()

    val xBox2 = scanner.nextInt()
    val yBox2 = scanner.nextInt()
    val zBox2 = scanner.nextInt()

    if (xBox1 == 0 || yBox1 == 0 || zBox1 == 0 ||
        xBox2 == 0 || yBox2 == 0 || zBox2 == 0) {
        println("Incomparable")
        return
    }

    val smallestSizeBox2: Int
    val middleSizeBox2: Int
    val greatestSizeBox2: Int
    if (xBox2 <= yBox2) {
        if (xBox2 <= zBox2) {
            smallestSizeBox2 = xBox2
            if (yBox2 <= zBox2) {
                middleSizeBox2 = yBox2
                greatestSizeBox2 = zBox2
            } else {
                middleSizeBox2 = zBox2
                greatestSizeBox2 = yBox2
            }
        } else {
            smallestSizeBox2 = zBox2
            middleSizeBox2 = xBox2
            greatestSizeBox2 = yBox2
        }
    } else {
        if (xBox2 <= zBox2) {
            greatestSizeBox2 = zBox2
            middleSizeBox2 = xBox2
            smallestSizeBox2 = yBox2
        } else {
            greatestSizeBox2 = xBox2
            if (yBox2 <= zBox2) {
                middleSizeBox2 = zBox2
                smallestSizeBox2 = yBox2
            } else {
                middleSizeBox2 = yBox2
                smallestSizeBox2 = zBox2
            }
        }
    }

    val smallestSizeBox1: Int
    val middleSizeBox1: Int
    val greatestSizeBox1: Int
    if (xBox1 <= yBox1) {
        if (xBox1 <= zBox1) {
            smallestSizeBox1 = xBox1
            if (yBox1 <= zBox1) {
                middleSizeBox1 = yBox1
                greatestSizeBox1 = zBox1
            } else {
                greatestSizeBox1 = zBox1
                middleSizeBox1 = yBox1
            }
        } else {
            smallestSizeBox1 = zBox1
            middleSizeBox1 = xBox1
            greatestSizeBox1 = yBox1
        }
    } else {
        if (xBox1 <= zBox1) {
            greatestSizeBox1 = zBox1
            middleSizeBox1 = xBox1
            smallestSizeBox1 = yBox1
        } else {
            greatestSizeBox1 = xBox1
            if (yBox1 <= zBox1) {
                smallestSizeBox1 = yBox1
                middleSizeBox1 = zBox1
            } else {
                smallestSizeBox1 = zBox1
                middleSizeBox1 = yBox1
            }
        }
    }

    if (smallestSizeBox1 - smallestSizeBox2 == 0 &&
        middleSizeBox1 - middleSizeBox2 == 0 &&
        greatestSizeBox1 - greatestSizeBox2 == 0) {
        println("Box 1 = Box 2")
    } else if (smallestSizeBox1 - smallestSizeBox2 <= 0 &&
                middleSizeBox1 - middleSizeBox2 <= 0 &&
                greatestSizeBox1 - greatestSizeBox2 <= 0) {
        println("Box 1 < Box 2")
    } else if (smallestSizeBox1 - smallestSizeBox2 >= 0 &&
            middleSizeBox1 - middleSizeBox2 >= 0 &&
            greatestSizeBox1 - greatestSizeBox2 >= 0) {
        println("Box 1 > Box 2")
    } else {
        println("Incomparable")
    }
}