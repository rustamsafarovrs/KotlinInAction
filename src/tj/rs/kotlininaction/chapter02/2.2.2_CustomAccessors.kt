package tj.rs.kotlininaction.chapter02

import java.util.*

/**
 * @author Rustam Safarov(RS)
 * created at 05.02.2020
 */

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun main(args: Array<String>) {
//    val rectangle = Rectangle(31, 21)
//    println(rectangle.isSquare)
    println(createRandomRectangle().isSquare)
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}
