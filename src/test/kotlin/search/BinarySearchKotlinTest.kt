package search

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinarySearchKotlinTest {
    @Test
    internal fun testBinarySearchWithNumbers() {
        val numbers = arrayOf(1, 2, 3, 4, 5)
        assertEquals(2, BinarySearch.findIndex(numbers, 3))
        assertEquals(-1, BinarySearch.findIndex(numbers, 8))
    }

    @Test
    internal fun binarySearchWithChars() {
        val characters = arrayOf("a", "b", "c")
        assertEquals(2, BinarySearch.findIndex(characters, "c"))
    }

    @Test
    internal fun binarySearchWithWords() {
        val words = arrayOf("satu", "dua", "tiga", "empat")
        assertEquals(1, BinarySearch.findIndex(words, "dua"))
        assertEquals(-1, BinarySearch.findIndex(words, "dualima"))
    }

    @Test
    internal fun binarySearchWithEmptyArray() {
        assertEquals(-1, BinarySearch.findIndex(emptyArray<String>(), "1"))
    }
}
