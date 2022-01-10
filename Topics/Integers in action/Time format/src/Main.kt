import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    val date = Date(totalSeconds)
    val dateFormat = SimpleDateFormat("kk:m:s")
    println(dateFormat.format(date))
}