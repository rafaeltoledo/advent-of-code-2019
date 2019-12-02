import java.io.File

fun main() {
    val value = File("01.input").readText().split("\n").toList()
        .map { calculateFuel(it.toInt()) }.sum()
    println(value)
}

fun calculateFuel(mass: Int): Int {
    val value: Int = mass / 3 - 2
    if (value <= 0) return 0


    return value + calculateFuel(value)
}