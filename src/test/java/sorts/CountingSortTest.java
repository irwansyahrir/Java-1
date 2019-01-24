package sorts;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class CountingSortTest {

    @Test
    public void testCountingSort() {

        CountingSort countingSort = new CountingSort();

        // Unsorted integer array
        Integer[] unsorted = new Integer[]{1, 4, 1, 2, 7, 5, 2};

        // Sorted integer array
        Integer[] sorted = new Integer[]{1, 1, 2, 2, 4, 5, 7};

        // Comparing the two integer arrays
        assertArrayEquals(sorted, countingSort.sort(unsorted));
    }
}
