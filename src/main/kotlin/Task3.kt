import java.util.*

fun main() {

    var number: Double = 0.0

    var scanner = Scanner(System.`in`)

    print("Enter number: ")
    number = scanner.nextDouble();

    if (number > 0) {
        println("Positive number")
    } else if (number < 0) {
        println("Negative number")
    } else {
        println("Equal to zero")
    }

}