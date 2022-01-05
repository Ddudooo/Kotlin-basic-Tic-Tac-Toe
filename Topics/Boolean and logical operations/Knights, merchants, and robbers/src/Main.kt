fun main() {
    val (first, second, confession) = MutableList(3) { readLine().toBoolean() }

    println(first.equals(second).and(confession.not()))
}