import kotlin.test.Test
import kotlin.test.assertEquals

class StubTest {
    @Test
    fun assertNumbers_ok() {
        assertEquals(4, 2*2)
    }

    @Test
    fun assertStrings_ok() {
        assertEquals("Hello world", "Hello " + "world")
    }

}