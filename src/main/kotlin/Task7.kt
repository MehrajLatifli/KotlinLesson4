fun main() {

    var numberArray = arrayOf<Double>(21.5, -5.2, 7.1, -4.19, 0.0, -65.251, 6.0, -21.5)
    var tempArray = arrayOf<Double>(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)


    // Bubble sort

    for (i in 0 until numberArray.count() - 1) {

        for (j in 0 until numberArray.count() - i - 1) {

            if (numberArray[j] > numberArray[j + 1]) {

                val temp = numberArray[j]
                numberArray[j] = numberArray[j + 1]
                numberArray[j + 1] = temp
            }
        }
    }

    for ((index, item) in numberArray.withIndex()) {

        tempArray[index] = numberArray[index]
    }

    for ((index, item) in tempArray.withIndex()) {

        println("Index: ${index}; Item: ${item} ")
    }


}