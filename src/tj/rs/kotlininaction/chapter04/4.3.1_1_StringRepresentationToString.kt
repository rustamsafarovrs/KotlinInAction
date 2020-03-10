package tj.rs.kotlininaction.chapter04

/**
 * @author Rustam Safarov(RS)
 * created at 28.02.2020
 */

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name = $name, postalCode = $postalCode)"
}

fun main(args: Array<String>) {
    val client1 = Client("Alice", 342121)
    println(client1)
}