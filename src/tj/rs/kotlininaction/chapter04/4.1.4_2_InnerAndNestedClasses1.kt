package tj.rs.kotlininaction.chapter04

/**
 * @author Rustam Safarov(RS)
 * created at 27.02.2020
 */


class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}