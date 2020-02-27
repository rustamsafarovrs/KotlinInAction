package tj.rs.kotlininaction.chapter04.new

/**
 * @author Rustam Safarov(RS)
 * created at 27.02.2020
 */

class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
            Address was changed for $name:
                "$field -> "$value".""".trimIndent()
            )
            field = value
        }
}

fun main(args: Array<String>) {
    val user = User("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenche"
}