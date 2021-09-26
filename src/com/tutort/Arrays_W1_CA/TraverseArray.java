package com.tutort.Arrays_W1_CA;

public class TraverseArray {

	public void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7 };
		new TraverseArray().printArray(arr);

	}
}
