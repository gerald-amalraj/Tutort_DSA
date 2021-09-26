package com.tutort.Arrays_W1_CA;

public class MaxElement {

	int maxElement(int[] array) {
		int maxElem = 0;
		if (array.length == 0)
			return -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxElem) {
				maxElem = array[i];
			}
		}
		System.out.println(maxElem);
		return maxElem;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 7 };
		// int[] arr = { 2, 1, 3, 4, 5, 6 };
		// int[] arr = { 12, 11, 11, 4, 5, 6 };
		// int[] arr = { 12, 12, 11, 4, 5, 6 };
		// int[] arr = { 12, 12, 11, 4, 5, 6 };
		new MaxElement().maxElement(arr);

	}

}
