package tj.rs.kotlininaction.chapter02

/**
 * @author Rustam Safarov(RS)
 * created at 04.02.2020
 */

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
}