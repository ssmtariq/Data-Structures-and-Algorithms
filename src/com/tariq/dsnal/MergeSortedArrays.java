package com.tariq.dsnal;

import java.util.Objects;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] array1 = { 0, 3, 4, 31 };
		int[] array2 = { 4, 6, 30 };
		int[] resultArray = mergeArrays(array1, array2);
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + ",");
		}
	}

	public static int[] mergeArrays(int[] array1, int[] array2) {
		if (Objects.isNull(array1))
			return array2;
		if (Objects.isNull(array2))
			return array1;
		int[] mergedArray = new int[array1.length + array2.length];
		int j = 0, k = 0;
		for (int i = 0; i < mergedArray.length; i++) {
			if (j < array1.length && (k == array2.length || array1[j] < array2[k])) {
				mergedArray[i] = array1[j];
				j++;
			} else if (k < array2.length) {
				mergedArray[i] = array2[k];
				k++;
			}
		}
		return mergedArray;
	}

	public static int[] mergeArrays2(int[] array1, int[] array2) {
		if (Objects.isNull(array1))
			return array2;
		if (Objects.isNull(array2))
			return array1;
		int[] mergedArray = new int[array1.length + array2.length];
		int i = 0, j = 0, index = 0;
		Integer itemOfArray1 = array1[i];
		Integer itemOfArray2 = array2[i];

		while (Objects.nonNull(itemOfArray1) || Objects.nonNull(itemOfArray2) && index < mergedArray.length) {
			if (Objects.isNull(itemOfArray1) && Objects.isNull(itemOfArray2)) {
				return mergedArray;
			} else if (Objects.isNull(itemOfArray1) && Objects.nonNull(itemOfArray2)) {
				mergedArray[index] = itemOfArray2;
				index++;
				j++;
				itemOfArray2 = array2[j];
			} else if (Objects.isNull(itemOfArray2) && Objects.nonNull(itemOfArray1)) {
				mergedArray[index] = itemOfArray1;
				index++;
				i++;
				if (i < array1.length) {
					itemOfArray1 = array1[i];
				} else {
					itemOfArray1 = null;
				}
			} else if (itemOfArray1 < itemOfArray2) {
				mergedArray[index] = itemOfArray1;
				index++;
				i++;
				itemOfArray1 = array1[i];
			} else {
				mergedArray[index] = itemOfArray2;
				index++;
				j++;
				if (j < array2.length) {
					itemOfArray2 = array2[j];
				} else {
					itemOfArray2 = null;
				}
			}
		}
		return mergedArray;
	}
}
