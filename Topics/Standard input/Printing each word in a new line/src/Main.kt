import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    while(scanner.hasNextLine()){
        println(scanner.nextLine().split(" ").joinToString("\n"))
    }
}