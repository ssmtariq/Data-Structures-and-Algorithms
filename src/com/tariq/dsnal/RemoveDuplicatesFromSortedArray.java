package com.tariq.dsnal;

public class RemoveDuplicatesFromSortedArray {

	/**
	 * LeetCode RemoveDuplicatesFromSortedArray problem link
	 * 
	 * @see <a href=
	 *      "https://leetcode.com/problems/remove-duplicates-from-sorted-array/">RemoveDuplicatesFromSortedArray</a>
	 */
	public static void main(String[] args) {
		// Test Inputs
//		int[] nums = {1,1,2};
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
//		int[] nums = {1,1,2};
		System.out.println(removeDuplicates(nums));
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
	}

	public static int removeDuplicates(int[] nums) {
		int i = 0;
		int j = i+1;
		while (j < nums.length) {
			if(nums[i] == nums[j]) {
				j++;
			}else {
				nums[i+1]=nums[j];
				i++;
				j++;
			}
		}
		i=1;
		while (i < nums.length) {
			if (nums[i-1] < nums[i]) {
				i++;
			}else {
				break;
			}
		}
		return i;
	}
}
