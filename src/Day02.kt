fun main() {
    fun part1(input: List<String>): Int {
        var depth = 0;
        var distance = 0;

        for (line in input) {
            var parsedLine = line.split(" ");
            var instruction = parsedLine[0];
            var instructionValue = parsedLine[1].toInt();

            when(instruction) {
                "forward" -> distance += instructionValue
                "down" -> depth += instructionValue
                "up" -> depth -= instructionValue
            }
        }

        return depth * distance;
    }

    fun part2(input: List<String>): Int {
        var depth = 0;
        var distance = 0;
        var aim = 0;

        for (line in input) {
            var parsedLine = line.split(" ");
            var instruction = parsedLine[0];
            var instructionValue = parsedLine[1].toInt();

            when(instruction) {
                "forward" -> {
                    distance += instructionValue
                    depth += instructionValue*aim
                }
                "down" -> aim += instructionValue
                "up" -> aim -= instructionValue
            }
        }

        return depth * distance;
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
