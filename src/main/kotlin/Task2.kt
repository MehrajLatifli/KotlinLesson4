import java.util.Scanner

fun main() {

    var number:Double =0.0

    var scanner = Scanner(System.`in`)

    while (true)
    {
        print("Enter number: ")
        number = scanner.nextDouble();

        if (number%2==0.0 && number>0)
        {
            println("even numbers")
        }
        else if(number%2!=0.0 && number>0){
            println("odd numbers")
        }
        else{
            println("Number cannot be equal to zero\n")
            break
        }
    }
}
