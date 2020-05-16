import java.util.*

enum class Currency(val desc: String) {
    EURO("Euro"),
    CFA("CFA franc"),
    ECD("Eastern Caribbean dollar"),
    CAD("Canadian dollar"),
    AUD("Australian dollar"),
    BRA("Brazilian real")
}

data class Country(val name: String, val currency: Currency)

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val countries = listOf(
            Country("Germany", Currency.EURO),
            Country("Mali", Currency.CFA),
            Country("Dominica", Currency.ECD),
            Country("Canada", Currency.CAD),
            Country("Spain", Currency.EURO),
            Country("Australia", Currency.AUD),
            Country("Brazil", Currency.BRA),
            Country("Senegal", Currency.CFA),
            Country("France", Currency.EURO),
            Country("Grenada", Currency.ECD),
            Country("Kiribati", Currency.AUD)
    )

    val firstCountryName = input.next()
    val secondCountryName = input.next()

    val firstCountry = countries.firstOrNull { it.name == firstCountryName }
    val secondCountry = countries.firstOrNull { it.name == secondCountryName }

    if (firstCountry?.currency == secondCountry?.currency) println("true") else println("false")

}