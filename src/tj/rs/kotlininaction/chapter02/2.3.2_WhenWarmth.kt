package tj.rs.kotlininaction.chapter02


import tj.rs.kotlininaction.chapter02.Color.*

/**
 * @author Rustam Safarov(RS)
 * created at 05.02.2020
 */

fun getWarmth(color: Color) = when (color) {
    RED, ORANGE, YELLOW -> "теплый"
    GREEN -> "нейтральный"
    BLUE, INDIGO, VIOLET -> "холодный"

}

fun main(args: Array<String>) {
    println(getWarmth(ORANGE))
}