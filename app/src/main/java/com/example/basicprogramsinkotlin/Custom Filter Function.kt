fun main(){
    val list = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    val even = filterevens(list){it % 2 == 0}
    val odd = filterodds(list){it % 2 == 1}
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
