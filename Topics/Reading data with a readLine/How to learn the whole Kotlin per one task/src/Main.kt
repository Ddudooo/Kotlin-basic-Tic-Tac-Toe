fun main() {
    var inputStrs = mutableListOf<String>()
    for (i in 1..5) {
        inputStrs.add(readLine()!!)
    }
    println(inputStrs.joinToString(" "))
}