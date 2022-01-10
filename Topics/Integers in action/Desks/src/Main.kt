fun main() {
    val total = MutableList(3) { readLine()!!.toInt() }.sumOf { it / 2 + it % 2 }

    println(total)
}