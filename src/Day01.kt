fun main() {
    fun part1(input: List<String>): Int {
        val depths = input.map(String::toInt);
        var previousDepth = 0;
        var depthIncreases = 0;
        for (depth in depths) {
            if (depth > previousDepth) {
                depthIncreases++;
            }
            previousDepth = depth;
        }

        return depthIncreases - 1;
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
