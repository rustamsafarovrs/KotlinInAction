package tj.rs.kotlininaction.chapter02

import java.util.*

/**
 * @author Rustam Safarov(RS)
 * created at 17.02.2020
 */

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}