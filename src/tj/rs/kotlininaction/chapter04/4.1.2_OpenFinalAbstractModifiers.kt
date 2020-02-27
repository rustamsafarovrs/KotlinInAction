package tj.rs.kotlininaction.chapter04

/**
 * @author Rustam Safarov(RS)
 * created at 26.02.2020
 */

open class RichButton : Clickable {
    fun disable() {}
    open fun animate() {}
    override fun click() {}
}
