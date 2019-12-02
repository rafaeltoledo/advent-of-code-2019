import com.google.common.truth.Truth.assertThat
import kotlin.test.Test

class Day02Test {

    @Test
    fun case00() {
        assertThat(handle(mutableListOf(1, 9, 10, 3, 2, 3, 11, 0, 99, 30, 40, 50))).containsExactly(
            3500, 9, 10, 70,
            2, 3, 11, 0,
            99,
            30, 40, 50
        )
    }

    @Test
    fun case01() {
        assertThat(handle(mutableListOf(1, 0, 0, 0, 99))).containsExactly(2, 0, 0, 0, 99)
    }

    @Test
    fun case02() {
        assertThat(handle(mutableListOf(2, 3, 0, 3, 99))).containsExactly(2, 3, 0, 6, 99)
    }

    @Test
    fun case03() {
        assertThat(handle(mutableListOf(2, 4, 4, 5, 99, 0))).containsExactly(2, 4, 4, 5, 99, 9801)
    }

    @Test
    fun case04() {
        assertThat(handle(mutableListOf(1, 1, 1, 4, 99, 5, 6, 0, 99))).containsExactly(30, 1, 1, 4, 2, 5, 6, 0, 99)
    }
}