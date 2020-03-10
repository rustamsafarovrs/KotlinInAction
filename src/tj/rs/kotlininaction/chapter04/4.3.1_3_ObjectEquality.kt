package tj.rs.kotlininaction.chapter04.p3

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

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

fun main(args: Array<String>) {
    val processed = hashSetOf(Client("Alice", 342562))
    println(processed.contains(Client("Alice", 342562)))
}
