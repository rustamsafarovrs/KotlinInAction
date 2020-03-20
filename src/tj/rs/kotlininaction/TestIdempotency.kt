package tj.rs.kotlininaction

/**
 * @author Rustam Safarov(RS)
 * created at 20.03.2020
 */

fun main(args: Array<String>) {
    testIsIdempotency()
}

private var test = 1

fun testIsIdempotency() {
    test()
    val check = test
}

fun test(): Int {
    test++
    return test
}