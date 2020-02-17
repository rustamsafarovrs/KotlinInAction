package tj.rs.kotlininaction.chapter02

/**
 * @author Rustam Safarov(RS)
 * created at 17.02.2020
 */

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
    println(isLetter('q'))
    println(isNotDigit('x'))
}