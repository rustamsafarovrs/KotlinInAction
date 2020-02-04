package tj.rs.kotlininaction.chapter02

/**
 * @author Rustam Safarov(RS)
 * created at 04.02.2020
 */

fun main(args: Array<String>) {
    println("max: " + max(3, 5))
}

private fun max(a: Int, b: Int): Int = if (a > b) a else b
