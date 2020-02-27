package tj.rs.kotlininaction.chapter04.das


/**
 * @author Rustam Safarov(RS)
 * created at 26.02.2020
 */
import java.io.Serializable

interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) { /*...*/
    }

    class ButtonState : State { /*...*/ }
}