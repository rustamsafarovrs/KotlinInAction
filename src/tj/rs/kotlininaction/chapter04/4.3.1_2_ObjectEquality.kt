package tj.rs.kotlininaction.chapter04.p2

/**
 * @author Rustam Safarov(RS)
 * created at 10.03.2020
 */

class Client(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun toString(): String {
        return "Client(name=$name, postalCode=$postalCode)"
    }
}

fun main(args: Array<String>) {
    val client1 = Client("Alice", 1212)
    val client2 = Client("Alice", 1212)
    println(client1 == client2)
    println(client1.hashCode())
    println(client2.hashCode())
}