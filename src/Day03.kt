import java.math.BigDecimal

fun main() {
    fun getBit(bits: List<Int>, mostSignificant: Boolean): Int {
        val zeroes = bits.count { it == 0 }
        val ones = bits.count { it == 1 }

        if (ones > zeroes && mostSignificant) {
            return 1
        }

        if (zeroes > ones && !mostSignificant) {
            return 1
        }

        return 0
    }

    fun part1(input: List<String>): Int {
        var gammaRate = ""
        var epsilonRate = ""
        for (i in 0..input[0].length - 1) {
            gammaRate += getBit(input.map { it[i].digitToInt() }, true)
            epsilonRate += getBit(input.map { it[i].digitToInt() }, false)
        }

        return gammaRate.toInt(2) * epsilonRate.toInt(2)
    }

    fun part2(input: List<String>): Int {
        return 2
    }

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}
