package search

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinarySearchKotlinTest {
    @Test
    internal fun testBinarySearch() {
        val array = arrayOf(1, 2, 3, 4, 5)
        assertEquals(2, BinarySearch.findIndex(array, 3))
    }
}
