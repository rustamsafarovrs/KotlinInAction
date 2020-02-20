package tj.rs.kotlininaction.chapter03

/**
 * @author Rustam Safarov(RS)
 * created at 20.02.2020
 */

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
//    val list = listOf(1,2,3,4)
//    println(list.joinToString(separator = "; ",
//        prefix= "(",
//        postfix = ")"
//        ))

    //sample 2
    val list = arrayListOf(1, 2, 3, 4)
    println(list.joinToString(" "))
}