fun main(){

    val student = listOf(
        Pair("Alice", 76),
        Pair("Bob", 35),
        Pair("Charlie", 62),
        Pair("David", 28),
        Pair("Eva", 90),
        Pair("Frank", 45),
        Pair("Grace", 38)
    )

    val passed = student.filter{it.second >= 50}

    val failed = student.filter { it.second < 50  }

    val PassedStudentsUppercase = passed.map { it.first.uppercase() }

    val passavarage = passed.map { it.second }.average()

    val top3 = student.sortedByDescending { it.second }.take(3)

    //Group by pass or fail
    val group = student.groupBy { if (it.second >= 50) "Passed" else "Failed" }

    println("✅ Passed Students: ${passed.map { it.first }}")
    println("❌ Failed Students: ${failed.map { it.first }}")
    println("🔠 Passed Uppercase: $PassedStudentsUppercase")
    println("📊 Average Marks: $passavarage")
    println("🏆 Top 3 Scorers: $top3")
    println("🧩 Grouped: $group")



}