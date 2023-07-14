import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter Number of Terms :-> ")

    var n:Int = reader.nextInt()
    var t1 = 0
    var t2 = 1

    print("First $n terms: ")

    for (i in 1..n) {
        print("$t1 ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}