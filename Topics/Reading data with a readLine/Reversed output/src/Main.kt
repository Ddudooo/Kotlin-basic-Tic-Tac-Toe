fun main() {
    val inputStrs = mutableListOf<String>()
    for (i in 1..2) {
        inputStrs.add(readLine()!!)
    }
    inputStrs.reversed().map { println(it) }
}