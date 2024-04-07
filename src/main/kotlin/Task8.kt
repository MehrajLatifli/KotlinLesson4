fun main() {

    val anyArray = arrayOf<Any>(12, "A", -2.4, "M", 27, "Z", -92.71, "G", 72, "T")
    val randomData: Any

    val currentTime = System.currentTimeMillis()
    val randomIndex = (currentTime % anyArray.count()).toInt()

    randomData = anyArray[randomIndex]

    println("\n Current Time: ${currentTime}")
    println(" Random Index: ${randomIndex}")
    println(" Random data from array: ${randomData}")


}
