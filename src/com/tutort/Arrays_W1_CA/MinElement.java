package com.tutort.Arrays_W1_CA;

public class MinElement {

	int minElement(int[] array) {
		if (array.length == 0)
			return -1;
		int minElem = array[0];
		for (int i = 0; i < array.length ; i++) {
			if (array[i] < minElem){
				minElem = array[i];
			}
		}
		System.out.println(minElem);
		return minElem;
	}

	public static void main(String[] args) {

		// int[] arr = { 1, 2, 3, 4, 5, 7 };
		//int[] arr = { 2, 7, 3, 4, 5, 6 };
		//int[] arr = { 12, 11, 11, 4, 5, 6 };
		//int[] arr = { 12, 12, 11, 4, 5, 6, 3 };
		int[] arr = { 12, 12, 11, 4, 5, 6, 1 };
		new MinElement().minElement(arr);

	}

}
