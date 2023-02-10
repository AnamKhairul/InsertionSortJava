package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

	@Test
	void testSortEmpty() {
		InsertionSort is = new InsertionSort();
		int[] input = new int[0];
		int[] output = is.sort(input, true);
		assertEquals(output.length, 0);
	}

	@Test
	void testSortAscending() {
		InsertionSort is = new InsertionSort();
		int[] input = {5, 3, 7};
		int[] output = is.sort(input, true);
		assertEquals(output[0], 3);
	}
	
	@Test
	void testSortDescending() {
		InsertionSort is = new InsertionSort();
		int[] input = {5, 3, 7};
		int[] output = is.sort(input, true);
		assertEquals(output[0], 7);
	}

}
