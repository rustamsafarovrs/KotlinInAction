package tj.rs.kotlininaction.chapter04.dha

/**
 * @author Rustam Safarov(RS)
 * created at 27.02.2020
 */

interface User {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}