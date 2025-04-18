fun main(){
    var guess: Int
    var answer : Int = (1..100).random()
    var counter = 0

    print("\uD83C\uDFAF Welcome to the Number Guessing Game!\n")
    print("Guess a number between 1 and 100\n")

    do {
        print("Guess The number\n")
        guess = readLine()!!.toInt()
        counter++
            when{
                guess<answer -> println("Too Low\n")
                guess>answer -> println("Too High\n")
                else -> println("🎉 Correct! You guessed it in $counter attempts.")
            }
    }while(guess!=answer)

}

