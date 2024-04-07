import java.util.*

fun main() {
    var numberarray = arrayOf<Double>(2.5, -5.2, 3.5, -4.1, 0.0)


    for ((index, item) in numberarray.withIndex()) {

        for ((index2, item2) in numberarray.withIndex()) {

            if(numberarray[index]<numberarray[index2])
            {
                var temp = numberarray[index]
                numberarray[index]=numberarray[index2]
                numberarray[index2]=temp
            }
        }

    }

    for ((index, item) in numberarray.withIndex()) {
        println("Index: ${index}; Item: ${item} ")
    }
}