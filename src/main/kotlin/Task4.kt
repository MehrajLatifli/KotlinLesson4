import java.util.*

fun main() {

    var scanner = Scanner(System.`in`)
    var numberarray = arrayOfNulls<Double>(10)

    for ((index, item) in numberarray.withIndex()) {
        print("${index + 1}) Enter: ")

        var data = scanner.nextDouble();
        numberarray[index] = data;
    }

    for ((index, item) in numberarray.withIndex()) {
        println("Index: ${index}; Item: ${item} ")
    }

    val filteredArray = numberarray.filterNotNull()

    if (filteredArray.isNotEmpty()) {
        println("Max: ${filteredArray.maxOrNull()}")
        println("Min: ${filteredArray.minOrNull()}")
        println("First: ${filteredArray.firstOrNull()}")
        println("Last: ${filteredArray.lastOrNull()}")
    } else {
        println("Array is empty!")
    }

}