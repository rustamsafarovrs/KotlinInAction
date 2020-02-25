package tj.rs.kotlininaction.chapter04

/**
 * @author Rustam Safarov(RS)
 * created at 25.02.2020
 */

interface Clickable {
    // simple method
    fun click()

    // default method implementation
    fun showOff() {
        println("I`m clickable!")
    }
}

interface Focusable {
    fun setFocus(b: Boolean) {
        println("I ${if (b) "got" else "lost"} focus.")
    }

    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {
    override fun click() {
        println("I was clicked")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    val b = Button()
    b.showOff()
    b.setFocus(true)
    b.click()
}