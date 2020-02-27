package tj.rs.kotlininaction.chapter04.dayh

/**
 * @author Rustam Safarov(RS)
 * created at 27.02.2020
 */

fun getFacebookName(accountId: Int) = "fb:$accountId"

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)
}

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
}