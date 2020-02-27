package tj.rs.kotlininaction.chapter04

/**
 * @author Rustam Safarov(RS)
 * created at 27.02.2020
 */

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }

}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}