package tj.rs.kotlininaction.chapter02

import java.io.BufferedReader
import java.io.StringReader

/**
 * @author Rustam Safarov(RS)
 * created at 17.02.2020
 */

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("15"))
    println(readNumber(reader))
}