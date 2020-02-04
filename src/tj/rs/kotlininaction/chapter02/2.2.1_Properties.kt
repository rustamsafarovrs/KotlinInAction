package tj.rs.kotlininaction.chapter02

/**
 * @author Rustam Safarov(RS)
 * created at 04.02.2020
 */

class Person(
    val name: String,
    var isMarried: Boolean
)

fun main(args: Array<String>) {
    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)
}