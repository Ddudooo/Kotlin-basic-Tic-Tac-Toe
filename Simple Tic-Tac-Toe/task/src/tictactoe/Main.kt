package tictactoe

class Board(
    val input: String
) {
    override fun toString(): String {
        val stones = input.toMutableList()
        val result = mutableListOf<String>()
        val prePostFix = "---------"
        for (i: Int in 0..6 step(3)) {
            result.add(stones.subList(i,i+3).joinToString(" ", prefix = "| ", postfix = " |\n"))
        }
        return result.joinToString("", "$prePostFix\n", prePostFix)
    }
}

fun main() {
    print("Enter cells: ")
    val inputString = readLine()!!
    println(Board(inputString))
}