fun main(args: Array<String>) {
    listOf(
        Byte.MAX_VALUE,
        Int.MAX_VALUE,
        Short.MAX_VALUE,
        Long.MAX_VALUE
    ).sortedBy { it.toLong() }.forEach { println(it) }
}