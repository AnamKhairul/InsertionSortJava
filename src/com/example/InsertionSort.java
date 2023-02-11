package com.example;

public class InsertionSort {

	public int[] sort(int[] input, boolean order) {
		if (input.length <= 0) return input;
		
		// Create an array for sorted elements
		// Eventually it is returned
		int[] output = new int[input.length];
		
		if (order) { // Sort ascending
			for (int i = 0; i < input.length; i++) {
				int value = input[i];
				int j = i - 1;
				while (j >= 0 && value < output[j]) {
					output[j+1] = output[j];
					j--;
				}
				output[j+1] = value;
			}
		} else { // Sort descending
			for (int i = 0; i < input.length; i++) {
				int value = input[i];
				int j = i - 1;
				while (j >= 0 && value > output[j]) {
					output[j+1] = output[j];
					j--;
				}
				output[j+1] = value;
			}
		}
		
		return output;
	}
}
