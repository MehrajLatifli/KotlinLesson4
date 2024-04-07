import java.util.Scanner

fun main()
{
    var scanner = Scanner(System.`in`)

    var usd = 1.7
    var tl =18.84
    var amount =0.0
    var currency=0

    print("Enter amount: ")
    amount=scanner.nextDouble()

    print("Enter currency: ")
    currency=scanner.nextInt()

    when(currency) {

        1 -> print("AZN TO USD = ${amount*usd}")
        2 -> print("AZN TO TL = ${amount*tl}")

        else -> print("False choose")
    }}