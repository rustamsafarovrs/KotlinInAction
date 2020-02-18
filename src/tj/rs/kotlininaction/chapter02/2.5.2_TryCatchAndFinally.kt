package tj.rs.kotlininaction.ch02

import java.io.BufferedReader
import java.io.StringReader

/**
 * @author Rustam Safarov(RS)
 * created at 17.02.2020
 */

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
    print(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("string"))
    readNumber(reader)
}