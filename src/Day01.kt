fun main() {
    fun part1(input: List<String>): Int {
        val depths = input.map { it.toInt() }
        return depths.zipWithNext().count { (previous, current) -> current > previous }
    }

    fun part2(input: List<String>): Int {
        val depths = input.map { it.toInt() }
        val windowedSums = depths.windowed(3) { it.sum() }
        return windowedSums.zipWithNext().count { (previous, current) -> current > previous }
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
