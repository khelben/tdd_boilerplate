import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

class HelloWorldTest() {

    @Test
    fun test() {
        assertEquals("Booo", HelloWorld.value())
    }
}