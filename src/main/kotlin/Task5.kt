import java.util.*

fun main() {


    var scanner = Scanner(System.`in`)
    var numberarray = arrayOf<Double>(0.0, 0.0, 0.0, 0.0)

    for ((index, item) in numberarray.withIndex()) {
        print("${index + 1}) Enter: ")

        var data = scanner.nextDouble();


        while (true) {
            if (!numberarray.contains(data)) {

                numberarray[index] = data
                break
            }
            else {

                print("${index + 1}) Enter: ")
                data = scanner.nextDouble()
            }

        }

    }

    for ((index, item) in numberarray.withIndex()) {
        println("Index: ${index}; Item: ${item} ")
    }
}



