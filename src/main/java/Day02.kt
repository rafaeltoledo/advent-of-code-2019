import java.io.File

fun main() {

    val expectedResult = 19690720
    val max = 144 // the max index in the input file

    for (i in 0..max) {
        for (j in i..max) {
            val input = File("02.input").readText().split(",").map { it.toInt() }.toMutableList()
            input[1] = i
            input[2] = j
            val result = handle(input)[0]
            if (result == expectedResult) {
                println("noun: $i\nverb: $j\nresult: ${100 * i + j}")
            }
        }
    }
}

fun handle(list: MutableList<Int>): List<Int> {
    for (i in list.indices step 4) {
        when {
            list[i] == 1 -> {
                try {
                    list[list[i + 3]] = list[list[i + 1]] + list[list[i + 2]]
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            list[i] == 2 -> {
                list[list[i + 3]] = list[list[i + 1]] * list[list[i + 2]]
            }
            list[i] == 99 -> return list.toList()
        }
    }

    return list.toList()
}
