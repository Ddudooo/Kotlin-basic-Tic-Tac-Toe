fun main() {
    val time = readLine()!!.timeFormat()
    val date = readLine()!!.dateFormat()
    println("$time $date")
}

fun String.timeFormat() = split(" ").joinToString(":")
fun String.dateFormat() = split(" ").joinToString("/")