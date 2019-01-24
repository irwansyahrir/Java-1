package com.sorts;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import src.main.java.com.sorts.HeapSort;

public class HeapSortTest
{

    @Test
    public void heapSortTest()
    {
        HeapSort heapSort = new HeapSort();

        Integer[] unsortedInt = new Integer[]{0, 5, 9, 2, 1, 3, 4, 8, 6, 7};
        Integer[] sortedInt = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(sortedInt, heapSort.sort(unsortedInt));

        Character[] unsortedChar = new Character[]{'f', 'h', 'c', 'a', 'b', 'd', 'g', 'e'};
        Character[] sortedChar = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        assertArrayEquals(sortedChar, heapSort.sort(unsortedChar));
    }
}
