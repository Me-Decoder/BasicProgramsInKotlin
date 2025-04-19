fun main(){

    //Use of Filter
    val numbers = listOf(1, 2, 3, 4, 5,6,7,8,9,10)
    val evenNumber = numbers.filter { it % 2 == 0 }
    val oddnumber = numbers.filter { it % 2 == 1 }
    print(evenNumber)
    print(oddnumber)


    //use of map
    val fruite = listOf("apple", "banana", "cherry", "date", "elderberry")
    val fruitLength = fruite.map { it.length }
    val fruitUpper = fruite.map { it.uppercase() }
    print(fruitLength)
    print(fruitUpper)

    //use of reduce
    val numbers3 = listOf(1, 2, 3, 4, 5)
    val sum = numbers3.reduce { acc, number -> acc + number }
    print(sum)

    // forEach
    fruite.forEach { println(it) }


    //use of sorted
    val numbers1 = listOf(5, 2, 8, 1, 9)
    val sortedNumbers = numbers1.sorted()
    print(sortedNumbers)

    //use of reversed
    val numbers2 = listOf(1, 2, 3, 4, 5)
    val reversedNumbers = numbers2.reversed()
    print(reversedNumbers)

    //use of zip
    val list1 = listOf("a", "b", "c")
    val list2 = listOf(1, 2, 3)
    val zippedList = list1.zip(list2)
    print(zippedList)

    //use of take
    val numbers4 = listOf(1, 2, 3, 4, 5)
    val firstThreeNumbers = numbers4.take(3)
    print(firstThreeNumbers)

    //use of drop
    val numbers5 = listOf(1, 2, 3, 4, 5)
    val remainingNumbers = numbers5.drop(2)
    print(remainingNumbers)

    //use of takeLast
    val numbers6 = listOf(1, 2, 3, 4, 5)
    val lastThreeNumbers = numbers6.takeLast(3)
    print(lastThreeNumbers)

    //use of dropLast
    val numbers7 = listOf(1, 2, 3, 4, 5)
    val remainingNumbers2 = numbers7.dropLast(2)
    print(remainingNumbers2)

    // Find
    val numbers8 = listOf(1, 2, 3, 4, 5)
    val firstEvenNumber = numbers8.find { it % 2 == 0 }
    print(firstEvenNumber)

    //Combination of the Functions
    val finalResult = numbers
        .filter { it > 2 }
        .map { it * it }
        .reduce { acc, i -> acc + i }
    println("Combined Result: $finalResult")



}