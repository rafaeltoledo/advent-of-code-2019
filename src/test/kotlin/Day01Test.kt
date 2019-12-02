import kotlin.test.Test
import kotlin.test.assertEquals

class Day01Test {

    @Test
    fun scenarios() {
        assertEquals(2, calculateFuel(12))
        assertEquals(2, calculateFuel(14))
        assertEquals(966, calculateFuel(1969))
        assertEquals(50346, calculateFuel(100756))
    }
}