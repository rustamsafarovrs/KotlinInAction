package tj.rs.kotlininaction.chapter03

/**
 * @author Rustam Safarov(RS)
 * created at 18.02.2020
 */



fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(strings.joinToString(list, "; ", "( ", ")"))
}