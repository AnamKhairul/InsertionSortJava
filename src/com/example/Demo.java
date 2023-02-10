package com.example;

public class Demo {

	public static void main(String[] args) {
		int[] data = {7, -7, -3, 3, 4, -4, 9, -9, 1, 0, -1, -5, 5, 8, -8, -2, 2, 6, -6};

		InsertionSort is = new InsertionSort();

		// Sort ascending
		int[] result1 = is.sort(data, true);
		for (int i = 0; i < result1.length; i++) {
			System.out.print(result1[i]+", ");
		}

		System.out.println();
		
		// Sort descending
		int[] result2 = is.sort(data, false);
		for (int i = 0; i < result2.length; i++) {
			System.out.print(result2[i]+", ");
		}
	}
}
