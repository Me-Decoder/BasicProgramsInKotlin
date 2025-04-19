fun main(){
    //List of Number
    val list = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    //Even and Odd Filter
    val even = filterevens(list){it % 2 == 0}
    val odd = filterodds(list){it % 2 == 1}
    //List of Fruits
    val fruits = listOf("apple", "banana", "cherry", "date", "elderberry")
    print(fruits)

    //String Input
    print("Choose from it one\n")
    val input = readLine()
    //Function Call
    isinornot(input,fruits){input in fruits}
}

fun isinornot(
    string: String?,
    strings: List<String>,
    function: () -> Boolean
) {
    if (function()) {
        println("'$string' is in the list.")
    } else {
        println("'$string' is not in the list.")
    }
}

fun filterodds(ints: MutableList<Int>, function: (Int) -> Boolean) {
    for (i in ints) {
        if (function(i)) {
            println(i)
        }
    }
}

fun filterevens(ints: MutableList<Int>, condition: (Int) -> kotlin.Boolean) {
    for (i in ints) {
        if (condition(i)) {
            println(i)
        }
    }
}
