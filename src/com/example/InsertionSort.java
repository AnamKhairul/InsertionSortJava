package com.example;

public class InsertionSort {

	public int[] sort(int[] input, boolean order) {
		if (input.length <= 0) return input;
		
		// Copy elements into a local array
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			output[i] = input[i];
		}
		
		for (int i = 1; i < output.length; i++) {
			int value = output[i];
			int j = i - 1;
			
			if (order) { // Sort ascending
				while (j >= 0 && value < output[j]) {
					output[j+1] = output[j];
					j--;
				}
			} else { // Sort descending
				while (j >= 0 && value > output[j]) {
					output[j+1] = output[j];
					j--;
				}
			}
			
			output[j+1] = value;
		}

		return output;
	}
}
