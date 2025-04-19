fun main() {
    // Nullable variable
    var name: String? = null

    // 1. Safe call: ?. — won’t crash if null
    println("Length: ${name?.length}") // Output: null

    // 2. Elvis operator: ?: — provide default value if null
    val length = name?.length ?: 0
    println("Length using Elvis: $length") // Output: 0

    // 3. Using 'let' to do something only if NOT null
    name = "Kotlin Learner"
    name?.let {
        println("Hello, $it! Your name is ${it.length} characters long.")
    }



}