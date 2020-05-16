class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            if (value < -92 || value > 57) {
                when (name) {
                    "Dubai" -> field = 30
                    "Moscow" -> field = 5
                    "Hanoi" -> field = 20
                }
            } else {
                field = value
            }
        }
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    //implement comparing here
    if (firstCity.degrees == secondCity.degrees ||
        firstCity.degrees == thirdCity.degrees ||
        secondCity.degrees == thirdCity.degrees) {
            println("neither")
    } else if (firstCity.degrees < secondCity.degrees) {
        if (firstCity.degrees < thirdCity.degrees) {
            println(firstCity.name)
        } else {
            println(thirdCity.name)
        }
    } else {
        if (secondCity.degrees < thirdCity.degrees) {
            println(secondCity.name)
        } else {
            println(thirdCity.name)
        }
    }
}
